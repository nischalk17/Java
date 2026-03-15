import javax.swing.*;
import java.awt.event.*;

public class SwingAdditionExample {
    public static void main(String[] args) {

        // create JFrame
        JFrame frame = new JFrame("Addition");
        frame.setLayout(null);
        frame.setSize(400,400);

        // create labels for I/P fields
        JLabel l1 = new JLabel("Enter first number: ");
        l1.setBounds(50, 100, 150, 25);
        frame.add(l1);

        JLabel l2 =new JLabel("Enter second number: ");
        l2.setBounds(50,150,150,25);
        frame.add(l2);

        // create textfield for user I/Ps
        JTextField t1 = new JTextField();
        t1.setBounds(220, 100,150,25);
        frame.add(t1);

        JTextField t2 = new JTextField();
        t2.setBounds(220, 150, 150,25);
        frame.add(t2);

        // button to calculate sum
        JButton calcButton = new JButton("Calculate");
        calcButton.setBounds(150,200,120,30);
        frame.add(calcButton);

        // label to display result
        JLabel result = new JLabel("Sum: ");
        result.setBounds(50,250,150,25);
        frame.add(result);

        // add click event to the button
        calcButton.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 try{
                     // read I/P from text fields and convert to double
                     double firstNumber = Double.parseDouble(t1.getText());
                     double secondNumber = Double.parseDouble(t2.getText());

                     double sum = firstNumber + secondNumber;
                     result.setText("Sum: " + sum);
                 }
                 catch (Exception ex) {
                     //handle invalid i/p
                     result.setText("Please enter valid numbers");
                 }
             }
        });


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
