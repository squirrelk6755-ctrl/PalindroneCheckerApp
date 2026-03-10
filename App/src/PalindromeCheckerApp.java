/**
 * =========================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 *
 * At this stage, the application:
 * - Uses a palindrome strategy implementation
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 *
 * This use case focuses purely on performance
 * measurement and algorithm comparison.
 *
 * The goal is to introduce benchmarking concepts.
 *
 * @author Developer
 * @version 13.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC13.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Define the input string
        String input = "level";

        System.out.println("========================================");
        System.out.println("  UC13: Palindrome Performance Comparison");
        System.out.println("========================================");
        System.out.println("Input : " + input);
        System.out.println();

        // --- Benchmark 1: Two-Pointer Approach ---
        long startTime1 = System.nanoTime();
        boolean result1 = twoPointerCheck(input);
        long endTime1 = System.nanoTime();
        long duration1 = endTime1 - startTime1;

        System.out.println("--- Two-Pointer Approach ---");
        System.out.println("Is Palindrome?  : " + result1);
        System.out.println("Execution Time  : " + duration1 + " ns");
        System.out.println();

        // --- Benchmark 2: Stack-Based Approach ---
        long startTime2 = System.nanoTime();
        boolean result2 = stackCheck(input);
        long endTime2 = System.nanoTime();
        long duration2 = endTime2 - startTime2;

        System.out.println("--- Stack-Based Approach ---");
        System.out.println("Is Palindrome?  : " + result2);
        System.out.println("Execution Time  : " + duration2 + " ns");
        System.out.println();

        // --- Benchmark 3: Deque-Based Approach ---
        long startTime3 = System.nanoTime();
        boolean result3 = dequeCheck(input);
        long endTime3 = System.nanoTime();
        long duration3 = endTime3 - startTime3;

        System.out.println("--- Deque-Based Approach ---");
        System.out.println("Is Palindrome?  : " + result3);
        System.out.println("Execution Time  : " + duration3 + " ns");
        System.out.println();

        // --- Benchmark 4: StringBuilder Reverse Approach ---
        long startTime4 = System.nanoTime();
        boolean result4 = stringBuilderCheck(input);
        long endTime4 = System.nanoTime();
        long duration4 = endTime4 - startTime4;

        System.out.println("--- StringBuilder Reverse Approach ---");
        System.out.println("Is Palindrome?  : " + result4);
        System.out.println("Execution Time  : " + duration4 + " ns");
        System.out.println();

        // --- Summary ---
        System.out.println("========================================");
        System.out.println("  Summary");
        System.out.println("========================================");
        System.out.println("Two-Pointer     : " + duration1 + " ns");
        System.out.println("Stack-Based     : " + duration2 + " ns");
        System.out.println("Deque-Based     : " + duration3 + " ns");
        System.out.println("StringBuilder   : " + duration4 + " ns");
    }

    /**
     * Two-Pointer approach to check palindrome.
     *
     * @param input String to validate
     * @return true if palindrome, false otherwise
     */
    private static boolean twoPointerCheck(String input) {
        int start = 0;
        int end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    /**
     * Stack-based approach to check palindrome.
     *
     * @param input String to validate
     * @return true if palindrome, false otherwise
     */
    private static boolean stackCheck(String input) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    /**
     * Deque-based approach to check palindrome.
     *
     * @param input String to validate
     * @return true if palindrome, false otherwise
     */
    private static boolean dequeCheck(String input) {
        java.util.ArrayDeque<Character> deque = new java.util.ArrayDeque<>();
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }

    /**
     * StringBuilder reverse approach to check palindrome.
     *
     * @param input String to validate
     * @return true if palindrome, false otherwise
     */
    private static boolean stringBuilderCheck(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }
}