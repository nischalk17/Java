import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;

public class MouseListenerEmojiExample extends JFrame implements MouseListener {
    private JLabel label;
    private ImageIcon smile, cry, sad, confused;

    public MouseListenerEmojiExample(){
        setTitle("MouseListener Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        setLocationRelativeTo(null);

        smile = scaleImage("C:\\Users\\Nischal\\IdeaProjects\\Mouse Listener\\images\\smile.png");
        cry = scaleImage("C:\\Users\\Nischal\\IdeaProjects\\Mouse Listener\\images\\cry.jpg");
        sad = scaleImage("C:\\Users\\Nischal\\IdeaProjects\\Mouse Listener\\images\\sad.png");
        confused = scaleImage("C:\\Users\\Nischal\\IdeaProjects\\Mouse Listener\\images\\confused.jpg");

        Label = new JLabel(smile);

    }
}
