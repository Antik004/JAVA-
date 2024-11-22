public class joinimple extends Thread{
    public void run(){
        try{
        String n=Thread.currentThread().getName();
        for(int i=0;i<=4;i++)
        {
            System.out.println(n);
            Thread.sleep(2000);
        }
    }
    catch(InterruptedException e)
    {
        System.out.println("Error");
    }
    }
    public static void  main(String[] args)
    {
        joinimple A=new joinimple();
        joinimple B=new joinimple();
        joinimple C=new joinimple();

        A.setName("thread 1");
        B.setName("thread 2");
        C.setName("thread 3");
        A.start();
        try{
        A.join();
        }
        catch(InterruptedException e)
        {
            System.out.println("Error");
        }
        B.start();
        C.start();
    }
}
