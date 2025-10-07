import java.util.Stack;

class TextEditor {
    private StringBuilder content;
    private Stack<String> history;

    public TextEditor() {
        this.content = new StringBuilder();
        this.history = new Stack<>();
    }

    public void type(String text) {
        history.push(content.toString());  // Save current state before typing
        content.append(text);
    }

    public void undo() {
        if (!history.isEmpty()) {
            content = new StringBuilder(history.pop());  // Restore last state
        }
    }

    public String getContent() {
        return content.toString();
    }
}
