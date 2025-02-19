
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReorderQueue {
    @SuppressWarnings("SizeReplaceableByIsEmpty")
    public static Queue<Integer> reorder(Queue<Integer> q){

        Stack<Integer> st = new Stack<>();
        
        int mid = q.size()/2;

        for(int i = 0; i < mid; i++){// Q: 5 6 7 8 , st:  1 2 3 4 
            st.push(q.remove());
        }
        
        for(int i = 0; i < mid; i++){// Q: 4 5 6 7 8 4 3 2 1 
            q.add(st.pop());
        }

        
        for(int i = 0; i < mid; i++){// Q: 4 3 2 1  , st: 5 6 7 8 
            st.push(q.remove());
        }

        for(int i = 0; i < mid; i++){ // 4 8 3 7 2 6 1 5 
            if(st.size()>0) {
                q.add(st.pop());
            }
            q.add(q.remove());
        }

        while(!q.isEmpty()){
            st.push(q.remove());
        }

        while(!st.isEmpty()){
            q.add(st.pop());
        }
        
        return q;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);

        System.out.println(reorder(q));
    }
}
