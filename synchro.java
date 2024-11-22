public class synchro implements Runnable {
    public static int available = 1;  // Made static to be shared among all threads

    public synchronized void run() {
        if (available == 1) {
            System.out.println("Seat is available");
            available--;  // Decrement to mark the seat as taken
        } else {
            System.out.println("Seat not available");
        }
    }

    public static void main(String[] args) {

        synchro r= new synchro();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        
        t1.start();
        t2.start();
        t3.start();
    }
}
