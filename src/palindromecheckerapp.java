import java.util.Deque;
import java.util.ArrayDeque;
public class palindromecheckerapp {

    public static void main(String[] args) {

        String original = "racecar";
        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < original.length(); i++) {
            deque.addLast(original.charAt(i));
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrome (Using Deque)");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}

        if (isPalindrome) {
            System.out.println("Palindrome (Queue + Stack)");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}