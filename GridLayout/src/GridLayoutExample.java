import java.awt.*;
import javax.swing.*;

public class GridLayoutExample {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("GridLayout Example");

        // Set GridLayout with 3 rows and 2 columns
        frame.setLayout(new GridLayout(3, 2, 10, 10)); // (rows, cols, hgap, vgap)

        // Create and add 6 buttons
        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));
        frame.add(new JButton("Button 4"));
        frame.add(new JButton("Button 5"));
        frame.add(new JButton("Button 6"));

        // Set frame properties
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
