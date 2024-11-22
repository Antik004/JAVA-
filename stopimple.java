public class stopimple extends Thread {
    public void run(){
        String n=Thread.currentThread().getName();
        System.out.println("I am Thread"+n);
    }
    public static void main(String[] args)
    {
        stopimple A=new stopimple();
        stopimple B=new stopimple();
        stopimple C=new stopimple();

        A.setName("1");
        B.setName("2");
        C.setName("3");

        A.start();
        B.start();
        B.stop();
        C.start();

    }
    
}
