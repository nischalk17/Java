import javax.swing.*;
import java.awt.*;

public class Lab7a {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Layout Managers Demo - Nischal Kunwar");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();

        // FlowLayout
        JPanel flowPanel = new JPanel(new FlowLayout());
        flowPanel.add(new JButton("Button 1"));
        flowPanel.add(new JButton("Button 2"));
        flowPanel.add(new JButton("Button 3"));
        tabbedPane.add("FlowLayout", flowPanel);

        // BorderLayout
        JPanel borderPanel = new JPanel(new BorderLayout());
        borderPanel.add(new JButton("North"), BorderLayout.NORTH);
        borderPanel.add(new JButton("South"), BorderLayout.SOUTH);
        borderPanel.add(new JButton("East"), BorderLayout.EAST);
        borderPanel.add(new JButton("West"), BorderLayout.WEST);
        borderPanel.add(new JButton("Center"), BorderLayout.CENTER);
        tabbedPane.add("BorderLayout", borderPanel);

        // GridLayout
        JPanel gridPanel = new JPanel(new GridLayout(2, 3, 5, 5));
        for (int i = 1; i <= 6; i++) {
            gridPanel.add(new JButton("Button " + i));
        }
        tabbedPane.add("GridLayout", gridPanel);

        // BoxLayout
        JPanel boxPanel = new JPanel();
        boxPanel.setLayout(new BoxLayout(boxPanel, BoxLayout.Y_AXIS));
        boxPanel.add(new JButton("Button 1"));
        boxPanel.add(Box.createVerticalStrut(10));
        boxPanel.add(new JButton("Button 2"));
        boxPanel.add(Box.createVerticalStrut(10));
        boxPanel.add(new JButton("Button 3"));
        tabbedPane.add("BoxLayout", boxPanel);

        // CardLayout
        JPanel cardPanel = new JPanel(new CardLayout());
        cardPanel.add(new JButton("Card 1"), "Card1");
        cardPanel.add(new JButton("Card 2"), "Card2");
        cardPanel.add(new JButton("Card 3"), "Card3");
        JButton nextCard = new JButton("Next Card");
        nextCard.addActionListener(e -> {
            CardLayout cl = (CardLayout) (cardPanel.getLayout());
            cl.next(cardPanel);
        });
        JPanel cardContainer = new JPanel(new BorderLayout());
        cardContainer.add(cardPanel, BorderLayout.CENTER);
        cardContainer.add(nextCard, BorderLayout.SOUTH);
        tabbedPane.add("CardLayout", cardContainer);

        // GridBagLayout
        JPanel gridBagPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gridBagPanel.add(new JButton("Button 1"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gridBagPanel.add(new JButton("Button 2"), gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gridBagPanel.add(new JButton("Button 3"), gbc);

        tabbedPane.add("GridBagLayout", gridBagPanel);

        frame.add(tabbedPane);
        frame.setVisible(true);
    }
}
