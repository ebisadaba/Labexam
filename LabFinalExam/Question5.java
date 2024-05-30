public class Question5 {
    public static void main(String[] args) {

        String original = "Hello World";
        String reversed = reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }

    public static String reverseString(String input) {
        char[] stack = new char[input.length()];
        int top = -1;
        for (char ch : input.toCharArray()) {
            stack[++top] = ch;
        }

        StringBuilder reversed = new StringBuilder();
        while (top >= 0) {
            reversed.append(stack[top--]);
        }

        return reversed.toString();
    }
}


