import java.awt.*;
import java.awt.event.*;

public class SimpleAWTExample {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Example");
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        Label label = new Label("Click the button:");
        Button button = new Button("Click Me");

        frame.add(label);
        frame.add(button);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked!");
            }
        });

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}
