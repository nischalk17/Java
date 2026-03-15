import javax.swing.*;
import java.awt.*;

public class InternalFrameExample extends JFrame {

    JDesktopPane desktopPane;
    JInternalFrame internalFrame;

    public InternalFrameExample(){
        setTitle("Internal Frame Example");
        setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        desktopPane = new JDesktopPane();
        add(desktopPane);
        internalFrame = new JInternalFrame("My Internal Frame", true, true, true);
        internalFrame.setSize(300,200);
        internalFrame.setLocation(100,100);
        internalFrame.setVisible(true);

        JButton btn = new JButton("Click Me");
        internalFrame.add(btn);
        internalFrame.setLayout(new FlowLayout());

        desktopPane.add(internalFrame);
    }

    public static void main(String[] args) {
        new InternalFrameExample().setVisible(true);
    }
}
