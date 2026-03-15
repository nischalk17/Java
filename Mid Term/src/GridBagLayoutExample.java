import javax.swing.*;
import java.awt.*;

public class GridBagLayoutExample extends JFrame {
    GridBagLayoutExample() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0; gbc.gridy = 0;
        add(new JButton("Button 1"), gbc);

        gbc.gridx = 1; gbc.gridy = 0;
        add(new JButton("Button 2"), gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        gbc.gridwidth = 4; gbc.gridheight = 4;
        add(new JButton("Long-Named Button 3"), gbc);

        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new GridBagLayoutExample();
    }
}

