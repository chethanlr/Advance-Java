/*2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for
appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify
your answer which one is better.*/

package ADV_Java;

public class String2b {
    public static void main(String[] args) {
        // Define the string to append and the number of iterations
        final String TO_APPEND = "AIET";
        final int ITERATIONS = 10_000;

        // Performance test for StringBuilder
        StringBuilder builder = new StringBuilder();
        // Record start time for StringBuilder
        long startTimeBuilder = System.nanoTime();
        // Append "AIET" 10,000 times using StringBuilder
        for (int i = 0; i < ITERATIONS; i++) {
            builder.append(TO_APPEND);
        }
        // Record end time for StringBuilder
        long endTimeBuilder = System.nanoTime();
        // Calculate duration in milliseconds
        double builderDurationMs = (endTimeBuilder - startTimeBuilder) / 1_000_000.0;

        // Performance test for StringBuffer
        StringBuffer buffer = new StringBuffer();
        // Record start time for StringBuffer
        long startTimeBuffer = System.nanoTime();
        // Append "AIET" 10,000 times using StringBuffer
        for (int i = 0; i < ITERATIONS; i++) {
            buffer.append(TO_APPEND);
        }
        // Record end time for StringBuffer
        long endTimeBuffer = System.nanoTime();
        // Calculate duration in milliseconds
        double bufferDurationMs = (endTimeBuffer - startTimeBuffer) / 1_000_000.0;

        // Display the performance results
        System.out.println("Performance Test Results:");
        System.out.printf("StringBuilder time: %.3f ms%n", builderDurationMs);
        System.out.printf("StringBuffer time: %.3f ms%n", bufferDurationMs);

        // Justify which is better
        System.out.println("\nJustification:");
        System.out.println("StringBuilder is generally faster than StringBuffer because it is not synchronized, ");
        System.out.println("meaning it does not incur the overhead of thread-safety mechanisms. ");
        System.out.println("In this single-threaded test, StringBuilder is expected to perform better.");
        System.out.println("However, if thread safety is required in a multi-threaded environment, ");
        System.out.println("StringBuffer should be used despite its slower performance.");
    }
}