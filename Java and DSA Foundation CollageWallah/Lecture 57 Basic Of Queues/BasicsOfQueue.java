
import java.util.LinkedList;
import java.util.Queue;



public class BasicsOfQueue {

    @SuppressWarnings("SizeReplaceableByIsEmpty")
    public static void main(String[] args) {
        
        Queue<Integer> q = new LinkedList<>();
        
        Queue<Integer> p = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);

        while(q.size()!=0){

            System.out.print(q.element()+" ");
            p.add(q.remove());
        
        }

        
        while(p.size()!=0){

           // System.out.print(q.element()+" ");
            q.add(p.remove());
        
        }
        
        
    
    }
    
}
