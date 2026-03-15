import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample extends JFrame {
    FlowLayoutExample() {

        setTitle("FlowLayout Example");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        add(new JButton("Button 1"));
        add(new JButton("Button 2"));
        add(new JButton("Button 3"));
        add(new JButton("Button 4"));
        add(new JButton("Button 5"));


        setVisible(true);
    }
    public static void main(String[] args) {
        new FlowLayoutExample();
    }
}
