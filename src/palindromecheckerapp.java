import java.util.Stack;
public class palindromecheckerapp {
    public static void main(String[] args) {

        String original = "level";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        if (original.equals(reversed)) {
            System.out.println("Palindrome (Using Stack)");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}