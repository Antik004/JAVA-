
public class tpriority extends Thread{
    public void run(){
        String n=Thread.currentThread().getName();
        System.out.println(n);
    }
    public static void main(String[] args)throws InterruptedException
    {
        // Scanner sc=new Scanner(System.in);
        tpriority t1=new tpriority();
        tpriority t2=new tpriority();
        tpriority t3=new tpriority();

        // System.out.println("Enter priority for thread 1");
        // int a=sc.nextInt();
        // System.out.println("Enter priority for thread 2");
        // int b=sc.nextInt();
        // System.out.println("Enter priority for thread 3");
        // int c=sc.nextInt();

        t1.setPriority(1);
        t2.setPriority(5);
        t3.setPriority(10);

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
        t3.join();
    }
}
