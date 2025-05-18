/*4b. Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is
pressed” depending upon the Jbutton either Srilanka or India is pressed by implementing the
event handling mechanism with addActionListener( ).*/
package ADV_Java;

import javax.swing.*; 
import java.awt.*;  
import java.awt.event.*; 

public class BasicSwing4b {
    public static void main(String[] args) {
        // Create a JFrame as the main window
        JFrame frame = new JFrame("Button Press Demo");
        
        // Create a JLabel to display the message
        JLabel messageLabel = new JLabel("Press a button");
        messageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        messageLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        
        // Create buttons for Srilanka and India
        JButton srilankaButton = new JButton("Srilanka");
        JButton indiaButton = new JButton("India");
        
        // Create a panel to hold buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(srilankaButton);
        buttonPanel.add(indiaButton);
        
        // Add ActionListener to Srilanka button
        srilankaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Update label when Srilanka button is pressed
                messageLabel.setText("Srilanka is pressed");
            }
        });
        
        // Add ActionListener to India button
        indiaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Update label when India button is pressed
                messageLabel.setText("India is pressed");
            }
        });
        
        // Set layout for the frame
        frame.setLayout(new BorderLayout());
        frame.add(messageLabel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        
       
        frame.setSize(400, 200);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       
        frame.setLocationRelativeTo(null);
        
       
        frame.setVisible(true);
    }
}