

class OverflowException extends Exception {
    public OverflowException(String message) {
        super(message);
    }
}

class UnderflowException extends Exception {
    public UnderflowException(String message) {
        super(message);
    }
}

public class Stack {
    private int stackArray[];
    private int top;

    // Constructor
    public Stack(int size) {
        stackArray = new int[size];
        top = -1;
    }

    // Push method
    public void push(int value) throws OverflowException {
        if (top == stackArray.length - 1) {
            throw new OverflowException("Stack is full");
        }
        stackArray[++top] = value;
        System.out.println("Pushed: " + value);
    }

    // Pop method
    public int pop() throws UnderflowException {
        if (top == -1) {
            throw new UnderflowException("Stack is empty");
        }
        int poppedValue = stackArray[top--];
        System.out.println("Popped: " + poppedValue);
        return poppedValue;
    }

    // Main method for testing
    public static void main(String[] args) {
        Stack stack = new Stack(3);

        try {
            stack.push(1);
            // stack.push(2);
            // stack.push(3);
            // stack.push(5);
            // stack.push(6);
            // Uncomment to test overflow
            // stack.push(4);

            stack.pop();
            stack.pop();
            stack.pop();
            // Uncomment to test underflow
            // stack.pop();

        } catch (OverflowException | UnderflowException e) {
            System.out.println(e.getMessage());
        }
    }
}
