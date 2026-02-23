
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // ─────────────────────────────────────────────
        // Application Header
        // ─────────────────────────────────────────────
        System.out.println("=========================================");
        System.out.println("      PalindromeCheckerApp  v1.0        ");
        System.out.println("      UC3: Palindrome Check via Reverse  ");
        System.out.println("=========================================");

        // ─────────────────────────────────────────────
        // Step 1: Declare hardcoded test strings
        //         Testing both a palindrome and a non-palindrome
        // ─────────────────────────────────────────────
        String[] testWords = { "madam", "hello", "racecar", "world", "level" };

        for (String word : testWords) {

            System.out.println("\nOriginal String : \"" + word + "\"");

            // ─────────────────────────────────────────────
            // Step 2: Reverse the string using a for loop
            //
            //  - word.length() - 1  → start from the last index
            //  - i >= 0             → loop until the first character
            //  - i--                → move backwards through the string
            //  - word.charAt(i)     → fetch character at position i
            //  - String concatenation (+) builds reversed string
            //
            //  NOTE: String is IMMUTABLE in Java.
            //  Each use of (+) creates a NEW String object in memory.
            //  This is intentionally shown here to later discuss
            //  why StringBuilder is preferred for performance.
            // ─────────────────────────────────────────────
            String reversed = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                reversed = reversed + word.charAt(i);  // String concatenation
            }

            System.out.println("Reversed String : \"" + reversed + "\"");
            System.out.println("-----------------------------------------");

            // ─────────────────────────────────────────────
            // Step 3: Compare using equals()
            //
            //  equals() compares the CONTENT of two String objects.
            //  Using == would compare memory references (object addresses),
            //  which would give incorrect results for String comparison.
            // ─────────────────────────────────────────────
            if (word.equals(reversed)) {
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