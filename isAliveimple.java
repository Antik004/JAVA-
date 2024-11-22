public class isAliveimple extends Thread {
    public void run()
    {
        System.out.println(isAlive());
    }
    public static void main(String[] args)throws InterruptedException
    {
        isAliveimple A=new isAliveimple();
        isAliveimple B=new isAliveimple();
        isAliveimple C=new isAliveimple();
        System.out.println(A.isAlive());
        A.start();
        A.join();
        System.out.println(B.isAlive());
        B.start();
        B.join();
        System.out.println(C.isAlive());
        C.start();
        C.join();
        System.out.println(C.isAlive());
        C.interrupt();
        System.out.println(C.isAlive());

    }
}
