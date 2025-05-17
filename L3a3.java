//Write a Java Program for Reversing the characters in a string using user defined function
//reverseString().
package LAB3a;

public class L3a3 {
	 public static String reverseString(String str) {
	        return new StringBuilder(str).reverse().toString();
	    }

	    public static void main(String[] args) {
	        String str = "Bad Boy Shah";
	        System.out.println("Before Reversing:" + str);
	        System.out.println("Reversed: " + reverseString(str));
	    }
	}


