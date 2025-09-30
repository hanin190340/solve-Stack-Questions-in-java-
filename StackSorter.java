import java.util.Stack;

class StackSorter {
    /**
     * TO-DO: Sort the given stack so that the smallest element is at the top.
     * You may use a temporary stack, but no other data structures.
     \*
     * @param stack The stack of integers to be sorted.
     */
    public void sortStack(Stack<Integer> stack) {
        Stack<Integer> sortedStack = new Stack<>();
        // While the original stack is not empty...
while (!stack.isEmpty()){
    // Pop an element.

    Integer pop = stack.pop();
    // While the sorted stack is not empty and its top is smaller than the element...
    while (!sortedStack.isEmpty() && sortedStack.peek() > pop){
        // Move elements from sorted back to original.

        stack.push(sortedStack.pop());
    }
    // Push the element to the sorted stack.
    sortedStack.push(pop);
}
// After the main loop, copy the sorted stack back to the original stack.
while (!sortedStack.isEmpty()){
    stack.push(sortedStack.pop());
}

    }
}
