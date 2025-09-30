
import java.util.Stack;

class PalindromeChecker {
    /**
     * TO-DO: Use a Stack to determine if a string is a palindrome.
     \*
     * @param input The string to check.
     * @return true if the string is a palindrome, false otherwise.
     */
    public boolean isPalindrome(String input) {
        String lowercased = input.toLowerCase();
        Stack<Character> stack = new Stack<>();
        // Push all characters of 'lowercased' onto the stack.
        for (int i = 0; i < lowercased.length(); i++) {
            stack.push(lowercased.charAt(i));
        }
        StringBuilder reversed = new StringBuilder();
        // Pop all characters from the stack and append to 'reversed'.
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
//  Compare 'lowercased' with the reversed string.
        return lowercased.equals(reversed.toString());

    }
}