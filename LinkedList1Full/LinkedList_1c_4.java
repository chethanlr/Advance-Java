// Java program to display elements and their positions in a LinkedList using get(p)
package ADV_Java;

import java.util.LinkedList; 

public class LinkedList_1c_4 {
    public static void main(String[] args) {
        LinkedList<String> l_listobj = new LinkedList<>();
        l_listobj.add("Apple");  
        l_listobj.add("Banana"); 
        l_listobj.add("Orange"); 
        l_listobj.add("Grape");  

        // Display the LinkedList for reference
        System.out.println("LinkedList contents: " + l_listobj);

        // Iterate through the LinkedList to display elements and their positions
        System.out.println("Elements and their positions:");
        for (int p = 0; p < l_listobj.size(); p++) {
            // Use get(p) to retrieve the element at index p
            String element = l_listobj.get(p);
            // Print the position and corresponding element
            System.out.println("Position " + p + ": " + element);
        }
    }
}