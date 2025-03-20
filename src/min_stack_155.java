import java.util.Stack;

public class min_stack_155 {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public min_stack_155() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if(val <= minStack.peek() || minStack.isEmpty()){
            minStack.push(val);
        }
    }

    public void pop() {
        int val = stack.pop();
        if(val == minStack.peek()){
            minStack.pop();
        }

    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
