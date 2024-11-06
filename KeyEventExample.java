import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventExample extends JFrame implements KeyListener {
    private JTextArea textArea;

    public KeyEventExample() {
        // Set up the frame
        setTitle("KeyEvent Example");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create text area
        textArea = new JTextArea();
        textArea.addKeyListener(this);
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        // Make the frame visible
        setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        textArea.append("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()) + "\n");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        textArea.append("Key Released: " + KeyEvent.getKeyText(e.getKeyCode()) + "\n");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        textArea.append("Key Typed: " + e.getKeyChar() + "\n");
    }

    public static void main(String[] args) {
        new KeyEventExample();
    }
}
