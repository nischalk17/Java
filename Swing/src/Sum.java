import javax.swing.*;
import java.awt.event.ActionListener;
public class Sum extends JFrame implements ActionListener{

    JTextField txt1, txt2;
    JLabel num1,num2,result;
    public Sum()
    {
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);

        num1 = new JLabel("First Number");
        add(num1).setBounds(100,100,150,30);
        txt1 = new JTextField();
        add(txt1).setBounds(300,100,100,30);

        num2 = new JLabel("Second Number");
        add(num2).setBounds(100,150,150,30);
        txt2 = new JTextField();
        add(txt2).setBounds(300,150,100,30);

        result = new JLabel("Result : 0.0");
        add(result).setBounds(300,200);
        sum = new JButton("Sum");
        add(sum).setBounds(300,250,100,40);
        sum.addActionListener(this);

    }

    public static void main(String[] args) {
        new Sum();
    }
}
