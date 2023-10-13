/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

// Class that draws figures 
public class Painter {
    // Method to draw a line
    // Receives: 
    //          Graphics g -> Object that allows a component to draw figures
    //          int x1, x2, y1, y1 -> coordinates to draw the line
    public static void drawLine(Graphics g, int x1, int y1, int x2, int y2) {
        // Parse the Graphic object g to a 2D Graphic object to customize the line
        Graphics2D g2 = (Graphics2D) g;
        
        // Set the color of the line
        g2.setColor(Color.BLUE);
        
        // Create the stroke of the line
        // [Dashed line] - Define the dashed stroke pattern (10px line, 5px espacing) --- 
        //float[] dashPattern = {10.0f, 5.0f};
        //BasicStroke dashedStroke = new BasicStroke(2, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10.0f, dashPattern, 0.0f);
        //g2.setStroke(dashedStroke); 
        
        // [Continuous line]
        BasicStroke stroke = new BasicStroke(2);
        g2.setStroke(stroke);

        // Draw the line in its respective coordinates
        g2.drawLine(x1, y1, x2, y2);
    }
    
     public static void drawCircle(Graphics g, int x, int y, int radio, Color color) {
        // Parse the Graphic object g to a 2D Graphic object to customize the line
        Graphics2D g2 = (Graphics2D) g;
        
        // Set the color of the circle
        g2.setColor(color);
        
        
        // Create the stroke of the line
        BasicStroke stroke = new BasicStroke(2);
        g2.setStroke(stroke);
        
        // Create the border and fill the circle centered at the x and y coordinates
        g2.drawOval(x - radio, y - radio, 2 * radio, 2 * radio);
        g2.fillOval(x - radio, y - radio, 2 * radio, 2 * radio);
    }
}
