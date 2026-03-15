import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample {

    public static void main(String[] args) {
        JFrame jframe = new JFrame();
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(400, 500);

        //jframe.setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton BTN1 = new JButton("North");
        JButton BTN2 = new JButton("South");
        JButton BTN3 = new JButton("East");
        JButton BTN4 = new JButton("West");
        JButton BTN5 = new JButton("Center");

        jframe.add(BTN1, BorderLayout.NORTH);
        jframe.add(BTN2, BorderLayout.SOUTH);
        jframe.add(BTN3, BorderLayout.EAST);
        jframe.add(BTN4, BorderLayout.WEST);
        jframe.add(BTN5, BorderLayout.CENTER);
        jframe.setVisible(true);
    }
}