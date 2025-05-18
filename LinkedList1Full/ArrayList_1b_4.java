/*Write a java program for getting different colors through ArrayList interface and extract the
elements 1st and 2nd from the ArrayList object by using SubList()*/

package ADV_Java;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_1b_4 {
    public static void main(String[] args) {
        ArrayList<String> colorList = new ArrayList<>();

        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");
        colorList.add("Yellow");
        colorList.add("Orange");

        // Display the original list of colors
        System.out.println("Original color list: " + colorList);

        // Extract the 1st and 2nd elements (index 0 and 1) using subList()
        // subList includes fromIndex and excludes toIndex
        List<String> extractedColors = colorList.subList(0, 2);

        // Display the extracted sublist
        System.out.println("Extracted elements (1st and 2nd): " + extractedColors);
    }
}
