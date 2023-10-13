/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class RouteHandler {
    // This methods create the lines to be used
    public static List<RouteLine> createRouteLines() {
        // Entradas y salidas
        Node l1 = new Node("l1", 90, 175);
        Node l2 = new Node("l2", 165, 118);
        Node l3 = new Node("l3", 75, 278);
        Node l4 = new Node("l4", 45, 400);
        Node l5 = new Node("l5", 280, 250);
        Node l6 = new Node("l6", 188, 448);
        Node l7 = new Node("l7", 322, 62);
        Node l8 = new Node("l8", 287, 510);
        Node l9 = new Node("l9", 398, 25);
        Node l10 = new Node("l10", 449, 146);
        Node l11 = new Node("l11", 410, 413);
        Node l12 = new Node("l12", 487, 369);
        Node l13 = new Node("l13", 553, 423);
        Node l14 = new Node("l14", 571, 513);
        Node l15 = new Node("l15", 583, 38);
        Node l16 = new Node("l16", 560, 178);
        Node l17 = new Node("l17", 565, 208);
        Node l18 = new Node("l18", 585, 320);
        Node l19 = new Node("l19", 712, 94);
        Node l20 = new Node("l20", 772, 134);
        Node l21 = new Node("l21", 707, 227);
        Node l22 = new Node("l22", 710, 409);
        Node l23 = new Node("l23", 868, 130);
        Node l24 = new Node("l24", 860, 309);
        Node l25 = new Node("l25", 808, 531);
        
        
        // Calles
        Node n1 = new Node("n1", 158, 28);
        Node n2 = new Node("n2", 248, 68);
        Node n3 = new Node("n3", 317, 100);
        Node n4 = new Node("n4", 342, 65);
        Node n5 = new Node("n5", 382, 16);
        Node n6 = new Node("n6", 568, 28);
        Node n7 = new Node("n7", 145, 120);
        Node n8 = new Node("n8", 42, 190);
        Node n9 = new Node("n9", 90, 199);
        Node n10 = new Node("n10", 130, 205);
        Node n11 = new Node("n11", 190, 195);
        Node n12 = new Node("n12", 300, 168);
        Node n13 = new Node("n13", 358, 151);
        Node n14 = new Node("n14", 375, 146);
        Node n15 = new Node("n15", 439, 126);
        Node n16 = new Node("n16", 473, 116);
        Node n17 = new Node("n17", 518, 100);
        Node n18 = new Node("n18", 662, 114);
        Node n19 = new Node("n19", 712, 114);
        Node n20 = new Node("n20", 772, 114);
        Node n21 = new Node("n21", 818, 114);
        Node n22 = new Node("n22", 868, 114);
        Node n23 = new Node("n23", 40, 278);
        Node n24 = new Node("n24", 302, 250);
        Node n25 = new Node("n25", 486, 164);
        Node n26 = new Node("n26", 540, 183);
        Node n27 = new Node("n27", 545, 213);
        Node n28 = new Node("n28", 556, 278);
        Node n29 = new Node("n29", 663, 249);
        Node n30 = new Node("n30", 707, 247);
        Node n31 = new Node("n31", 819, 247);
        Node n32 = new Node("n32", 433, 340);
        Node n33 = new Node("n33", 565, 325);
        Node n34 = new Node("n34", 840, 311);
        Node n35 = new Node("n35", 40, 362);
        Node n36 = new Node("n36", 198, 364);
        Node n37 = new Node("n37", 307, 362);
        Node n38 = new Node("n38", 327, 364);
        Node n39 = new Node("n39", 383, 361);
        Node n40 = new Node("n40", 413, 380);
        Node n41 = new Node("n41", 446, 400);
        Node n42 = new Node("n42", 490, 389);
        Node n43 = new Node("n43", 578, 370);
        Node n44 = new Node("n44", 663, 350);
        Node n45 = new Node("n45", 772, 350);
        Node n46 = new Node("n46", 851, 348);
        Node n47 = new Node("n47", 58, 385);
        Node n48 = new Node("n48", 180, 424);
        Node n49 = new Node("n49", 168, 444);
        Node n50 = new Node("n50", 390, 407);
        Node n51 = new Node("n51", 145, 475);
        Node n52 = new Node("n52", 200, 532);
        Node n53 = new Node("n53", 307, 520);
        Node n54 = new Node("n54", 326, 496);
        Node n55 = new Node("n55", 463, 467);
        Node n56 = new Node("n56", 558, 443);
        Node n57 = new Node("n57", 592, 434);
        Node n58 = new Node("n58", 657, 421);
        Node n59 = new Node("n59", 704, 429);
        Node n60 = new Node("n60", 772, 449);
        Node n61 = new Node("n61", 820, 449);
        Node n62 = new Node("n62", 905, 468);
        Node n63 = new Node("n63", 482, 547);
        Node n64 = new Node("n64", 574, 525);
        Node n65 = new Node("n65", 615, 516);
        Node n66 = new Node("n66", 679, 498);
        Node n67 = new Node("n67", 772, 491);
        Node n68 = new Node("n68", 809, 489);
        Node n69 = new Node("n69", 895, 490);
        Node n70 = new Node("n70", 788, 527);
        
        
        // Create the list of routelines 
        List<RouteLine> routeLines = new ArrayList<>();
        // Add each route line to the list
        // Coordinates must be defined by "test and fail" so that they are drawn correctly on the map
        //The direction of the line doesn't matter, it can be, for example, origin:a destination:b or origin:b destination:a
        routeLines.add(new RouteLine(l1, n9));
        routeLines.add(new RouteLine(l2, n7));
        routeLines.add(new RouteLine(l3, n23));
        routeLines.add(new RouteLine(l4, n47));
        routeLines.add(new RouteLine(l5, n24));
        routeLines.add(new RouteLine(l6, n49));
        routeLines.add(new RouteLine(l7, n4));
        routeLines.add(new RouteLine(l8, n53));
        routeLines.add(new RouteLine(l9, n5));
        routeLines.add(new RouteLine(l10, n15));
        routeLines.add(new RouteLine(l11, n50));
        routeLines.add(new RouteLine(l12, n42));
        routeLines.add(new RouteLine(l13, n56));
        routeLines.add(new RouteLine(l14, n64));
        routeLines.add(new RouteLine(l15, n6));
        routeLines.add(new RouteLine(l16, n26));
        routeLines.add(new RouteLine(l17, n27));
        routeLines.add(new RouteLine(l18, n33));
        routeLines.add(new RouteLine(l19, n19));
        routeLines.add(new RouteLine(l20, n20));
        routeLines.add(new RouteLine(l21, n30));
        routeLines.add(new RouteLine(l22, n59));
        routeLines.add(new RouteLine(l23, n22));
        routeLines.add(new RouteLine(l24, n34));
        routeLines.add(new RouteLine(l25, n70));

        
        routeLines.add(new RouteLine(n1, n2));
        routeLines.add(new RouteLine(n1, n7));
        routeLines.add(new RouteLine(n2, n3));
        routeLines.add(new RouteLine(n3, n4));
        routeLines.add(new RouteLine(n3, n13));
        routeLines.add(new RouteLine(n4, n5));
        routeLines.add(new RouteLine(n8, n9));
        routeLines.add(new RouteLine(n8, n23));
        routeLines.add(new RouteLine(n9, n10));
        routeLines.add(new RouteLine(n10, n11));
        routeLines.add(new RouteLine(n10, n7));
        routeLines.add(new RouteLine(n11, n12));
        routeLines.add(new RouteLine(n11, n36));
        routeLines.add(new RouteLine(n12, n13));
        routeLines.add(new RouteLine(n12, n24));
        routeLines.add(new RouteLine(n13, n14));
        routeLines.add(new RouteLine(n14, n15));
        routeLines.add(new RouteLine(n14, n39));
        routeLines.add(new RouteLine(n15, n16));
        routeLines.add(new RouteLine(n16, n17));
        routeLines.add(new RouteLine(n16, n25));
        routeLines.add(new RouteLine(n17, n6));
        routeLines.add(new RouteLine(n17, n26));
        routeLines.add(new RouteLine(n18, n19));
        routeLines.add(new RouteLine(n18, n29));
        routeLines.add(new RouteLine(n19, n20));
        routeLines.add(new RouteLine(n20, n21));
        routeLines.add(new RouteLine(n21, n22));
        routeLines.add(new RouteLine(n21, n31));
        routeLines.add(new RouteLine(n23, n35));
        routeLines.add(new RouteLine(n24, n37));
        routeLines.add(new RouteLine(n25, n26));
        routeLines.add(new RouteLine(n25, n32));
        routeLines.add(new RouteLine(n26, n27));
        routeLines.add(new RouteLine(n27, n28));
        routeLines.add(new RouteLine(n28, n29));
        routeLines.add(new RouteLine(n28, n33));
        routeLines.add(new RouteLine(n29, n30));
        routeLines.add(new RouteLine(n29, n44));
        routeLines.add(new RouteLine(n30, n31));
        routeLines.add(new RouteLine(n31, n34));
        routeLines.add(new RouteLine(n32, n40));
        routeLines.add(new RouteLine(n33, n43));
        routeLines.add(new RouteLine(n34, n46));
        routeLines.add(new RouteLine(n35, n36));
        routeLines.add(new RouteLine(n35, n47));
        routeLines.add(new RouteLine(n36, n37));
        routeLines.add(new RouteLine(n36, n48));
        routeLines.add(new RouteLine(n37, n38));
        routeLines.add(new RouteLine(n38, n39));
        routeLines.add(new RouteLine(n38, n52));
        routeLines.add(new RouteLine(n39, n50));
        routeLines.add(new RouteLine(n40, n41));
        routeLines.add(new RouteLine(n40, n50));
        routeLines.add(new RouteLine(n41, n42));
        routeLines.add(new RouteLine(n41, n55));
        routeLines.add(new RouteLine(n42, n43));
        routeLines.add(new RouteLine(n43, n44));
        routeLines.add(new RouteLine(n43, n57));
        routeLines.add(new RouteLine(n44, n45));
        routeLines.add(new RouteLine(n44, n58));
        routeLines.add(new RouteLine(n45, n46));
        routeLines.add(new RouteLine(n45, n60));
        routeLines.add(new RouteLine(n46, n61));
        routeLines.add(new RouteLine(n47, n51));
        routeLines.add(new RouteLine(n48, n49));
        routeLines.add(new RouteLine(n49, n51));
        routeLines.add(new RouteLine(n50, n54));
        routeLines.add(new RouteLine(n51, n52));
        routeLines.add(new RouteLine(n53, n54));
        routeLines.add(new RouteLine(n54, n55));
        routeLines.add(new RouteLine(n55, n56));
        routeLines.add(new RouteLine(n55, n63));
        routeLines.add(new RouteLine(n56, n57));
        routeLines.add(new RouteLine(n57, n58));
        routeLines.add(new RouteLine(n57, n65));
        routeLines.add(new RouteLine(n58, n59));
        routeLines.add(new RouteLine(n58, n66));
        routeLines.add(new RouteLine(n59, n60));
        routeLines.add(new RouteLine(n60, n61));
        routeLines.add(new RouteLine(n60, n67));
        routeLines.add(new RouteLine(n61, n62));
        routeLines.add(new RouteLine(n61, n68));
        routeLines.add(new RouteLine(n63, n64));
        routeLines.add(new RouteLine(n64, n65));
        routeLines.add(new RouteLine(n65, n66));
        routeLines.add(new RouteLine(n66, n67));
        routeLines.add(new RouteLine(n67, n68));
        routeLines.add(new RouteLine(n67, n70));
        routeLines.add(new RouteLine(n68, n69));

        return routeLines;
    }
    
    // This method print the route lines by checking if the route line is visible
    public static void printRouteLines(Graphics g, List<RouteLine> routeLines) {
        // for each routeLine in the list of routelines
        for (RouteLine routeLine : routeLines) {
            // verify if the route line is visible
            if (routeLine.getVisible()) {
                // if it is visible then get the coordinates
                int x1 = routeLine.getOrigin().getX();
                int y1 = routeLine.getOrigin().getY();
                int x2 = routeLine.getDestination().getX();
                int y2 = routeLine.getDestination().getY();

                // and then draw the line using the Painter service
                Painter.drawLine(g, x1, y1, x2, y2);
            }
        }
    }
    
    // This method print the location marks for the origin and destination places
    public static void printLocationMarks(Graphics g, String origin, String destination, List<RouteLine> routeLines) {
        // Initialize variables for origin and destination coordinates
        int xOrigin = 0, yOrigin = 0, xDestination = 0, yDestination = 0;

        // Iterate through the list of RouteLine objects
        for (RouteLine routeLine : routeLines) {
            // Get the names of the origin and destination associated with the current RouteLine
            String routeOrigin = routeLine.getOrigin().getName();
            String routeDestination = routeLine.getDestination().getName();

            // Check if the routeOrigin matches the specified origin
            if (routeOrigin.equals(origin)) {
                // Assign the coordinates of the origin point
                xOrigin = routeLine.getOrigin().getX();
                yOrigin = routeLine.getOrigin().getY();
            }

            // Check if the routeDestination matches the specified origin
            if (routeDestination.equals(origin)) {
                // Assign the coordinates of the origin point
                xOrigin = routeLine.getDestination().getX();
                yOrigin = routeLine.getDestination().getY();
            }

            // Check if the routeOrigin matches the specified destination
            if (routeOrigin.equals(destination)) {
                // Assign the coordinates of the destination point
                xDestination = routeLine.getOrigin().getX();
                yDestination = routeLine.getOrigin().getY();
            }

            // Check if the routeDestination matches the specified destination
            if (routeDestination.equals(destination)) {
                // Assign the coordinates of the destination point
                xDestination = routeLine.getDestination().getX();
                yDestination = routeLine.getDestination().getY();
            }
        }

        // Draw a green circle at the origin coordinates
        Painter.drawCircle(g, xOrigin, yOrigin, 3, Color.GREEN);

        // Draw a red circle at the destination coordinates
        Painter.drawCircle(g, xDestination, yDestination, 3, Color.RED);
    }
    
    // This method update the route line visibility if it is in the route returned by prolog
    public static void updateVisibility(List<String> routes, List<RouteLine> routeLines) {
        // restart visibility
        for (RouteLine routeLine : routeLines) {
            routeLine.setVisible(false);
        }
        
        // validate visibility
        for(int i = 0; i < routes.size()-1 ; i++) {
            // Validate in pairs the route nodes to check if there is a route line between them
            String currentRoute = routes.get(i);
            String nextRoute = routes.get(i + 1);

            
            for (RouteLine routeLine : routeLines) {
                // Get the origin and destination of the current route line
                String originName = routeLine.getOrigin().getName();
                String destinationName = routeLine.getDestination().getName();
                
                // check if there is a route line where the origin is the current route and the destination is the next route, or vice versa.
                boolean originCurrentDestinationNext = originName.equals(currentRoute) && destinationName.equals(nextRoute);
                boolean originNextDestinationCurrent = originName.equals(nextRoute) && destinationName.equals(currentRoute);
                
                if (originCurrentDestinationNext || originNextDestinationCurrent) {
                    // If the route line meets the condition, its visibility is updated to true
                    routeLine.setVisible(true);
                } 
            }
        }
    }
}
