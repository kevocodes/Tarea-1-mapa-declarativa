/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

public class RouteLine {
    // Line coordinates
    private final Node origin;
    private final Node destination;

    // Property to determinate if the line is visible or not
    private boolean visible;

    public RouteLine(Node origin, Node destination) {
        this.origin = origin;
        this.destination = destination;
        this.visible = false;
    }

    public Node getOrigin() {
        return origin;
    }

    public Node getDestination() {
        return destination;
    }
    
    public boolean getVisible() {
        return this.visible;
    }
    
    public void setVisible(boolean visible) {
        this.visible = visible;
    }
}
