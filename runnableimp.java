
public class runnableimp implements Runnable {
    public void run()
    {
         try{
        for(int i=0;i<=7;i++)
        {
            System.out.println("Hello this is Child Thread"+i);
             Thread.sleep(1000);
        }
    }
        catch(InterruptedException e)
        {
            System.out.println("ERROR");
         }
    }


    public static void main(String[] args)throws InterruptedException
    {
        runnableimp a=new runnableimp();
        Thread t=new Thread(a);
        t.run();
        for(int i=0;i<=7;i++)
        {
            System.out.println("Hello this is Main Thread"+i);
              Thread.sleep(1000);
        }
    }
}
