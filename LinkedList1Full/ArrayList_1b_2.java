/*2. Write a java program for getting different colors through ArrayList interface and remove the
2nd element and color "Blue" from the ArrayList */


package ADV_Java;

import java.util.ArrayList;

public class ArrayList_1b_2 {
    public static void main(String[] args) {
        
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");
        colorList.add("Yellow");
        colorList.add("Orange");

        // Display the original list of colors
        System.out.println("Original color list: " + colorList);

        // Remove the color at the second position (index 1)
        if (colorList.size() > 1) {
            String removedColor = colorList.remove(1); 
            System.out.println("Removed color at index 1: " + removedColor);
        }

        // Remove the color "Blue" from the list if it exists
        boolean isBlueRemoved = colorList.remove("Blue");
        if (isBlueRemoved) {
            System.out.println("Color 'Blue' was removed from the list.");
        } else {
            System.out.println("Color 'Blue' was not found in the list.");
        }

        // Display the final state of the color list
        System.out.println("Colors after removals: " + colorList);
    }
}
