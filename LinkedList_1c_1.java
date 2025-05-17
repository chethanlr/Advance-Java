/*Write a Java program to iterate through all elements in a linked list starting at the
specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))*/

package ADV_Java;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_1c_1 {
    public static void main(String[] args) {

        LinkedList<String> colorList = new LinkedList<>();

        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");
        colorList.add("Yellow");
        colorList.add("Orange");

        // Display the original list
        System.out.println("Original LinkedList: " + colorList);

        // Start iterating from the 2nd position (index 1)
        ListIterator<String> iterator = colorList.listIterator(1);

        System.out.println("Iterating from the 2nd element:");
        while (iterator.hasNext()) {
            String color = iterator.next();
            System.out.println(color);
        }
    }
}
