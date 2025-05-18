/*Write a java program for getting different colors through ArrayList interface and delete nth
element from the ArrayList object by using remove by index */

package ADV_Java;

import java.util.ArrayList;

public class ArrayList_1b_5 {
    public static void main(String[] args) {
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");
        colorList.add("Yellow");
        colorList.add("Orange");

        // Display the original list of colors
        System.out.println("Original color list: " + colorList);

        // Specify the index (n) of the element to remove 
        int n = 2;

        // Check if the index is valid before removing
        if (n >= 0 && n < colorList.size()) {
            String removedColor = colorList.remove(n); // Removes the nth element
            System.out.println("Removed element at index " + n + ": " + removedColor);
        } else {
            System.out.println("Invalid index: " + n);
        }

        // Display the list after removal
        System.out.println("Color list after removal: " + colorList);
    }
}
