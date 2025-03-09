import java.util.*;
public class bubblesort {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("  Enter the size of the array");
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter a number");
            int c=sc.nextInt();
            a[i]=c;
        }
        for(int j=0;j<n;j++)
        {
            System.out.print(a[j]+" ");  
        }  
        for(int m=0;m<n;m++)
        {
        for(int k=0;k<n-m-1;k++)       //let n=5;  termination condition-->   k=5-4-1 
        {
            if(a[k]>a[k+1])
            {
                int temp=a[k];
                a[k]=a[k+1];
                a[k+1]=temp;
            }
        } 
    } 
    System.out.println();
        for(int l=0;l<n;l++)
        {
            System.out.print(a[l]+" ");
        }
    }
}
