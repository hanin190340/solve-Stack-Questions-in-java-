import java.util.Stack;

class ThePathSimplifier {

    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] components = path.split("/");
        for (String component : components) {
            if (component.equals("") || component.equals(".")) {
                // Do nothing, skip
                continue;
            } else if (component.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();  // Go up one level
                }
            } else {
                stack.push(component);  // Valid directory
            }
        }
        if (stack.isEmpty()) {
            return "/";
        }
// Use a StringBuilder to join the elements in the stack
        StringBuilder addToStack = new StringBuilder();
        for (String dir : stack) {
            addToStack.append("/").append(dir);
        }
        return addToStack.toString();
    }
}
