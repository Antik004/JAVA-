class threads1 extends Thread { // Define a thread
    public void run() {
       try{
        System.out.println("This is a child Thread");
        Thread.sleep(1000);
        }
        catch(InterruptedException e)
         {
            
         }
    }
    public static void main(String[] args)throws InterruptedException {
        threads1 t = new threads1(); 
        t.start();
        System.out.println("This is the Main thread");
        Thread.sleep(1000);
    }
}
