import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CaseConvertorApplet extends JFrame implements KeyListener {
    JTextField inputfield, outputfield;

    public CaseConvertorApplet() {
        // Set up the frame and layout
        setLayout(new FlowLayout());

        // Initialize input and output fields
        inputfield = new JTextField(20);
        outputfield = new JTextField(20);
        outputfield.setEditable(false); // Make output field non-editable

        // Add the fields to the frame
        add(inputfield);
        add(outputfield);

        // Add KeyListener to the input field
        inputfield.addKeyListener(this);

        // Set up the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setVisible(true);
    }

    public void keyTyped(KeyEvent e) {
        String input = inputfield.getText();
        StringBuilder output = new StringBuilder();

        // Loop through the input string and convert the case
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) {
                output.append(Character.toLowerCase(c));  // Convert uppercase to lowercase
            } else if (Character.isLowerCase(c)) {
                output.append(Character.toUpperCase(c));  // Convert lowercase to uppercase
            } else {
                output.append(c);  // Keep non-alphabet characters unchanged
            }
        }

        outputfield.setText(output.toString());  // Update the output field with the converted text
    }

    public void keyPressed(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        // Create an instance of the frame
        new CaseConvertorApplet();
    }
}
