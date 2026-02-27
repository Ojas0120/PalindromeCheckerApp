package com.palindromechecker.uc1;

/**
 * UC1: Application Entry & Welcome Message
 *
 * Goal  : Display a welcome message and app details at startup.
 * Actor : User
 *
 * Flow:
 *   1. Program starts.
 *   2. JVM invokes the main() method.
 *   3. Application name is displayed.
 *   4. Application version is displayed.
 *   5. Program continues to next use case or exits.
 *
 * Key Concepts:
 *   - Class            : Container for application logic.
 *   - Main Method      : Entry point  public static void main(String[] args)
 *   - Static Keyword   : Allows JVM to invoke main() without creating an object.
 *   - Console Output   : System.out.println() displays messages on the console.
 *   - Application Flow : Defines startup behavior before palindrome processing.
 */
public class WelcomeMessage {

    /**
     * Displays the application name and version at startup.
     * Called from the main entry point before any palindrome processing begins.
     */
    public static void display() {
        System.out.println("============================================");
        System.out.println("        Welcome to PalindromeChecker        ");
        System.out.println("                 Version 1.0                ");
        System.out.println("============================================");
        System.out.println("  A console-based Java application that     ");
        System.out.println("  validates whether a given string is a     ");
        System.out.println("  palindrome under different conditions.    ");
        System.out.println("============================================");
        System.out.println();
    }

    // UC1 standalone entry point
    public static void main(String[] args) {
        display();
        System.out.println("Application started. Proceeding to next use case...");
    }
}
