/**
 * =========================================================
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 4: Character Array Based Validation
 *
 * Description:
 * This class validates a palindrome by converting
 * the string into a character array and comparing
 * characters using the two-pointer technique.
 *
 * At this stage, the application:
 * - Converts string to char array
 * - Uses start and end pointers
 * - Compares characters efficiently
 * - Displays the result
 *
 * This reduces extra memory usage.
 *
 * @author Developer
 * @version 4.0
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC4.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // ─────────────────────────────────────────────
        // Application Header
        // ─────────────────────────────────────────────
        System.out.println("=========================================");
        System.out.println("      PalindromeCheckerApp  v4.0        ");
        System.out.println("  UC4: Character Array Based Validation  ");
        System.out.println("=========================================");

        // ─────────────────────────────────────────────
        // Step 1: Declare hardcoded test strings
        // ─────────────────────────────────────────────
        String[] testWords = { "madam", "hello", "racecar", "world", "level" };

        for (String word : testWords) {

            System.out.println("\nChecking word   : \"" + word + "\"");

            // ─────────────────────────────────────────────
            // Step 2: Convert String to char[]
            //
            //  toCharArray() converts the String into a
            //  primitive character array (char[]).
            //  Each character is stored at an index starting
            //  from 0.
            //
            //  Example: "madam" → ['m','a','d','a','m']
            //                       0    1    2    3    4
            // ─────────────────────────────────────────────
            char[] chars = word.toCharArray();

            System.out.print("char[] contents : [ ");
            for (char c : chars) {
                System.out.print("'" + c + "' ");
            }
            System.out.println("]");

            // ─────────────────────────────────────────────
            // Step 3: Two-Pointer Technique
            //
            //  start → begins at index 0 (leftmost character)
            //  end   → begins at last index (rightmost character)
            //
            //  Each iteration:
            //    - Compare chars[start] with chars[end]
            //    - If they differ → NOT a palindrome, break
            //    - If they match  → move start forward, end backward
            //    - Stop when start >= end (middle reached)
            //
            //  This avoids creating a reversed copy, reducing
            //  extra memory usage. Only O(1) extra space used.
            //  Time Complexity: O(n/2) → effectively O(n)
            // ─────────────────────────────────────────────
            int start = 0;
            int end = chars.length - 1;
            boolean isPalindrome = true;

            System.out.println("-----------------------------------------");
            System.out.println("Two-Pointer Comparison:");

            while (start < end) {
                System.out.println("  chars[" + start + "] = '" + chars[start] +
                        "'  <-->  chars[" + end + "] = '" + chars[end] + "'");

                // ─────────────────────────────────────────────
                // Step 4: Compare characters at start and end
                //
                //  chars[start] != chars[end] means the string
                //  cannot be a palindrome → set flag and break
                // ─────────────────────────────────────────────
                if (chars[start] != chars[end]) {
                    isPalindrome = false;
                    break;
                }

                // Move pointers inward
                start++;
                end--;
            }

            // ─────────────────────────────────────────────
            // Step 5: Display Result
            // ─────────────────────────────────────────────
            System.out.println("-----------------------------------------");
            if (isPalindrome) {
                System.out.println("Result          : \"" + word + "\" IS a Palindrome ✔");
            } else {
                System.out.println("Result          : \"" + word + "\" is NOT a Palindrome ✘");
            }
            System.out.println("=========================================");
        }

        System.out.println("\nProgram exiting... Goodbye!");
        System.out.println("=========================================");
    }
}