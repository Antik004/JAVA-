import java.util.*;
public class primcompo {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,x;

        System.out.println("Enter size of array");
        n=sc.nextInt();
        int a[]=new int[n];
        String b[]=new String[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter a number");
            x=sc.nextInt();
            a[i]=x;
        }
        for(int j=0;j<n;j++)
        {
            int s=0;
            for(int k=1;k<=a[j];k++)
            {
                
                if(a[j]%k==0)
                {
                    s=s+1;
                }
            
            }
            if(s==2)
            {
                b[j]="Prime";
            }
            else 
            {
                b[j]="Composite";
            }
        }
        for(int l=0;l<n;l++)
        {
            System.out.println(b[l]);
        }
    }
}
