/**
 * =========================================================
 * MAIN CLASS - UseCase6PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 6: Queue + Stack Fairness Check
 *
 * Description:
 * This class demonstrates palindrome validation using
 * two different data structures:
 *
 * - Queue (FIFO - First In First Out)
 * - Stack (LIFO - Last In First Out)
 *
 * Characters are inserted into both structures and then
 * compared by removing from the front of the queue and
 * the top of the stack.
 *
 * If all characters match, the input string is confirmed
 * as a palindrome.
 *
 * This use case helps understand how FIFO and LIFO
 * behaviors can be combined for symmetric comparison.
 *
 * @author Developer
 * @version 6.0
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC6.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // ─────────────────────────────────────────────
        // Application Header
        // ─────────────────────────────────────────────
        System.out.println("=========================================");
        System.out.println("      PalindromeCheckerApp  v6.0        ");
        System.out.println("  UC6: Queue + Stack Fairness Check      ");
        System.out.println("=========================================");

        // ─────────────────────────────────────────────
        // Step 1: Declare and initialize the input string
        //
        //  A hardcoded String literal stored in the
        //  String constant pool.
        // ─────────────────────────────────────────────
        String input = "civic";

        System.out.println("\nInput String     : \"" + input + "\"");
        System.out.println("=========================================");

        // ─────────────────────────────────────────────
        // Step 2: Create a Queue and a Stack
        //
        //  Queue<Character>:
        //    - Interface from java.util
        //    - Implemented by LinkedList (supports FIFO ops)
        //    - offer() / add()  → enqueue (insert at rear)
        //    - poll() / remove() → dequeue (remove from front)
        //    - FIFO: first character in = first character out
        //
        //  Stack<Character>:
        //    - Class from java.util
        //    - push() → insert at top
        //    - pop()  → remove from top
        //    - LIFO: last character in = first character out
        //            → naturally reverses insertion order
        // ─────────────────────────────────────────────
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // ─────────────────────────────────────────────
        // Step 3: Enqueue AND Push each character
        //
        //  Both data structures receive the same characters
        //  in the same order.
        //
        //  Example for "civic":
        //    Queue (FIFO): front → [c, i, v, i, c] ← rear
        //    Stack (LIFO): bottom → [c, i, v, i, c] ← top
        //
        //  When we read from them:
        //    Queue gives: c → i → v → i → c  (original order)
        //    Stack gives: c → i → v → i → c  (reversed order)
        //
        //  For a palindrome, both orders are identical!
        // ─────────────────────────────────────────────
        System.out.println("\n--- Enqueuing & Pushing Characters ---");
        for (char c : input.toCharArray()) {
            queue.offer(c);   // Enqueue → adds to rear of Queue (FIFO)
            stack.push(c);    // Push    → adds to top of Stack  (LIFO)
            System.out.println("  Enqueued & Pushed : '" + c + "'");
        }

        System.out.println("\n  Queue (FIFO) : " + queue);
        System.out.println("  Stack (LIFO) : " + stack);

        // ─────────────────────────────────────────────
        // Step 4: Compare — Dequeue vs Pop
        //
        //  queue.poll() → removes from FRONT  (original order)
        //  stack.pop()  → removes from TOP    (reverse order)
        //
        //  Symmetric Comparison:
        //    If the string is a palindrome, dequeue output
        //    and pop output will always match character by character.
        //
        //    "civic"
        //    Dequeue: c  i  v  i  c   (left → right)
        //    Pop    : c  i  v  i  c   (right → left, reversed)
        //    Match  : ✔  ✔  ✔  ✔  ✔
        // ─────────────────────────────────────────────
        System.out.println("\n--- Dequeue (Queue) vs Pop (Stack) Comparison ---");

        boolean isPalindrome = true;
        int index = 0;

        while (!queue.isEmpty()) {
            char fromQueue = queue.poll();  // Dequeue → FIFO (original order)
            char fromStack = stack.pop();   // Pop     → LIFO (reverse order)

            System.out.println("  Step [" + index + "]  Dequeued = '" + fromQueue +
                    "'  |  Popped = '" + fromStack + "'  →  " +
                    (fromQueue == fromStack ? "Match ✔" : "Mismatch ✘"));

            // ─────────────────────────────────────────────
            // If dequeued character ≠ popped character,
            // the string is NOT a palindrome → exit early
            // ─────────────────────────────────────────────
            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
            index++;
        }

        // ─────────────────────────────────────────────
        // Step 5: Display Result
        // ─────────────────────────────────────────────
        System.out.println("-----------------------------------------");
        if (isPalindrome) {
            System.out.println("Result           : \"" + input + "\" IS a Palindrome ✔");
        } else {
            System.out.println("Result           : \"" + input + "\" is NOT a Palindrome ✘");
        }

        System.out.println("=========================================");
        System.out.println("\nProgram exiting... Goodbye!");
        System.out.println("=========================================");
    }
}
