//Example: Using MouseAdapter to detect click on a label

import javax.swing.*;
import java.awt.event.*;

public class MouseAdapterExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MouseAdapter Example");
        JLabel label = new JLabel("Click me!");
        label.setBounds(100, 100, 150, 30);

        // Add MouseAdapter to label
        label.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                label.setText("Label Clicked!");
            }
        });

        frame.add(label);
        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
