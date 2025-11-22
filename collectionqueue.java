import java.util.*;
public class collectionqueue {
    public static void main(String[] args) {
        {
            Queue <Integer> q=new LinkedList<>();

            q.offer(12);
            System.out.println(q);

            System.out.println(q.poll());
        }
    }
}
