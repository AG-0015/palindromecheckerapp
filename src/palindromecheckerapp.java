import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class palindromecheckerapp {

    public static void main(String[] args) {

        String original = "madam";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < original.length(); i++) {
            char ch = original.charAt(i);
            queue.add(ch);
            stack.push(ch);
        }

        boolean isPalindrome = true;

        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrome (Queue + Stack)");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}