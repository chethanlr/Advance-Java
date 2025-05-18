/*4a. Basic hello program of Swing displaying the message Hello! VI C , Welcome to Swing
Programming in Blue color plain font with font size of 32 using Jframe and Jlabel*/

package ADV_Java;

import javax.swing.*;
import java.awt.*;

public class BasicSwing4a {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Swing Hello Program");

        // Create the message label
        JLabel label = new JLabel("Hello! VI C, Welcome to Swing Programming", JLabel.CENTER);

        // Set font: plain style, size 32
        label.setFont(new Font("Arial", Font.PLAIN, 32));

        // Set font color to blue
        label.setForeground(Color.BLUE);

        // Add label to the frame
        frame.add(label);

        // Set frame size
        frame.setSize(800, 200);

        // Set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set frame visible
        frame.setVisible(true);
    }
}

