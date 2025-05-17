/*Write a Java program to insert the specified element at the end of a linked list.( using
l_listobj.offerLast("Pink")) */
package ADV_Java;

import java.util.LinkedList; 
public class LinkedList_1c_3 {
    public static void main(String[] args) {
       
        LinkedList<String> l_listobj = new LinkedList<>();

       
        l_listobj.add("Yellow"); 
        l_listobj.add("Purple"); 
        l_listobj.add("Cyan");   
        // Print the LinkedList before adding Pink
        System.out.println("LinkedList before adding Pink: " + l_listobj);

        // Add "Pink" to the end of the LinkedList using offerLast
        l_listobj.offerLast("Pink"); // Append Pink as the last element

        // Print the LinkedList after adding Pink
        System.out.println("LinkedList after adding Pink: " + l_listobj);
    }
}