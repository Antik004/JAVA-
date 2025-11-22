import java.util.*;
public class collection2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str="20,30,40,50";
        

        List <Integer> parts=new ArrayList<>();

        String splitter[]=str.split(",");

        for(String i:splitter)
        {
            int k=Integer.parseInt(i);
            parts.add(k*2);
        }

        System.out.println(parts);

        for(int j=0;j<parts.size();j++)
        {
            parts.set(j,2*(parts.get(j)));
            System.out.print(" "+parts.get(j));
        }
    }
}
