import javax.swing.*;

public class GroupLayoutExample extends JFrame {

    GroupLayoutExample() {

        // Frame settings
        setTitle("GroupLayout Example");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Components
        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");

        // Create GroupLayout and set it to frame's content pane
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        // Let GroupLayout automatically create gaps
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        // Horizontal group
        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                        .addComponent(btn1)
                        .addComponent(btn2)
        );

        // Vertical group
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btn1)
                        .addComponent(btn2)
        );


        setVisible(true);
    }

    public static void main(String[] args) {
        new GroupLayoutExample();
    }
}
