import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {

        String s = "(){}[]";
        Stack<Character> stack = new Stack<>();
        boolean isValid = true;

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    isValid = false;
                    break;
                }
                char open = stack.pop();
                if (ch == ')' && open != '(' ||
                    ch == '}' && open != '{' ||
                    ch == ']' && open != '[') {
                    isValid = false;
                    break;
                }
            }
        }

        if (!stack.isEmpty()) {
            isValid = false;
        }

        System.out.println("Valid Parentheses: " + isValid);
    }
}
