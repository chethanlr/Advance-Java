//Write a Java Program for Counting the number of words in a string using user defined function
//countWords()
package LAB3a;

public class L3a10 {
	 public static int countWords(String str) {
	        return str.trim().isEmpty() ? 0 : str.trim().split("\\s+").length;
	    }
	    public static void main(String[] args) {
	        String str = "This is a test string";
	        System.out.println("The statemnet:"+ str);
	        System.out.println("Word Count: " + countWords(str));
	    }
}
