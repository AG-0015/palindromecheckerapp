import java.util.Deque;
import java.util.ArrayDeque;
public class palindromecheckerapp {

    public static void main(String[] args) {

        // Original String
        String original = "racecar";

        // Create Deque
        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (int i = 0; i < original.length(); i++) {
            deque.addLast(original.charAt(i));   // Insert at rear
        }

        boolean isPalindrome = true;

        // Compare front and rear until deque size <= 1
        while (deque.size() > 1) {

            char front = deque.removeFirst();  // Remove from front
            char rear  = deque.removeLast();   // Remove from rear

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The string \"" + original + "\" is a Palindrome (Using Deque).");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
        }
    }
}
