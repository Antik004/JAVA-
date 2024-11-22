class Stack {
    private int maxSize = 5;
    private int[] stackArray = new int[maxSize];
    private int top = -1;

    // Push operation
    public synchronized void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
            System.out.println("Pushed: " + value);
            notify();  // Notify the pop thread
        }
    }

    // Pop operation
    public synchronized void pop() {
        if (top >= 0) {
            int value = stackArray[top--];
            System.out.println("Popped: " + value);
            notify();  // Notify the push thread
        }
    }
}

class PushThread extends Thread {
    private Stack stack;
    private int value = 1;

    public PushThread(Stack stack) {
        this.stack = stack;
    }

    @Override
    public void run() {
        while (true) {
            stack.push(value++);
            try {
                Thread.sleep(500); // Sleep for a while to see the output
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

class PopThread extends Thread {
    private Stack stack;

    public PopThread(Stack stack) {
        this.stack = stack;
    }

    @Override
    public void run() {
        while (true) {
            stack.pop();
            try {
                Thread.sleep(500); // Sleep for a while to see the output
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class StackThreadExample {
    public static void main(String[] args) {
        Stack stack = new Stack();

        // Start the push and pop threads
        new PushThread(stack).start();
        new PopThread(stack).start();
    }
}
