public class threadSchd extends Thread{
    
    public void run(){
        String n=Thread.currentThread().getName();
        for(int i=1;i<=3;i++)
        {
        System.out.println(n);
        }
    }
    public static void main(String[] args)throws InterruptedException
    {
        threadSchd t1=new threadSchd();
        threadSchd t2=new threadSchd();
        threadSchd t3=new threadSchd();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}
