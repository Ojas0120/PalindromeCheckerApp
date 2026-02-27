package com.palindromechecker.main;

import com.palindromechecker.uc1.WelcomeMessage;
import com.palindromechecker.uc2.HardcodedPalindrome;
import com.palindromechecker.uc3.StringReversalChecker;
import com.palindromechecker.uc4.CharArrayChecker;
import com.palindromechecker.uc5.StackChecker;
import com.palindromechecker.uc6.QueueStackChecker;
import com.palindromechecker.uc7.DequeChecker;

import java.util.Scanner;

/**
 * PalindromeChecker — Main Entry Point
 *
 * This class ties together all 7 use cases into a single
 * interactive console application.
 *
 * Use Cases:
 *   UC1 - Application Entry & Welcome Message
 *   UC2 - Print a Hardcoded Palindrome Result
 *   UC3 - Palindrome Check Using String Reversal
 *   UC4 - Character Array Based Palindrome Check
 *   UC5 - Stack-Based Palindrome Checker
 *   UC6 - Queue + Stack Based Palindrome Check
 *   UC7 - Deque-Based Optimized Palindrome Check
 */
public class PalindromeChecker {

    static void displayMenu() {
        System.out.println("============================================");
        System.out.println("              SELECT A USE CASE             ");
        System.out.println("============================================");
        System.out.println("  1. UC1 - Application Entry & Welcome");
        System.out.println("  2. UC2 - Hardcoded Palindrome Result");
        System.out.println("  3. UC3 - String Reversal Check");
        System.out.println("  4. UC4 - Character Array Check");
        System.out.println("  5. UC5 - Stack-Based Check");
        System.out.println("  6. UC6 - Queue + Stack Check");
        System.out.println("  7. UC7 - Deque-Based Optimized Check");
        System.out.println("  8. Run All Use Cases");
        System.out.println("  0. Exit");
        System.out.println("============================================");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args) {

        // UC1: Display welcome message at startup
        WelcomeMessage.display();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();

            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Enter a number: ");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                System.out.println("\nThank you for using PalindromeChecker. Goodbye!");
                break;
            }

            String input = "";
            if (choice >= 3 && choice <= 8) {
                System.out.print("Enter a string to check: ");
                input = scanner.nextLine();
            }

            System.out.println();

            switch (choice) {
                case 1:
                    WelcomeMessage.display();
                    break;
                case 2:
                    HardcodedPalindrome.printResult();
                    break;
                case 3:
                    StringReversalChecker.printResult(input);
                    break;
                case 4:
                    CharArrayChecker.printResult(input);
                    break;
                case 5:
                    StackChecker.printResult(input);
                    break;
                case 6:
                    QueueStackChecker.printResult(input);
                    break;
                case 7:
                    DequeChecker.printResult(input);
                    break;
                case 8:
                    System.out.println("========== Running All Use Cases ==========\n");
                    WelcomeMessage.display();
                    HardcodedPalindrome.printResult();
                    StringReversalChecker.printResult(input);
                    CharArrayChecker.printResult(input);
                    StackChecker.printResult(input);
                    QueueStackChecker.printResult(input);
                    DequeChecker.printResult(input);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.\n");
            }

        } while (choice != 0);

        scanner.close();
    }
}
