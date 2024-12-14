import java.util.*;
public class arrsum
    {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int sum=0;
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<=n-1;i++)
        {
            System.out.println("Enter value no "+ (i+1));
            int x=sc.nextInt();
            a[i]=x;
        }
        for(int j=0;j<=n-1;j++)
        {
            sum=sum+a[j];
        }
        System.out.println("Sum is "+sum);
    }
}
