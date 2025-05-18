// Java program to swap the first and third elements in a LinkedList using Collections.swap(l_list, 0, 2)
package ADV_Java;

import java.util.LinkedList; 
import java.util.Collections; 

public class LinkedList_1c_5 {
    public static void main(String[] args) {
        
        LinkedList<String> l_list = new LinkedList<>();

        
        l_list.add("Lion");   
        l_list.add("Tiger");  
        l_list.add("Bear");   
        l_list.add("Wolf");  

        // Display the LinkedList before swapping
        System.out.println("LinkedList before swapping: " + l_list);

        // Swap the first (index 0) and third (index 2) elements using Collections.swap
        Collections.swap(l_list, 0, 2); // Swap Lion and Bear

        // Display the LinkedList after swapping
        System.out.println("LinkedList after swapping first and third elements: " + l_list);
    }
}