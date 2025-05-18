/*Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and
display the concerned color whenever the specific tab is selected in the Pan */

package ADV_Java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Swing5d extends JFrame {
    private JPanel colorPanel;
    private JTabbedPane tabbedPane;

    public Swing5d() {
        // Set up the frame
        setTitle("Color Tabbed Pane");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Create the JTabbedPane
        tabbedPane = new JTabbedPane();

        // Create panels for each color tab
        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);
        
        JPanel magentaPanel = new JPanel();
        magentaPanel.setBackground(Color.MAGENTA);
        
        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);

        // Add tabs to the tabbed pane
        tabbedPane.addTab("Cyan", cyanPanel);
        tabbedPane.addTab("Magenta", magentaPanel);
        tabbedPane.addTab("Yellow", yellowPanel);

        // Create a panel to display the selected color
        colorPanel = new JPanel();
        colorPanel.setBackground(Color.CYAN); // Default color

        // Add ChangeListener to handle tab selection
        tabbedPane.addChangeListener(e -> {
            int selectedIndex = tabbedPane.getSelectedIndex();
            switch (selectedIndex) {
                case 0:
                    colorPanel.setBackground(Color.CYAN);
                    System.out.println("Selected color: Cyan");
                    break;
                case 1:
                    colorPanel.setBackground(Color.MAGENTA);
                    System.out.println("Selected color: Magenta");
                    break;
                case 2:
                    colorPanel.setBackground(Color.YELLOW);
                    System.out.println("Selected color: Yellow");
                    break;
            }
            colorPanel.repaint();
        });

        // Set up the layout
        setLayout(new BorderLayout());
        add(tabbedPane, BorderLayout.NORTH);
        add(colorPanel, BorderLayout.CENTER);

        // Ensure the color panel updates when shown
        colorPanel.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentShown(ComponentEvent e) {
                colorPanel.repaint();
            }
        });

        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // Run the application on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> new Swing5d());
    }
}