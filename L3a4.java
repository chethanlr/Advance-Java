//Write a Java Program for Checking if a string reads the same backward as forward (ignoring case
//and punctuation) using user defined function isPalindrome():
package LAB3a;

public class L3a4 {
	public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return str.equals(new StringBuilder(str).reverse().toString());
    }
    public static void main(String[] args) {
        String str = "Madam, in Eden, I'm Adam";
        System.out.println("The String " + str);
        System.out.println("Is Palindrome: " + isPalindrome(str));
    }
}
