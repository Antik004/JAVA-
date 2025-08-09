import java.util.*;
class mok1
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st string");
        String s1=sc.nextLine();
        System.out.println("Enter 2nd string");
        String s2=sc.nextLine();
        System.out.println("Enter 3rd string");
        String s3=sc.nextLine();
        String sx=s1+s2;
        if(sx.equals(s3))
        {
            System.out.println(true);
        }
        else
            System.out.println("False");
    }
}