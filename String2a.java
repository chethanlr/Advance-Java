/*2 a. Develop a java program for performing various string operations with different string
handling functions directed as follows
String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String
Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with
contains( ) and startsWith() and endsWith()*/

package ADV_Java;

public class String2a {
    public static void main(String[] args) {
        // 1. String Creation and Basic Operations
        // Create strings using literals and new keyword
        String str1 = "Hello, Java!";
        String str2 = new String("Welcome to Java");
        // Convert string to uppercase
        String upperStr = str1.toUpperCase();
        System.out.println("1. String Creation and Basic Operations:");
        System.out.println("Original str1: " + str1);
        System.out.println("Uppercase str1: " + upperStr);
        System.out.println("str2: " + str2);

        // 2. Length and Character Access
        // Get length and access specific characters
        int length = str1.length();
        char firstChar = str1.charAt(0);
        char lastChar = str1.charAt(str1.length() - 1);
        System.out.println("\n2. Length and Character Access:");
        System.out.println("Length of str1: " + length);
        System.out.println("First character of str1: " + firstChar);
        System.out.println("Last character of str1: " + lastChar);

        // 3. String Comparison
        // Compare strings using equals, equalsIgnoreCase, and compareTo
        String str3 = "hello, java!";
        boolean isEqual = str1.equals(str3);
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str3);
        int compareResult = str1.compareTo(str2);
        System.out.println("\n3. String Comparison:");
        System.out.println("str1 equals str3: " + isEqual);
        System.out.println("str1 equalsIgnoreCase str3: " + isEqualIgnoreCase);
        System.out.println("str1 compareTo str2: " + compareResult);

        // 4. String Searching
        // Search for substrings and characters
        String searchStr = "Java is fun";
        int indexOfJava = searchStr.indexOf("Java");
        int lastIndexOfIs = searchStr.lastIndexOf("is");
        boolean containsFun = searchStr.contains("fun");
        System.out.println("\n4. String Searching:");
        System.out.println("Index of 'Java' in searchStr: " + indexOfJava);
        System.out.println("Last index of 'is' in searchStr: " + lastIndexOfIs);
        System.out.println("searchStr contains 'fun': " + containsFun);

        // 5. Substring Operations
        // Extract substrings
        String subStr1 = str1.substring(7); // From index 7 to end
        String subStr2 = str1.substring(0, 5); // From index 0 to 4
        System.out.println("\n5. Substring Operations:");
        System.out.println("Substring from index 7: " + subStr1);
        System.out.println("Substring from index 0 to 4: " + subStr2);

        // 6. String Modification
        // Replace characters and substrings
        String modifiedStr = str1.replace("Java", "World");
        String replacedChar = str1.replace('l', 'L');
        System.out.println("\n6. String Modification:");
        System.out.println("Replace 'Java' with 'World': " + modifiedStr);
        System.out.println("Replace 'l' with 'L': " + replacedChar);

        // 7. Whitespace Handling
        // Trim and handle whitespace
        String spacedStr = "   Hello   World   ";
        String trimmedStr = spacedStr.trim();
        String noExtraSpaces = spacedStr.replaceAll("\\s+", " ");
        System.out.println("\n7. Whitespace Handling:");
        System.out.println("Original spacedStr: '" + spacedStr + "'");
        System.out.println("Trimmed spacedStr: '" + trimmedStr + "'");
        System.out.println("spacedStr with single spaces: '" + noExtraSpaces + "'");

        // 8. String Concatenation
        // Concatenate strings
        String concatStr = str1.concat(" ").concat(str2);
        String plusOperator = str1 + " " + str2;
        System.out.println("\n8. String Concatenation:");
        System.out.println("Using concat(): " + concatStr);
        System.out.println("Using + operator: " + plusOperator);

        // 9. String Splitting
        // Split a string into an array
        String csv = "Apple,Banana,Orange,Grape";
        String[] fruits = csv.split(",");
        System.out.println("\n9. String Splitting:");
        System.out.println("CSV string: " + csv);
        System.out.print("Split fruits: ");
        for (String fruit : fruits) {
            System.out.print(fruit.trim() + " ");
        }
        System.out.println();

        // 10. StringBuilder Demo
        // Demonstrate StringBuilder for mutable string operations
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" is");
        sb.append(" awesome!");
        sb.insert(4, " Programming");
        sb.delete(4, 15);
        System.out.println("\n10. StringBuilder Demo:");
        System.out.println("StringBuilder result: " + sb.toString());

        // 11. String Formatting
        // Format strings using String.format
        String name = "Alice";
        int age = 25;
        double salary = 50000.50;
        String formattedStr = String.format("Name: %s, Age: %d, Salary: %.2f", name, age, salary);
        System.out.println("\n11. String Formatting:");
        System.out.println("Formatted string: " + formattedStr);

        // 12. Validate Email with contains(), startsWith(), and endsWith()
        // Validate an email address
        String email = "user@example.com";
        boolean isValidEmail = email.contains("@") && 
                              !email.startsWith("@") && 
                              email.endsWith(".com") && 
                              email.indexOf("@") == email.lastIndexOf("@");
        System.out.println("\n12. Email Validation:");
        System.out.println("Email: " + email);
        System.out.println("Is valid email: " + isValidEmail);
    }
}