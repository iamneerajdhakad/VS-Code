import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackusingQueues {

    public static class queueA{
        
        Queue<Integer> q = new LinkedList<>();
    
        public void push(int x) {
        
            q.add(x);
        }
    
        public int pop() {
            for(int i = 1; i <= q.size()-1; i++){
                q.add(q.remove());
            }
            int x = q.remove();
            return x;
        
        }
    
        public int top() {
        
            for(int i = 1; i <= q.size()-1; i++){
                q.add(q.remove());
            }
            int x = q.peek();
            q.add(q.remove());
            return x;
        }
    
        @SuppressWarnings("SizeReplaceableByIsEmpty")
        public boolean empty() {
            if(q.size()==0)   return true;
            else return false;
        }

    }

    public static class queueB{
        
        Queue<Integer> q = new LinkedList<>();
    
        public void push(int x) {

            q.add(x);

            for(int i = 1; i <= q.size()-1; i++){
                q.add(q.remove());
            }
            
        }
    
        public int pop() {
            return q.remove();
        }
    
        public int top() {
            return q.peek();
        }
    
        @SuppressWarnings("SizeReplaceableByIsEmpty")
        public boolean empty() {
            if(q.size()==0) return true;
            else return false;
        }

    }


    public static void main(String[] args) {
        
    }
}
