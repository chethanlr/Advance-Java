/*1. Write a java program for getting different colors through ArrayList interface and search whether
the color "Red" is available or not */


package ADV_Java;
import java.util.*;
public class ArrayList_1b_1 {
	  public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>();
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");

	        System.out.println("Colors: " + colors);
	        if (colors.contains("Red")) {
	            System.out.println("Color 'Red' is available in the list.");
	        } else {
	            System.out.println("Color 'Red' is not available in the list.");
	        }
	    }
}
