import java.util.*;
public class array{
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        String a[]=new String[5];
        int i=0;
        while(i<=4)
        {
            System.out.println("Enter a String");
            String x=sc.nextLine();
            a[i]=x;
            i++;
        }
        for(int j=0;j<=4;j++)
        {
            System.out.print(" "+a[j]);
        }

    }
}