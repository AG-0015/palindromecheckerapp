

import java.util.Scanner;
import java.util.Stack;
public class PalindromeChecker {

    // Method 1: Basic palindrome check
    public static boolean isBasicPalindrome(String str) {

        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    // Method 2: Ignore case
    public static boolean isCaseInsensitivePalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }

    // Method 3: Ignore spaces and special characters
    public static boolean isCleanPalindrome(String str) {
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    // Method 4: Stack based palindrome check
    public static boolean isStackPalindrome(String str) {
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

// Push all characters into stack
        for (char c : cleaned.toCharArray()) {
            stack.push(c);
        }

// Compare characters by popping
        for (char c : cleaned.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Palindrome Checker App ====");
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("\nChoose checking method:");
        System.out.println("1. Basic Palindrome");
        System.out.println("2. Ignore Case");
        System.out.println("3. Ignore Spaces & Special Characters");
        System.out.println("4. Stack Based Palindrome");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        boolean result = false;

        switch (choice) {
            case 1:
                result = isBasicPalindrome(input);
                break;

            case 2:
                result = isCaseInsensitivePalindrome(input);
                break;

            case 3:
                result = isCleanPalindrome(input);
                break;

            case 4:
                result = isStackPalindrome(input);
                break;

            default:
                System.out.println("Invalid choice!");
                System.exit(0);
        }

        if (result) {
            System.out.println("The given string is a PALINDROME.");
        } else {
            System.out.println("The given string is NOT a palindrome.");
        }

        sc.close();
    }
}
