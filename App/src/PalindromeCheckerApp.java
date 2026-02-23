/**
 * =========================================================
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 5: Stack Based Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Stack
 * data structure which follows the LIFO principle.
 *
 * At this stage, the application:
 * - Pushes characters into a stack
 * - Pops them in reverse order
 * - Compares with original sequence
 * - Displays the result
 *
 * This maps stack behavior to reversal logic.
 *
 * @author Developer
 * @version 5.0
 */

import java.util.Stack;

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC5.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // ─────────────────────────────────────────────
        // Application Header
        // ─────────────────────────────────────────────
        System.out.println("=========================================");
        System.out.println("      PalindromeCheckerApp  v5.0        ");
        System.out.println("    UC5: Stack Based Palindrome Checker  ");
        System.out.println("=========================================");

        // ─────────────────────────────────────────────
        // Step 1: Declare and initialize the input string
        //
        //  String literal stored in the String constant pool.
        //  toCharArray() will be used to iterate characters.
        // ─────────────────────────────────────────────
        String input = "noon";

        System.out.println("\nInput String    : \"" + input + "\"");

        // ─────────────────────────────────────────────
        // Step 2: Create a Stack to store characters
        //
        //  Stack<Character> uses Java's built-in Stack class.
        //  It follows the LIFO (Last In First Out) principle:
        //  The last character pushed will be the first popped.
        //
        //  Stack<>() uses diamond inference — Java infers
        //  the generic type from the declared type on the left.
        // ─────────────────────────────────────────────
        Stack<Character> stack = new Stack<>();

        // ─────────────────────────────────────────────
        // Step 3: Push each character of the string into the stack
        //
        //  toCharArray() converts String → char[]
        //  Each character 'c' is auto-boxed from char → Character
        //  before being pushed onto the Stack<Character>.
        //
        //  Example for "noon":
        //    push('n') → stack: [n]
        //    push('o') → stack: [n, o]
        //    push('o') → stack: [n, o, o]
        //    push('n') → stack: [n, o, o, n]  ← top
        // ─────────────────────────────────────────────
        System.out.println("\n--- Pushing characters into Stack ---");
        for (char c : input.toCharArray()) {
            stack.push(c);
            System.out.println("  Pushed : '" + c + "'  →  Stack: " + stack);
        }

        // ─────────────────────────────────────────────
        // Step 4: Assume palindrome initially
        //
        //  Boolean flag used to track the palindrome state.
        //  Will be set to false if any mismatch is found.
        // ─────────────────────────────────────────────
        boolean isPalindrome = true;

        // ─────────────────────────────────────────────
        // Step 5: Iterate again through original string
        //         and pop characters from the stack to compare
        //
        //  Because Stack follows LIFO, popping returns characters
        //  in REVERSE order — this is the reversal logic.
        //
        //  Each popped character is compared with the corresponding
        //  character in the original string (left to right).
        //
        //  Example for "noon":
        //    pop() → 'n'  compare with input.charAt(0) = 'n'  ✔
        //    pop() → 'o'  compare with input.charAt(1) = 'o'  ✔
        //    pop() → 'o'  compare with input.charAt(2) = 'o'  ✔
        //    pop() → 'n'  compare with input.charAt(3) = 'n'  ✔
        // ─────────────────────────────────────────────
        System.out.println("\n--- Popping and Comparing characters ---");
        int index = 0;
        for (char c : input.toCharArray()) {
            char popped = stack.pop();
            System.out.println("  Original[" + index + "] = '" + c +
                    "'  |  Popped = '" + popped + "'  →  " +
                    (c == popped ? "Match ✔" : "Mismatch ✘"));

            // ─────────────────────────────────────────────
            // If the original character and the popped character
            // do not match → string is NOT a palindrome
            // ─────────────────────────────────────────────
            if (c != popped) {
                isPalindrome = false;
                break;
            }
            index++;
        }

        // ─────────────────────────────────────────────
        // Step 6: Display Result
        // ─────────────────────────────────────────────
        System.out.println("-----------------------------------------");
        if (isPalindrome) {
            System.out.println("Result          : \"" + input + "\" IS a Palindrome ✔");
        } else {
            System.out.println("Result          : \"" + input + "\" is NOT a Palindrome ✘");
        }

        System.out.println("=========================================");
        System.out.println("\nProgram exiting... Goodbye!");
        System.out.println("=========================================");
    }
}