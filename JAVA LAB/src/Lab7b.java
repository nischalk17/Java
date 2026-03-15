import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Lab7b {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Page");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        frame.setLocationRelativeTo(null);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JLabel userLabel = new JLabel("Username:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(userLabel, gbc);
        JTextField userText = new JTextField(15);
        gbc.gridx = 1;
        gbc.gridy = 0;
        frame.add(userText, gbc);
        JLabel passLabel = new JLabel("Password:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(passLabel, gbc);
        JPasswordField passText = new JPasswordField(15);
        gbc.gridx = 1;
        gbc.gridy = 1;
        frame.add(passText, gbc);
        JButton loginButton = new JButton("Login");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        frame.add(loginButton, gbc);
        JLabel messageLabel = new JLabel("", SwingConstants.CENTER);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        frame.add(messageLabel, gbc);
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = new String(passText.getPassword());

                if (username.equals("nischal") && password.equals("nischal")) {
                    messageLabel.setText("Login Successful!");
                    messageLabel.setForeground(Color.GREEN);
                } else {
                    messageLabel.setText("Invalid Username or Password");
                    messageLabel.setForeground(Color.RED);
                }
            }
        });
        frame.setVisible(true);
    }
}
