class A implements Runnable 
{
    public void run(){
        try{
        for(int i=0;i<=5;i++)
        {
            System.out.println("Antik");
            Thread.sleep(1000);
        }
    }
    catch(InterruptedException e)
    {
        System.out.println("ERROR");
    }
    }
};
class B{
    public static void main(String[] args)
    {
        A obj=new A();
        Thread t=new Thread(obj);
        t.start();
    }
}