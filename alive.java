class A extends Thread{
    public void run(){
        boolean k=Thread.currentThread().isAlive();
        System.out.println(k);
        
    }
}

public class alive {
    public static void main(String[] args)
    {
        A obj=new A();
        obj.start(); 

    }
}
