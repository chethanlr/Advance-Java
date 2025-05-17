//Write a Java Program for Checking if a given string is null or contains only whitespace using user
//defined function isNullOrEmpty().
package LAB3a;

public class L3a1 {
    public static void main(String[] args) {
        System.out.println(isNullOrBlank(null));      // true
        System.out.println(isNullOrBlank("   "));     // true
        System.out.println(isNullOrBlank("hello"));   // false
    }

    static boolean isNullOrBlank(String s) {
        return s == null || s.trim().length() == 0;
    }
}
