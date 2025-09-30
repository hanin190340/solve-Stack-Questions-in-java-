import java.util.Stack;

class TaskManager {

    public String getTaskSequence(Stack<String> tasks) {
        if (tasks.isEmpty()) {
            return "";
        }
// move all elements from 'tasks' to 'reversedStack'.
        Stack<String> reversedStack = new Stack<>();
        while (!tasks.isEmpty()){
            reversedStack.push(tasks.pop());
        }

        StringBuilder sequence = new StringBuilder();
        // pop from 'reversedStack' to build the string.
        while (!reversedStack.isEmpty()) {
          String pop = reversedStack.pop();
          sequence.append(pop);
          // Don't forget to add " -> " between tasks but not at the end.
      if (!reversedStack.isEmpty()){
          sequence.append(" -> ");
      }
            tasks.push(pop);
        }


        // Finally, restore the original 'tasks' stack by moving elements back.

        return sequence.toString();
    }
}