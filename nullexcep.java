public class nullexcep {
    public static void main(String args[])
    {

        String str=null;
        try{
        System.out.println(str.toUpperCase());
        }
        catch(NullPointerException e){
            System.out.println("Exception caught-----"+e);
        }
    }
    
}
