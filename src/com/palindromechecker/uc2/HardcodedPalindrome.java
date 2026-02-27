package com.palindromechecker.uc2;

/**
 * UC2: Print a Hardcoded Palindrome Result
 *
 * Goal  : Demonstrate a basic palindrome result using a hardcoded string,
 *         without any user input or logic processing.
 * Actor : User
 *
 * Flow:
 *   1. A string value is hardcoded inside the program.
 *   2. The string is printed to the console.
 *   3. A hardcoded result ("is a palindrome") is printed.
 *
 * Key Concepts:
 *   - String Literal   : A fixed string value assigned directly in code.
 *   - Variables        : Used to store the string being evaluated.
 *   - Console Output   : System.out.println() prints the result.
 *   - No User Input    : Demonstrates output-only behavior at this stage.
 */
public class HardcodedPalindrome {

    /**
     * Prints a hardcoded palindrome string and its result to the console.
     */
    public static void printResult() {
        // Hardcoded palindrome string
        String word = "racecar";

        System.out.println("--------------------------------------------");
        System.out.println("UC2: Hardcoded Palindrome Result");
        System.out.println("--------------------------------------------");
        System.out.println("String  : \"" + word + "\"");
        System.out.println("Result  : \"" + word + "\" is a palindrome.");
        System.out.println("--------------------------------------------");
        System.out.println();
    }

    public static void main(String[] args) {
        printResult();
    }
}
