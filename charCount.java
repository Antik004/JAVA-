import java.util.*;

class charCount
{
    public static void main(String[] args)
    {
        System.out.println("Enter a string");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char arr[]=str.toCharArray();
        Arrays.sort(arr);
        Map <Character,Integer> frequency =new LinkedHashMap<>();
        for(char ch:arr)
        {
            frequency.put(ch,frequency.getOrDefault(ch,0)+1);
        }

        int x=frequency.size();
        List<Character>keys=new ArrayList<>(frequency.keySet());
        List<Integer>values=new ArrayList<>(frequency.values());

        for(int i=0;i<x;i++)
        {
            System.out.print(keys.get(i)+":"+values.get(i)+" ");
        }
    }
}