import java.util.*;

public class collectionstack {
    public static void main(String[]args)
    {
        Stack <String> k=new Stack<>();
        k.push("h");
        k.push("e");
        System.out.println(k.pop());
        System.out.println(k.pop());
        k.push("hello");
        System.out.println(k.peek());
    }    
}
