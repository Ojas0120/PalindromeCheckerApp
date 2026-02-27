package com.palindromechecker.uc5;

import java.util.Scanner;
import java.util.Stack;

/**
 * UC5: Stack-Based Palindrome Checker
 *
 * Goal  : Use a Stack data structure to check if a string is a palindrome
 *         by pushing all characters and popping them to reconstruct the reverse.
 * Actor : User
 *
 * Flow:
 *   1. User enters a string.
 *   2. Each character is pushed onto a Stack.
 *   3. Characters are popped from the Stack (LIFO = reverse order).
 *   4. Reconstructed reverse is compared with the original.
 *   5. Result is displayed.
 *
 * Key Concepts:
 *   - Stack (LIFO)     : Last In, First Out — pop() returns characters in reverse.
 *   - push()           : Adds a character to the top of the stack.
 *   - pop()            : Removes and returns the top character.
 *   - isEmpty()        : Checks if the stack has no more elements.
 *   - Data Structures  : Demonstrates practical use of Stack in palindrome logic.
 */
public class StackChecker {

    /**
     * Checks if the given string is a palindrome using a Stack.
     *
     * @param input the string to check
     * @return true if palindrome, false otherwise
     */
    public static boolean isPalindrome(String input) {
        String normalized = input.toLowerCase().trim();
        Stack<Character> stack = new Stack<>();

        // Push every character onto the stack
        for (char c : normalized.toCharArray()) {
            stack.push(c);
        }

        // Pop characters to reconstruct the reversed string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return normalized.equals(reversed.toString());
    }

    /**
     * Displays the stack-based palindrome check result.
     *
     * @param input the original string
     */
    public static void printResult(String input) {
        String normalized = input.toLowerCase().trim();
        Stack<Character> stack = new Stack<>();
        for (char c : normalized.toCharArray()) {
            stack.push(c);
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        boolean result = normalized.equals(reversed.toString());

        System.out.println("--------------------------------------------");
        System.out.println("UC5: Stack-Based Palindrome Checker");
        System.out.println("--------------------------------------------");
        System.out.println("Input    : \"" + input + "\"");
        System.out.println("Reversed : \"" + reversed + "\"  (via Stack pop)");
        System.out.println("Result   : " + (result ? "IS a palindrome" : "NOT a palindrome"));
        System.out.println("--------------------------------------------");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("UC5 - Enter a string: ");
        String input = scanner.nextLine();
        printResult(input);
        scanner.close();
    }
}
