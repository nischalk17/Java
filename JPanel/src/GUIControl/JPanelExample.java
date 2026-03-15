package GUIControl;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JPanelExample extends JFrame {

    JPanel jp1, jp2;
    JButton b1, b2;
    public JPanelExample(){
        setSize(600, 600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("How to make panel");

        jp1 = new JPanel();
        add(jp1).setBounds(100,100,400,400);
        jp1.setBackground(Color.CYAN);
        jp1.setLayout(null);

        jp2 = new JPanel();
        add(jp2).setBounds(550,100,400,400);
        jp2.setBackground(Color.pink);

        
    }
}
