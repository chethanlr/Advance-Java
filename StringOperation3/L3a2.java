//Write a Java Program for Counting how many times a substring appears in a main string
//using user defined function countOccurrences()
package LAB3a;

public class L3a2 {
	    public static int countOccurrences(String mainStr, String subStr) {
	        int count = 0, index = 0;
	        while ((index = mainStr.indexOf(subStr, index)) != -1) {
	            count++;
	            index += subStr.length();
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	        String mainStr = "hello world hello";
	        String subStr = "hello";
	        System.out.println("Occurrences of '" + subStr + "': " + countOccurrences(mainStr, subStr));
	    }
	}


