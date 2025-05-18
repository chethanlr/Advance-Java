// 1a. Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList and a LinkedList to perform the following operations:
// 1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4. Accessing elements,
// 5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List size, 9. Iterating over list,
// 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list

package ADV_Java;
 import java.util.*;
 
public class ListOperations1a {
	  public static void main(String[] args) {
	        // Initial elements
	        List<String> fruitsArrayList = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange"));
	        List<String> fruitsLinkedList = new LinkedList<>(Arrays.asList("Apple", "Banana", "Orange"));

	        System.out.println("Initial ArrayList: " + fruitsArrayList);
	        System.out.println("Initial LinkedList: " + fruitsLinkedList);

	        // 1. Adding elements
	        fruitsArrayList.add("Grapes");
	        fruitsLinkedList.add("Grapes");

	        // 2. Adding element at specific index
	        fruitsArrayList.add(1, "Kiwi");
	        fruitsLinkedList.add(1, "Kiwi");

	        // 3. Adding multiple elements
	        List<String> moreFruits = Arrays.asList("Pineapple", "Mango");
	        fruitsArrayList.addAll(moreFruits);
	        fruitsLinkedList.addAll(moreFruits);

	        // 4. Accessing elements
	        System.out.println("First in ArrayList: " + fruitsArrayList.get(0));
	        System.out.println("First in LinkedList: " + fruitsLinkedList.get(0));

	        // 5. Updating elements
	        fruitsArrayList.set(2, "Blueberry");
	        fruitsLinkedList.set(2, "Blueberry");

	        // 6. Removing elements
	        fruitsArrayList.remove("Banana");
	        fruitsLinkedList.remove("Banana");

	        // 7. Searching elements
	        System.out.println("Contains Apple (ArrayList)? " + fruitsArrayList.contains("Apple"));
	        System.out.println("Contains Apple (LinkedList)? " + fruitsLinkedList.contains("Apple"));

	        // 8. List size
	        System.out.println("Size of ArrayList: " + fruitsArrayList.size());
	        System.out.println("Size of LinkedList: " + fruitsLinkedList.size());

	        // 9. Iterating over list
	        System.out.println("\nIterating ArrayList:");
	        for (String fruit : fruitsArrayList) {
	            System.out.println(fruit);
	        }

	        // 10. Using Iterator
	        System.out.println("\nUsing Iterator on LinkedList:");
	        Iterator<String> it = fruitsLinkedList.iterator();
	        while (it.hasNext()) {
	            System.out.println(it.next());
	        }

	        // 11. Sorting
	        Collections.sort(fruitsArrayList);
	        Collections.sort((LinkedList<String>) fruitsLinkedList);

	        // 12. Sublist
	        System.out.println("\nSublist of ArrayList: " + fruitsArrayList.subList(0, 3));

	        // 13. Clearing the list
	        fruitsArrayList.clear();
	        fruitsLinkedList.clear();

	        System.out.println("\nAfter clearing:");
	        System.out.println("ArrayList: " + fruitsArrayList);
	        System.out.println("LinkedList: " + fruitsLinkedList);
	    }
	}


