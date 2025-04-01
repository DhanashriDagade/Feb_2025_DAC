import java.util.Stack;

public class BalancedParentheses {
    public static boolean isBalanced(String exp) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : exp.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        String exp1 = "[()]";
        String exp2 = "[()]{[()()]()}";

        System.out.println("Input: " + exp1 + "\nOutput: " + (isBalanced(exp1) ? "Balanced" : "Not Balanced"));
        System.out.println("Input: " + exp2 + "\nOutput: " + (isBalanced(exp2) ? "Balanced" : "Not Balanced"));
    }
}
