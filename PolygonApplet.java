import javax.swing.*;
import java.awt.*;

public class PolygonApplet extends JApplet {
    
    // Override the paint method to draw and fill the polygon
    public void paint(Graphics g) {
        super.paint(g); // Call to the superclass paint method
        // Set the green color using RGB format
        g.setColor(new Color(0, 255, 0)); // RGB for green
        
        // Define the x and y coordinates for the polygon's vertices
        int[] xPoints = {};
        int[] yPoints = {};
        
        // Draw and fill the polygon
        g.fillPolygon(xPoints, yPoints, xPoints.length);
    }

    // Main method to run the applet in a frame for testing
    public static void main(String[] args) {
        JFrame frame = new JFrame("Polygon Applet");
        PolygonApplet applet = new PolygonApplet();
        
        // Initialize the applet
        applet.init();
        
        // Set up the JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(applet);
        frame.setVisible(true);
    }
}
