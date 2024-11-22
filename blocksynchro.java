class display{
    public void show(String name)
    {
        synchronized(this)
        {
            for(int i=0;i<=3;i++)
            {
                System.out.println(name);
            }
        }
        
    }
}
class  thread extends Thread{
    display m;
    String name;
    public thread(display m,String name)
    {
        this.m=m;
        this.name=name;
    }
    public void run()
    {
        m.show(name);
    }
}
public class blocksynchro {
    public static void main(String[] args)
    {
        display m=new display();
        thread t1=new thread(m,"Antik");
        thread t2=new thread(m,"Anirban");

        t1.start();
        t2.start();
    }
}
