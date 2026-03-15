import javax.swing.*;
import java.awt.*;

public class GridLayoutExample extends JFrame {

    GridLayoutExample() {
        setTitle("GridLayout Example");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Set GridLayout: 2 rows, 3 columns
        setLayout(new GridLayout(2, 3, 10, 10)); // 10px gap between components

        // Add 6 buttons (2 rows × 3 columns)
        add(new JButton("Button 1"));
        add(new JButton("Button 2"));
        add(new JButton("Button 3"));
        add(new JButton("Button 4"));
        add(new JButton("Button 5"));
        add(new JButton("Button 6"));

        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutExample();
    }
}
