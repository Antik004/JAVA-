import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    private JTextField textField;
    private String operator;
    private double num1, num2, result;

    public Calculator() {
        // Set up the frame
        setTitle("Calculator");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create text field
        textField = new JTextField();
        add(textField, BorderLayout.NORTH);

        // Create buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.addActionListener(this);
            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);

        // Set up exception handling
        Thread.setDefaultUncaughtExceptionHandler((t, e) -> JOptionPane.showMessageDialog(null, e.getMessage()));

        // Make the frame visible
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        try {
            switch (command) {
                case "=":
                    num2 = Double.parseDouble(textField.getText());
                    switch (operator) {
                        case "+":
                            result = num1 + num2;
                            break;
                        case "-":
                            result = num1 - num2;
                            break;
                        case "*":
                            result = num1 * num2;
                            break;
                        case "/":
                            result = num1 / num2;
                            break;
                    }
                    textField.setText(String.valueOf(result));
                    operator = "";
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                    num1 = Double.parseDouble(textField.getText());
                    operator = command;
                    textField.setText("");
                    break;
                default:
                    textField.setText(textField.getText() + command);
                    break;
            }
        } catch (NumberFormatException ex) {
            textField.setText("Error");
            JOptionPane.showMessageDialog(this, "Invalid input!", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException ex) {
            textField.setText("Error");
            JOptionPane.showMessageDialog(this, "Arithmetic error!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
