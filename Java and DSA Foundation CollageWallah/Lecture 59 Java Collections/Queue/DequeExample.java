
import java.util.ArrayDeque;
import java.util.Deque;

/* Doubly Ended Queue Insertion and Deltion can be done from both the ends */
public class DequeExample {
    public static void Solution(){

        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addLast(4);

        System.out.println(dq);
        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());
        System.out.println(dq);
        System.out.println(dq.poll());

    }
    public static void main(String[] args) {
        Solution();
    }
}
