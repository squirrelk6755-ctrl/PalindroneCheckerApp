
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // ─────────────────────────────────────────────
        // Application Header
        // ─────────────────────────────────────────────
        System.out.println("=========================================");
        System.out.println("      PalindromeCheckerApp  v1.0        ");
        System.out.println("      UC2: Hardcoded Palindrome Check    ");
        System.out.println("=========================================");

        // ─────────────────────────────────────────────
        // Step 1: Declare a hardcoded String literal
        // ─────────────────────────────────────────────
        String word = "madam";

        System.out.println("\nChecking : \"" + word + "\"");

        // ─────────────────────────────────────────────
        // Step 2: Reverse the string using StringBuilder
        //         StringBuilder.reverse() reverses the
        //         character sequence of the string.
        // ─────────────────────────────────────────────
        String reversed = new StringBuilder(word).reverse().toString();

        System.out.println("Reversed : \"" + reversed + "\"");
        System.out.println("-----------------------------------------");

        // ─────────────────────────────────────────────
        // Step 3: Compare original vs reversed using
        //         if-else conditional statement.
        //         String.equals() performs case-sensitive
        //         comparison of two String objects.
        // ─────────────────────────────────────────────
        if (word.equals(reversed)) {
            System.out.println("Result   : \"" + word + "\" IS a Palindrome ✔");
        } else {
            System.out.println("Result   : \"" + word + "\" is NOT a Palindrome ✘");
        }

        System.out.println("=========================================");
        System.out.println("Program exiting... Goodbye!");
        System.out.println("=========================================");
    }
}