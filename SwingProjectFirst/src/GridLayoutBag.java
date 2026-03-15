import javax.swing.*;
import java.awt.*;

public class GridLayoutBag {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setLayout(new GridLayout());
        jFrame.setSize(300,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 1;
        jFrame.add(new JButton("btn1"), gbc);

        gbc.gridx = 0;
        gbc.gridy = 0;
        jFrame.add(new JButton("btn2"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.ipady = 10;
        jFrame.add(new JButton("btn3"), gbc);

        jFrame.setVisible(true);

    }
}
