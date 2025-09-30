import java.util.Stack;

class StackManipulator {
    /**
     * TO-DO: Remove and return the element at the bottom of the stack.
     * The rest of the elements must be put back in their original order.
     \*
     * @param stack The stack to modify.
     * @return The integer element from the bottom of the stack.
     */
    public Integer removeBottomElement(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return null;
        }

        Stack<Integer> tempStack = new Stack<>();
        //  Move elements from 'stack' to 'tempStack'.
        while (!stack.isEmpty()) {
            tempStack.push(stack.pop());//  this puts it back
        }

// Now only one element is left in tempStack → the bottom one
        Integer bottomElement = tempStack.pop();
        while (!tempStack.isEmpty()){
            stack.push(tempStack.pop()) ;

        }
        return bottomElement;
    }
}