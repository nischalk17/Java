//2080 Board Qtn

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class LoginForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");
        frame.setSize(350, 220);
        frame.setLayout(null);

        // Labels
        JLabel userLabel = new JLabel("User ID:");
        userLabel.setBounds(50, 30, 80, 25);
        frame.add(userLabel);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 70, 80, 25);
        frame.add(passLabel);

        // Text fields
        JTextField userField = new JTextField();
        userField.setBounds(140, 30, 150, 25);
        frame.add(userField);

        JPasswordField passField = new JPasswordField();
        passField.setBounds(140, 70, 150, 25);
        frame.add(passField);

        // Buttons
        JButton okBtn = new JButton("OK");
        okBtn.setBounds(60, 120, 80, 30);
        frame.add(okBtn);

        JButton cancelBtn = new JButton("Cancel");
        cancelBtn.setBounds(180, 120, 80, 30);
        frame.add(cancelBtn);

        // Login method
        Runnable loginAction = () -> {
            String uid = userField.getText();
            String pwd = new String(passField.getPassword());

            try {
                // DB connection
                Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/account", "root", "your_password_here"
                );

                String query = "SELECT * FROM user WHERE Uid=? AND Password=?";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, uid);
                pst.setString(2, pwd);

                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(frame, "Login Successful!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid Credentials.");
                }

                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(frame, "Error: " + e.getMessage());
            }
        };

        // Clear method
        Runnable clearAction = () -> {
            userField.setText("");
            passField.setText("");
            userField.requestFocus();
        };

        // Button actions
        okBtn.addActionListener(e -> loginAction.run());
        cancelBtn.addActionListener(e -> clearAction.run());

        // Key event handler
        frame.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == 'l') {
                    loginAction.run();
                } else if (e.getKeyChar() == 'c') {
                    clearAction.run();
                }
            }
        });

        // Focus on frame to capture keys
        frame.setFocusable(true);
        frame.requestFocusInWindow();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
