import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuDemoHome extends JFrame {
    JMenuBar mb;
    JMenu m1, m2, m3;
    JMenu i1, i2, i3, i4;
    JMenuItem it, is, us, ut, ds, dt, rt, rs, exitItem;

    public MenuDemoHome(){
        mb = new JMenuBar();
        setJMenuBar(mb);

//        Top level menu
        m1 = new JMenu("Home");
        m2 = new JMenu("View");
        m3 = new JMenu("Exit");

        mb.add(m1);
        mb.add(m2);
        mb.add(m3);

//        Submenus under Home
        i1 = new JMenu("Insert");
        i1 = new JMenu("Update");
        i1 = new JMenu("Delete");
        i1 = new JMenu("Report/View");

//        update items
        us = new JMenuItem("Update Student");
        i2.add(us);
        ut = new JMenuItem("Update Teacher");
        i2.add(ut);

//        Delete items
        ds = new JMenuItem("Delete Student");
        i3.add(ds);
        dt = new JMenuItem("Delete Teacher");
        i3.add(dt);

//        Report Items
        rs = new JMenuItem("Report Student");
        i4.add(rs);
        rt = new JMenuItem("Report Teacher");
        i4.add(rt);

        exitItem = new JMenuItem("Exit");
        m3.add(exitItem);

        exitItem.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                int confirm = JOptionPane.showConfirmDialog(MenuDemoHome.this,
                        "Are you sure you want to exit?",
                        "Exit Confrimation",
                        JOptionPane.YES_NO_OPTION);
                if(confirm == JOptionPane.YES_OPTION){
                    System.exit(0);
                }
            }
        });

    }
}
