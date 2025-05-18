/* Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
display the capital of the countries on console whenever the countries are selected on the list. */


package ADV_Java;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Swing5c extends JFrame {
    private JList<String> countryList;
    private Map<String, String> countryCapitals;

    public Swing5c() {
        // Initialize the HashMap with country-capital pairs
        countryCapitals = new HashMap<>();
        countryCapitals.put("USA", "Washington, D.C.");
        countryCapitals.put("India", "New Delhi");
        countryCapitals.put("Vietnam", "Hanoi");
        countryCapitals.put("Canada", "Ottawa");
        countryCapitals.put("Denmark", "Copenhagen");
        countryCapitals.put("France", "Paris");
        countryCapitals.put("Great Britain", "London");
        countryCapitals.put("Japan", "Tokyo");
        countryCapitals.put("Africa", "Not a country (continent)");
        countryCapitals.put("Greenland", "Nuuk");
        countryCapitals.put("Singapore", "Singapore");

        // Set up the frame
        setTitle("Country Capital Selector");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLocationRelativeTo(null);

        // Create the JList with countries
        String[] countries = {"USA", "India", "Vietnam", "Canada", "Denmark", 
                            "France", "Great Britain", "Japan", "Africa", 
                            "Greenland", "Singapore"};
        countryList = new JList<>(countries);
        countryList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        // Add ListSelectionListener to handle selection events
        countryList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                String selectedCountry = countryList.getSelectedValue();
                if (selectedCountry != null) {
                    String capital = countryCapitals.get(selectedCountry);
                    System.out.println("Country: " + selectedCountry + 
                                     ", Capital: " + capital);
                }
            }
        });

        // Add JList to a scroll pane
        JScrollPane scrollPane = new JScrollPane(countryList);
        
        // Set up the layout and add components
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);

        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // Run the application on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> new Swing5c());
    }
}