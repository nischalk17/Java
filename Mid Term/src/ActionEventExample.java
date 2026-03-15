import javax.swing.*;
import java.awt.event.*;

public class ActionEventExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ActionEvent Example");

        JButton btn1 = new JButton("OK");
        JButton btn2 = new JButton("Cancel");

        btn1.setBounds(50, 50, 100, 30);
        btn2.setBounds(160, 50, 100, 30);

        // Shared listener for both buttons
        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String command = e.getActionCommand(); // Get button text

                if (command.equals("OK")) {
                    System.out.println("OK button clicked");
                } else if (command.equals("Cancel")) {
                    System.out.println("Cancel button clicked");
                }
            }
        };

        btn1.addActionListener(listener);
        btn2.addActionListener(listener);

        frame.add(btn1);
        frame.add(btn2);
        frame.setSize(320, 180);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
