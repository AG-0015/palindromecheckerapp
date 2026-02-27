public class palindromecheckerapp {

    public static void main(String[] args) {

        String original = "Madam";
        String lower = original.toLowerCase();
        String reversed = "";

        for (int i = lower.length() - 1; i >= 0; i--) {
            reversed += lower.charAt(i);
        }

        if (lower.equals(reversed)) {
            System.out.println(original + " is Palindrome (Case-Insensitive)");
        } else {
            System.out.println(original + " is NOT Palindrome");
        }
    }
}