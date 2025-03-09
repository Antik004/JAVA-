import java.util.*;
public class vowelcheck {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i,n,s=0;
        System.out.println("Enter the number of elements");
        n=sc.nextInt();
        char a[]=new char[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter a character");
            char c=Character.toLowerCase(sc.next().charAt(0));
            a[i]=c;
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                s++;
            }
        }
        System.out.println("There are "+s+" vowels in the array");
        for(int j=0;j<n;j++){
            System.out.print(a[j]+"|");
        }
    }
}
