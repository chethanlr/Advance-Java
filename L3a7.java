//Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
//defined function truncate()
package LAB3a;

public class L3a7 {
    public static void main(String[] args) {
        String message = "Hello World!";
        int maxLen = 5;

        String result = truncate(message, maxLen);
        System.out.println("Truncated: " + result);
    }

    // User-defined function to truncate a string and add ellipsis if necessary
    static String truncate(String text, int limit) {
        if (text == null || text.length() <= limit) {
            return text;
        }
        return text.substring(0, limit) + "...";
    }
}
