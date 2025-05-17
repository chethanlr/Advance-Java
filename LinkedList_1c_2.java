/*Write a Java program to iterate a linked list in reverse order (using
objlist.descendingIterator())*/

package ADV_Java;

import java.util.LinkedList; 
import java.util.Iterator;  

public class LinkedList_1c_2 {
    public static void main(String[] args) {
       
        LinkedList<String> list = new LinkedList<>();

        
        list.add("Apple");  
        list.add("Banana"); 
        list.add("Cherry"); 
        list.add("Date");   

        // Display the original LinkedList
        System.out.println("Original LinkedList: " + list);

        // Obtain a descending iterator to traverse the list in reverse order
        Iterator<String> reverseIterator = list.descendingIterator();

        // Iterate through the LinkedList in reverse order
        System.out.println("LinkedList in reverse order:");
        while (reverseIterator.hasNext()) {
            // Print each element in reverse order
            System.out.println(reverseIterator.next());
        }
    }
}