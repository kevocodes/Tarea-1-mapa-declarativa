/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jpl7.Term;

public class PrologParser {
    // Parse List of prolog Terms to an simple List of Strings
    public static List<String> prologListToJavaList(Term prologList) {
        List <String> javaList = new ArrayList<>();
        for (Term term : prologList.listToTermArray()) {
            javaList.add(term.toString());
        }
        return javaList;
    }
    
    // Parse prolog names like "l13" to a beauty name like "13- ETC"
    public static String prologNamesToBeautyNames(String prologName) {
        Map<String, String> prologToBeautyMap = new HashMap<>();

       prologToBeautyMap.put("l1", "1- CSMET");
       prologToBeautyMap.put("l2", "2- IESJ");
       prologToBeautyMap.put("l3", "3- PMR");
       prologToBeautyMap.put("l4", "4- CDM");
       prologToBeautyMap.put("l5", "5- PEMET");
       prologToBeautyMap.put("l6", "6- GSP");
       prologToBeautyMap.put("l7", "7- CCCP");
       prologToBeautyMap.put("l8", "8- CSMAR");
       prologToBeautyMap.put("l9", "9- CNC");
       prologToBeautyMap.put("l10", "10- ECC");
       prologToBeautyMap.put("l11", "11- PESA");
       prologToBeautyMap.put("l12", "12- HGC");
       prologToBeautyMap.put("l13", "13- ETC");
       prologToBeautyMap.put("l14", "14- MCR");
       prologToBeautyMap.put("l15", "15- ESA");
       prologToBeautyMap.put("l16", "16- HUR");
       prologToBeautyMap.put("l17", "17- PLMET");
       prologToBeautyMap.put("l18", "18- ENVV");
       prologToBeautyMap.put("l19", "19- PDC");
       prologToBeautyMap.put("l20", "20- CCG");
       prologToBeautyMap.put("l21", "21- UCM");
       prologToBeautyMap.put("l22", "22- CMSR");
       prologToBeautyMap.put("l23", "23- GNAC");
       prologToBeautyMap.put("l24", "24- GEST");
       prologToBeautyMap.put("l25", "25- AFI");

       String beautyName = prologToBeautyMap.get(prologName);

       if (beautyName == null) {
           throw new IllegalArgumentException("Prolog name is not valid: " + prologName);
       }

       return beautyName;
    }
    
    // Parse beauty names like "13- ETC" to a prolog name like "l13"
    public static String beautyNamesToPrologNames(String beautyName) {
        Map<String, String> beautyToPrologMap = new HashMap<>();

        beautyToPrologMap.put("1- CSMET", "l1");
        beautyToPrologMap.put("2- IESJ", "l2");
        beautyToPrologMap.put("3- PMR", "l3");
        beautyToPrologMap.put("4- CDM", "l4");
        beautyToPrologMap.put("5- PEMET", "l5");
        beautyToPrologMap.put("6- GSP", "l6");
        beautyToPrologMap.put("7- CCCP", "l7");
        beautyToPrologMap.put("8- CSMAR", "l8");
        beautyToPrologMap.put("9- CNC", "l9");
        beautyToPrologMap.put("10- ECC", "l10");
        beautyToPrologMap.put("11- PESA", "l11");
        beautyToPrologMap.put("12- HGC", "l12");
        beautyToPrologMap.put("13- ETC", "l13");
        beautyToPrologMap.put("14- MCR", "l14");
        beautyToPrologMap.put("15- ESA", "l15");
        beautyToPrologMap.put("16- HUR", "l16");
        beautyToPrologMap.put("17- PLMET", "l17");
        beautyToPrologMap.put("18- ENVV", "l18");
        beautyToPrologMap.put("19- PDC", "l19");
        beautyToPrologMap.put("20- CCG", "l20");
        beautyToPrologMap.put("21- UCM", "l21");
        beautyToPrologMap.put("22- CMSR", "l22");
        beautyToPrologMap.put("23- GNAC", "l23");
        beautyToPrologMap.put("24- GEST", "l24");
        beautyToPrologMap.put("25- AFI", "l25");

        String prologName = beautyToPrologMap.get(beautyName);

        if (prologName == null) {
            throw new IllegalArgumentException("Beauty name is not valid: " + beautyName);
        }

        return prologName;
    }
}
