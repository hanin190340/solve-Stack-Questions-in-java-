import java.util.Stack;

class HtmlValidator {
    public boolean isWellFormed(String[] tags) {
        Stack<String> tagStack = new Stack<>();
        for (String tag : tags) {
            if (tag.startsWith("</")) { // Closing tag
                // 1. Get the tag name (e.g., "p" from "</p>").
                String tagName = tag.substring(2, tag.length() - 1);
                // 2. Check if the stack is empty. If so, return false.
                if (tagStack.isEmpty()) {
                    return false;
                }
                // 3. Pop from the stack and check if it matches the closing tag's name. If not, return false.
                String openTag = tagStack.pop();
                if (!openTag.equals(tagName)) {
                    return false;
                }
            }   // 4. Get the tag name (e.g., "html" from "<html>").
            else {
                // Opening tag
                String tagName = tag.substring(1, tag.length() - 1);
                tagStack.push(tagName);
            }
        }

        return tagStack.isEmpty(); // All tags matched
    }
}