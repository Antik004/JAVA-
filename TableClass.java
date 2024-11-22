class Table {
    public synchronized void table(int n) { // Synchronize this method to prevent interleaving output
        for (int i = 0; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}

class Thread1 extends Thread {
    Table t;

    public Thread1(Table t) {
        this.t = t;
    }

    public void run() {
        t.table(5);
    }
}

class Thread2 extends Thread {
    Table t;

    public Thread2(Table t) {
        this.t = t;
    }

    public void run() {
        t.table(7);
    }
}

public class TableClass {
    public static void main(String[] args) {
        Table t = new Table(); // Create an instance of Table

        Thread1 t1 = new Thread1(t);
        Thread2 t2 = new Thread2(t);

        t1.start();
        t2.start();
    }
}
