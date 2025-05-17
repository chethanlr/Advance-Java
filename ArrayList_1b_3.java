/*Write a java program for getting different colors through ArrayList interface and sort them
using Collections.sort( ArrayListObj)*/

package ADV_Java;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_1b_3 {
    public static void main(String[] args) {
        ArrayList<String> colorList = new ArrayList<>();

        // Add different colors to the ArrayList
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");
        colorList.add("Yellow");
        colorList.add("Orange");

        // Display the list before sorting
        System.out.println("Before sorting: " + colorList);

        // Sort the color names alphabetically using Collections.sort()
        Collections.sort(colorList); // Sorts in ascending order
        // Display the sorted list
        System.out.println("After sorting: " + colorList);
    }
}
