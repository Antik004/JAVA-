import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Appletsum extends JFrame implements ActionListener {
    private JButton button1, button2, button3, button4;
    private int a, b, c;

    public Appletsum() {
        setLayout(new FlowLayout());

        button1 = new JButton("Sum");
        button2 = new JButton("Subtract");
        button3 = new JButton("Mul");
        button4 = new JButton("Div");

        add(button1);
        add(button2);
        add(button3);
        add(button4);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);

        String one = JOptionPane.showInputDialog("Enter 1st number");
        String two = JOptionPane.showInputDialog("Enter 2nd number");

        a = Integer.parseInt(one);
        b = Integer.parseInt(two);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            c = a + b;
        } else if (e.getSource() == button2) {
            c = a - b;
        } else if (e.getSource() == button3) {
            c = a * b;
        } else if (e.getSource() == button4) {
            c = a / b;
        }

        JOptionPane.showMessageDialog(null, "Result: " + c);
    }

    public static void main(String[] args) {
        new Appletsum();
    }
}
