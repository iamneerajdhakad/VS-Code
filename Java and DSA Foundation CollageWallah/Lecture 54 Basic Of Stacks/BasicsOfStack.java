
import java.util.Stack;

public class BasicsOfStack {

    public static void main(String[] args) {
        
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(90);
        st.push(5);

        System.out.println(st.peek());
        System.out.println("size  of stack: " + st.size());
        st.pop();
        System.out.println(st.peek());
        System.out.println("size  of stack: " + st.size());
        st.pop();
        System.out.println(st.peek());
        System.out.println("size  of stack: " + st.size());
        st.pop();
        System.out.println(st.peek());
        System.out.println("size  of stack: " + st.size());

    }
    
}
