import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 /* <APPLET CODE ="keyevent.class" WIDTH=300 HEIGHT=200> </APPLET> */ 
public class KeyEventApplet extends JApplet implements KeyListener {

    JTextField t, tt, tp, tr;

    public void init() {
        // Set the layout of the Applet to a simple layout
        setLayout(new FlowLayout());

        // Create the text fields
        t = new JTextField(20);
        tt = new JTextField(70);
        tp = new JTextField(70);
        tr = new JTextField(70);

        // Add KeyListener to the main text field
        t.addKeyListener(this);

        // Add components to the content pane
        getContentPane().add(t);
        getContentPane().add(tt);
        getContentPane().add(tp);
        getContentPane().add(tr);
    }

    // KeyTyped event handling
    public void keyTyped(KeyEvent e) {
        tt.setText("Key Typed: " + e.getKeyChar());
    }

    // KeyReleased event handling
    public void keyReleased(KeyEvent e) {
        tr.setText("Key Released: " + e.getKeyCode());
    }

    // KeyPressed event handling
    public void keyPressed(KeyEvent e) {
        String s;
        // Check if any function keys (F1, F2, F3) are pressed
        if (e.getKeyCode() == KeyEvent.VK_F1) {
            tp.setText("Key Pressed: F1 (Code: " + e.getKeyCode() + ")");
        }
        if (e.getKeyCode() == KeyEvent.VK_F2) {
            tp.setText("Key Pressed: F2 (Code: " + e.getKeyCode() + ")");
        }
        if (e.getKeyCode() == KeyEvent.VK_F3) {
            tp.setText("Key Pressed: F3 (Code: " + e.getKeyCode() + ")");
        }
    }
}
