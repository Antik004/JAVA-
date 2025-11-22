import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class collectionpriority {
    public static void main(String[]args)
    {
        Queue<Integer> q = new PriorityQueue<>();

        q.offer(12);
        q.offer(13);
        q.offer(1);
        q.offer(24);
        q.offer(89);

        System.out.println(q);
        q.poll();
        System.out.println(q);
        System.out.println(q.peek());
        q.poll();
        System.out.println(q);



        //----------------------------------------//
        Queue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(12);
        pq.offer(13);
        pq.offer(1);
        pq.offer(24);
        pq.offer(89);

        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());
        pq.poll();
        System.out.println(pq);

    }
}
