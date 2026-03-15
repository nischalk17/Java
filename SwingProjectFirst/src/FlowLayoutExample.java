import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {

    public static void main(String[] args) {
        JFrame jframe = new JFrame();
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(400, 500);

        jframe.setLayout(new FlowLayout(FlowLayout.CENTER));

        jframe.add(new JButton("Button 1"));
        jframe.add(new JButton("Button 2"));
        jframe.add(new JButton("Button 3"));

        JLabel label1 = new JLabel("I love Sisam");

        jframe.add(label1);
        jframe.setVisible(true);

    }
}
