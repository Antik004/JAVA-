public class arithexcep {
    public static void main(String[] args)
    {
        int a=5;
        int b=0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception caught:"+e);
        }
        System.out.println("Program has completed");
    }
}
