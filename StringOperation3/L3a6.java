//Write a Java Program for Capitalizing the first letter of each word. using user defined function
//capitalizeWords()
package LAB3a;

public class L3a6 {
	   public static String capitalizeWords(String str) {
	        String[] words = str.split("\\s+");
	        StringBuilder result = new StringBuilder();
	        for (String word : words) {
	            result.append(Character.toUpperCase(word.charAt(0)))
	                  .append(word.substring(1)).append(" ");
	        }
	        return result.toString().trim();
	    }

	    public static void main(String[] args) {
	        String str = "hello world";
	        System.out.println("The Original String:"+ str);
	        System.out.println("Capitalized: " + capitalizeWords(str));
	    }


}
