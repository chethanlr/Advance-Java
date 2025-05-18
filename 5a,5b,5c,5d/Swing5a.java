//5a. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada, Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
//display them on console whenever the countries are selected on the list.

package ADV_Java;

import javax.swing.*; 
import javax.swing.event.*; 
import java.awt.*; 

public class Swing5a {
    public static void main(String[] args) {
        // Create a JFrame as the main window
        JFrame frame = new JFrame("Country List Demo");
        
        // Define the list of countries
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa",
            "Greenland", "Singapore"
        };
        
        // Create a JList with the countries
        JList<String> countryList = new JList<>(countries);
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        countryList.setFont(new Font("Arial", Font.PLAIN, 14));
        
        // Add a ListSelectionListener to detect selections
        countryList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // Check if the selection adjustment is complete
                if (!e.getValueIsAdjusting()) {
                    // Get selected countries
                    String[] selectedCountries = countryList.getSelectedValuesList().toArray(new String[0]);
                    if (selectedCountries.length > 0) {
                        // Print selected countries to console
                        System.out.println("Selected countries:");
                        for (String country : selectedCountries) {
                            System.out.println(country);
                        }
                        System.out.println("---");
                    }
                }
            }
        });
        
        // Wrap the JList in a JScrollPane for scrollability
        JScrollPane scrollPane = new JScrollPane(countryList);
        scrollPane.setPreferredSize(new Dimension(200, 200));
        
        // Add the scroll pane to the frame
        frame.add(scrollPane, BorderLayout.CENTER);
        
        // Set frame size
        frame.setSize(300, 300);
        
        // Set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Center the frame on the screen
        frame.setLocationRelativeTo(null);
        
        // Make the frame visible
        frame.setVisible(true);
    }
}