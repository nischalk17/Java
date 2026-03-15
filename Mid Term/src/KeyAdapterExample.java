import javax.swing.*;
import java.awt.event.*;

public class KeyAdapterExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("KeyAdapter Example");
        JTextField textField = new JTextField();
        textField.setBounds(50, 50, 200, 30);

        JLabel label = new JLabel("Press any key...");
        label.setBounds(50, 100, 200, 30);

        // Attach KeyAdapter to the text field
        textField.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                label.setText("Key Pressed: " + e.getKeyChar());
            }
        });

        frame.add(textField);
        frame.add(label);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
