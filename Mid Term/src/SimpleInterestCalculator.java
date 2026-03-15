import javax.swing.*;
import java.awt.event.*;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        // Create a window (JFrame) with title
        JFrame frame = new JFrame("Simple Interest Calculator");
        frame.setSize(400, 400); // Set frame size
        frame.setLayout(null);   // Use absolute positioning (x, y)

        // Create Labels for input fields
        JLabel l1 = new JLabel("Principal (P):");
        l1.setBounds(50, 50, 120, 25);
        frame.add(l1);

        JLabel l2 = new JLabel("Rate (R %):");
        l2.setBounds(50, 100, 120, 25);
        frame.add(l2);

        JLabel l3 = new JLabel("Time (T yrs):");
        l3.setBounds(50, 150, 120, 25);
        frame.add(l3);

        // Label to display result
        JLabel result = new JLabel("Simple Interest: ");
        result.setBounds(50, 250, 300, 25);
        frame.add(result);

        // Create text fields for user input
        JTextField t1 = new JTextField(); // Principal
        t1.setBounds(180, 50, 150, 25);
        frame.add(t1);

        JTextField t2 = new JTextField(); // Rate
        t2.setBounds(180, 100, 150, 25);
        frame.add(t2);

        JTextField t3 = new JTextField(); // Time
        t3.setBounds(180, 150, 150, 25);
        frame.add(t3);

        // Button to calculate interest
        JButton calcButton = new JButton("Calculate");
        calcButton.setBounds(130, 200, 120, 30);
        frame.add(calcButton);

        // Add click event to the button
        calcButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Read input from text fields and convert to double
                    double p = Double.parseDouble(t1.getText()); // Principal
                    double r = Double.parseDouble(t2.getText()); // Rate
                    double t = Double.parseDouble(t3.getText()); // Time

                    // Calculate simple interest
                    double si = (p * r * t) / 100;

                    // Display result
                    result.setText("Simple Interest: " + si);
                } catch (Exception ex) {
                    // Handle invalid input
                    result.setText("Please enter valid numbers.");
                }
            }
        });

        // Close program when window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }
}
