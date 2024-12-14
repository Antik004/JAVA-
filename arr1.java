public class arr1 {
    public static void main(String[] args)
    {
        int i,x=100;
        int a[]=new int[5]; 
        for(i=0;i<=4;i++)
        {
          a[i]=x;                               //[100|  |  |  |  ]       [100|200|  |  |  ]
          x=x+100;  
       
        }
        for(int j=0;j<=4;j++)
        {
          System.out.print("|"+a[j]);  //[100 | 200 |  300 |  400  |500 ]
        }
    }
}
