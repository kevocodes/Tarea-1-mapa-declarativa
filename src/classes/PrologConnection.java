/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jpl7.*;

public class PrologConnection {
    private static PrologConnection instance; // Unique instance
    private final Query connection;

    private PrologConnection(String consultToKnoledgeBase) {
        this.connection = new Query(consultToKnoledgeBase);
    }

    public static PrologConnection getInstance(String consultToKnoledgeBase) throws Exception {
        if (instance == null) {
            instance = new PrologConnection(consultToKnoledgeBase);
        }
        return instance;
    }

    public Boolean success() throws Exception {
        return this.connection.hasSolution();
    }
    
    public  List<String> calculateRoute(String origin, String destination) throws Exception {
        String consult = "ir_hacia(" + origin + ", " + destination + ", Route).";
        List<String> route =  new ArrayList<>();

        Query execute = new Query(consult);
        
        if(execute.hasSolution()) {
            Term result = execute.oneSolution().get("Route");

            if (result.isList()) {
                route = PrologParser.prologListToJavaList(result);
            }  
        }
        
        execute.close();
        
        return route;
    }
    
    public List<String> getLocations() throws Exception {
        String consult = "lugar(X)";
        List<String> solutions =  new ArrayList<>();
        
        Query execute = new Query(consult);
        
        while(execute.hasMoreSolutions()) {
            Map<String, Term> solution = execute.nextSolution();
            String location = solution.get("X").toString();
            
            solutions.add(location);
        }
        
        execute.close();
        
        return solutions;
    }
}