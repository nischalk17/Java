import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(5, 2, 5, 5)); // rows, cols, hgap, vgap

        // Name
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();

        // Password
        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField();

        // Hobbies
        JLabel hobbyLabel = new JLabel("Hobbies:");
        JPanel hobbyPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JCheckBox cbReading = new JCheckBox("Reading");
        JCheckBox cbMusic = new JCheckBox("Music");
        JCheckBox cbSports = new JCheckBox("Sports");
        hobbyPanel.add(cbReading);
        hobbyPanel.add(cbMusic);
        hobbyPanel.add(cbSports);

        // Gender
        JLabel genderLabel = new JLabel("Gender:");
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JRadioButton rbMale = new JRadioButton("Male");
        JRadioButton rbFemale = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(rbMale);
        genderGroup.add(rbFemale);
        genderPanel.add(rbMale);
        genderPanel.add(rbFemale);

        // Submit button
        JButton submitBtn = new JButton("Submit");
        submitBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String password = new String(passField.getPassword());
                String hobbies = "";
                if (cbReading.isSelected()) hobbies += "Reading ";
                if (cbMusic.isSelected()) hobbies += "Music ";
                if (cbSports.isSelected()) hobbies += "Sports ";

                String gender = rbMale.isSelected() ? "Male" :
                        rbFemale.isSelected() ? "Female" : "Not Selected";

                JOptionPane.showMessageDialog(frame,
                        "Name: " + name +
                                "\nPassword: " + password +
                                "\nHobbies: " + hobbies +
                                "\nGender: " + gender);
            }
        });

        // Add components to frame
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(passLabel);
        frame.add(passField);
        frame.add(hobbyLabel);
        frame.add(hobbyPanel);
        frame.add(genderLabel);
        frame.add(genderPanel);
        frame.add(new JLabel()); // Empty placeholder
        frame.add(submitBtn);

        frame.setVisible(true);
    }
}
