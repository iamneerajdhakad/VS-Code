
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseKelements {

    @SuppressWarnings("SizeReplaceableByIsEmpty")
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        Stack<Integer> st = new Stack<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        int k = 3;

        for (int i = 0; i < k; i++) {
            st.push(q.remove());
        }
        
        while(st.size()>0){
            q.add(st.pop());
        }

        int n = q.size() - k;

        for(int i = 0; i < n; i++){
            q.add(q.remove());
        }
        System.out.println(q);
    }
    
}
