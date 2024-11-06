import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        SharedStack sharedStack = new SharedStack();
        Thread pushThread = new Thread(new Pusher(sharedStack));
        Thread popThread = new Thread(new Popper(sharedStack));
        
        pushThread.start();
        popThread.start();
    }
}

class SharedStack {
    private Stack<Integer> stack = new Stack<>();
    private boolean canPush = true;

    public synchronized void push(int value) throws InterruptedException {
        while (!canPush) {
            wait();
        }
        stack.push(value);
        System.out.println("Pushed " + value);
        canPush = false;
        notify();
    }

    public synchronized void pop() throws InterruptedException {
        while (canPush) {
            wait();
        }
        int value = stack.pop();
        System.out.println("Popped " + value);
        canPush = true;
        notify();
    }
}

class Pusher implements Runnable {
    private SharedStack sharedStack;

    public Pusher(SharedStack sharedStack) {
        this.sharedStack = sharedStack;
    }

    @Override
    public void run() {
        int[] valuesToPush = {5, -1, 10, -2, 20};
        try {
            for (int value : valuesToPush) {
                sharedStack.push(value);
                Thread.sleep(100); // Optional sleep to slow down the operations for clarity
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Popper implements Runnable {
    private SharedStack sharedStack;

    public Popper(SharedStack sharedStack) {
        this.sharedStack = sharedStack;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) { // Matching the number of push operations
                sharedStack.pop();
                Thread.sleep(100); // Optional sleep to slow down the operations for clarity
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
