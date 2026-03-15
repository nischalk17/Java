import javax.swing.*;
import java.awt.*;

public class GUIAllControls extends JFrame {
    GUIAllControls() {
        setTitle("College Form");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel with layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 2, 10, 10)); // rows, cols, hgap, vgap

        // Name
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(15);

        // About Yourself
        JLabel aboutLabel = new JLabel("About Yourself:");
        JTextArea aboutArea = new JTextArea(3, 15);
        JScrollPane aboutScroll = new JScrollPane(aboutArea);

        // Gender (Radio Buttons)
        JLabel genderLabel = new JLabel("Gender:");
        JPanel genderPanel = new JPanel();
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderPanel.add(male);
        genderPanel.add(female);

        // Faculties (Checkboxes)
        JLabel facultyLabel = new JLabel("Faculties:");
        JPanel facultyPanel = new JPanel();
        JCheckBox science = new JCheckBox("Science");
        JCheckBox management = new JCheckBox("Management");
        JCheckBox arts = new JCheckBox("Arts");
        facultyPanel.add(science);
        facultyPanel.add(management);
        facultyPanel.add(arts);

        // Year (ComboBox)
        JLabel yearLabel = new JLabel("Year:");
        JComboBox<String> yearCombo = new JComboBox<>(new String[]{"1st Year", "2nd Year", "3rd Year", "4th Year"});

        // Age (Slider)
        JLabel ageLabel = new JLabel("Age:");
        JSlider ageSlider = new JSlider(16, 30, 18); // min=16, max=30, default=18
        ageSlider.setMajorTickSpacing(2);
        ageSlider.setPaintTicks(true);
        ageSlider.setPaintLabels(true);

        // Add components to panel
        panel.add(nameLabel); panel.add(nameField);
        panel.add(aboutLabel); panel.add(aboutScroll);
        panel.add(genderLabel); panel.add(genderPanel);
        panel.add(facultyLabel); panel.add(facultyPanel);
        panel.add(yearLabel); panel.add(yearCombo);
        panel.add(ageLabel); panel.add(ageSlider);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GUIAllControls();
    }
}
