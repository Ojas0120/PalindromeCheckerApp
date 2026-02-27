# PalindromeChecker App

A console-based Java application that validates whether a given string is a palindrome under different conditions, while strengthening core programming fundamentals and data structure concepts.

## Use Cases

| UC  | Title                                    | Key Concept                        |
|-----|------------------------------------------|------------------------------------|
| UC1 | Application Entry & Welcome Message      | Class, main(), static, println()   |
| UC2 | Print a Hardcoded Palindrome Result      | String literals, variables         |
| UC3 | Palindrome Check Using String Reversal   | StringBuilder, equals()            |
| UC4 | Character Array Based Palindrome Check   | toCharArray(), two-pointer         |
| UC5 | Stack-Based Palindrome Checker           | Stack, LIFO, push(), pop()         |
| UC6 | Queue + Stack Based Palindrome Check     | Queue, FIFO, LinkedList, combined  |
| UC7 | Deque-Based Optimized Palindrome Check   | Deque, ArrayDeque, n/2 comparisons |

## Folder Structure

```
PalindromeChecker/
├── src/com/palindromechecker/
│   ├── main/   PalindromeChecker.java
│   ├── uc1/    WelcomeMessage.java
│   ├── uc2/    HardcodedPalindrome.java
│   ├── uc3/    StringReversalChecker.java
│   ├── uc4/    CharArrayChecker.java
│   ├── uc5/    StackChecker.java
│   ├── uc6/    QueueStackChecker.java
│   └── uc7/    DequeChecker.java
├── bin/
├── test/
└── README.md
```

## How to Compile & Run

```bash
# Compile all source files
javac -d bin src/com/palindromechecker/**/*.java

# Run the main application
java -cp bin com.palindromechecker.main.PalindromeChecker

# Run a single UC (example: UC5)
java -cp bin com.palindromechecker.uc5.StackChecker
```
