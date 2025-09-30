import java.util.Stack;

class BracketChecker {
    public boolean isBalancedRefactored(String expr) {
        Stack<Character> stack = new Stack<>();
        for (char c : expr.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                //  check if the stack is empty
                if (stack.isEmpty()) {
                    return false;
                }
                //if the popped element matches.
                char isOpening = stack.pop();
                 if (c==')' &&  isOpening !='(' || c=='}' &&  isOpening !='{' || c==']' &&  isOpening !='[' )  {
                     return false;

                }
                // If not, return false immediately.
            }
        }
        return stack.isEmpty();
    }
}
