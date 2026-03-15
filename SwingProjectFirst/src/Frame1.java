import javax.swing.*;

public class Frame1 {

    public static void main(String[] args) {
        JFrame j = new JFrame();
        j.setTitle("Example");
//        j.setSize(500, 500);
//        j.setLocation(200, 200);
        j.setBounds(200, 200, 500,500);
        j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);
        j.setVisible(true);

        JButton b1 = new JButton("Login");
        b1.setBounds(40, 40, 100, 30);
        j.add(b1);

        JTextField t1= new JTextField();
        t1.setBounds(40, 30, 100, 30);
        j.add(t1);

        JLabel label= new JLabel();
        t1.setBounds(40, 30, 100, 30);
        j.add(t1);
    }
}
