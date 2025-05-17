/*4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour
Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is
pressed by implementing the event handling mechanism with addActionListener( ).*/

package ADV_Java;

import javax.swing.*; 
import java.awt.*;   
import java.awt.event.*; 

public class BasicSwing4c {
    public static void main(String[] args) {
        // Create a JFrame as the main window
        JFrame frame = new JFrame("Image Button Demo");
        
        // Create a JLabel to display the message
        JLabel messageLabel = new JLabel("Press a button");
        messageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        messageLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        
        // Create buttons for Digital Clock and Hour Glass
        JButton digitalClockButton = new JButton("Digital Clock");
        JButton hourGlassButton = new JButton("Hour Glass");
        
        
        // Assumes digital_clock.png and hour_glass.png are in the project directory
        JButton digitalClockButton1 = new JButton(new ImageIcon("digital_clock.png"));
        JButton hourGlassButton1 = new JButton(new ImageIcon("hour_glass.png"));
        
        
        // Add ActionListener to Digital Clock button
        digitalClockButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Update label when Digital Clock button is pressed
                messageLabel.setText("Digital Clock is pressed");
            }
        });
        
        // Add ActionListener to Hour Glass button
        hourGlassButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Update label when Hour Glass button is pressed
                messageLabel.setText("Hour Glass is pressed");
            }
        });
        
        // Create a panel to hold buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(digitalClockButton1);
        buttonPanel.add(hourGlassButton1);
        
        // Set layout for the frame
        frame.setLayout(new BorderLayout());
        frame.add(messageLabel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        
        // Set frame size
        frame.setSize(400, 200);
        
        // Set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Center the frame on the screen
        frame.setLocationRelativeTo(null);
        
        // Make the frame visible
        frame.setVisible(true);
    }
}