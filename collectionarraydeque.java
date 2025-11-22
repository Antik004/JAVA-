
import java.util.ArrayDeque;

public class collectionarraydeque {
    public static void main(String[] args) {
        {
            ArrayDeque <Integer> adq=new ArrayDeque<>();

            adq.offer(23);
            adq.offerFirst(12);
            adq.offerLast(89);

            System.out.println(adq);
        }
    }
}
