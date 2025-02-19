
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void Solution(){

        PriorityQueue<Integer> pq = new PriorityQueue<>();// Min PQ;
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());//Max PQ

        System.out.println("Max PQ : ");

        pq1.add(10);
        pq1.add(5);
        pq1.add(7);

        System.out.println(pq1.peek());
        System.out.println(pq1);// Guarantee -topmost priority elt will be processed first
        System.out.println(pq1.poll());
        System.out.println(pq1);
        System.out.println(pq1.peek());


        System.out.println("Min PQ :");

        pq.add(10);
        pq.add(5);
        pq.add(7);

        System.out.println(pq.peek());
        System.out.println(pq);// Guarantee -topmost priority elt will be processed first
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.peek());


    }
    public static void main(String[] args) {
        Solution();
    }
}
