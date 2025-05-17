//Write a Java Program for Verifying if a string contains only numeric characters using user defined
//function isNumeric()
package LAB3a;

public class L3a8 {
	public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }
    public static void main(String[] args) {
        String str = "12345";
        String str1 = "12qsef";
        System.out.println("Is Numeric: " + isNumeric(str));
        System.out.println("Is Numeric: " + isNumeric(str1));
    }
}
