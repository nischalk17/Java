import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    JTextField inp1, inp2, res;
    JButton addition, sub;
    Double n1, n2, result;
    String r;
    JComboBox cmbbox;

    public Calculator(){
        inp1 = new JTextField();
        add(inp1);
        inp1.setBounds(10,20,50,25);

        inp2 = new JTextField();
        add(inp2);
        inp2.setBounds(70,20,50,25);

        res = new JTextField();
        add(res);
        res.setBounds(150,20,80,25);

        addition = new JButton("Add");
        add(addition);
        addition.setBounds(60,60,100,25);
        addition.addActionListener(this);

        sub = new JButton("Sub");
        add(sub);
        sub.setBounds(120,60,100,25);
        sub.addActionListener(this);

        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == addition){
            n1 = Double.parseDouble(inp1.getText());
            n2 = Double.parseDouble(inp2.getText());

            result = n1 + n2;
            r = result.toString();
            res.setText(" " + r);
        }

        if (e.getSource() == sub){
            n1 = Double.parseDouble(inp1.getText());
            n2 = Double.parseDouble(inp2.getText());

            result = n1 - n2;
            r = result.toString();
            res.setText(" " + r);
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}