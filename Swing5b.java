// 5b.Develop a Swing program in Java to create a Tabbed Pan of RED, BLUE and GREEN anddisplay the concerned color whenever the specific tab is selected in the Pan.


package ADV_Java;

import javax.swing.*; 
import javax.swing.event.*; 
import java.awt.*; 

public class Swing5b {
    public static void main(String[] args) {
        // Create a JFrame as the main window
        JFrame frame = new JFrame("Tabbed Pane Color Demo");
        
        // Create a JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();
        
        // Create panels for each tab with corresponding background colors
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        
        // Add panels to the tabbed pane with tab labels
        tabbedPane.addTab("RED", redPanel);
        tabbedPane.addTab("BLUE", bluePanel);
        tabbedPane.addTab("GREEN", greenPanel);
        
        // Create a JLabel to display the selected tab's name
        JLabel statusLabel = new JLabel("Select a tab to view its color");
        statusLabel.setHorizontalAlignment(SwingConstants.CENTER);
        statusLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        
        // Add ChangeListener to detect tab selection
        tabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                // Get the selected tab's title
                String selectedTab = tabbedPane.getTitleAt(tabbedPane.getSelectedIndex());
                // Update the status label with the selected tab
                statusLabel.setText("Selected tab: " + selectedTab);
            }
        });
        
        // Set layout for the frame
        frame.setLayout(new BorderLayout());
        frame.add(tabbedPane, BorderLayout.CENTER);
        frame.add(statusLabel, BorderLayout.SOUTH);
        
        // Set frame size
        frame.setSize(400, 300);
        
        // Set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Center the frame on the screen
        frame.setLocationRelativeTo(null);
        
        // Make the frame visible
        frame.setVisible(true);
    }
}
