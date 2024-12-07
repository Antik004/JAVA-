import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyEventFrame extends JFrame implements KeyListener {
    JTextField t, tt, tp, tr;

    public KeyEventFrame() {
        setLayout(new FlowLayout());

        // Initialize text fields
        t = new JTextField(20);
        tt = new JTextField(20);
        tp = new JTextField(20);
        tr = new JTextField(20);

        // Add text fields to the frame
        add(new JLabel("Type here:"));
        add(t);
        add(new JLabel("Key Typed:"));
        add(tt);
        add(new JLabel("Key Pressed:"));
        add(tp);
        add(new JLabel("Key Released:"));
        add(tr);

        // Add KeyListener to the text field
        t.addKeyListener(this);

        // Set up frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        tt.setText("Key Typed: " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        tp.setText("Key Pressed: " + e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        tr.setText("Key Released: " + (int)e.getKeyChar());
    }

    public static void main(String[] args) {
        new KeyEventFrame();
    }
}
