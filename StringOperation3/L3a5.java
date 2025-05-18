//Write a Java Program for Eliminating all whitespace characters from a string using user defined
//function removeWhitespace()
package LAB3a;

public class L3a5 {
	public static String removeWhitespace(String str) {
        return str.replaceAll("\\s", "");
    }

    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println("With whitespace:" + str);
        System.out.println("Without Whitespace: " + removeWhitespace(str));
    }
}
