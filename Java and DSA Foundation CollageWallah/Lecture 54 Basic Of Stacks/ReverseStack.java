import java.util.Stack;

public class ReverseStack {

    public static void Iterative(Stack<Integer> st){

        Stack<Integer> rt = new Stack<>();

        while(!st.isEmpty()){
            rt.push(st.pop());
        }

        //System.out.println(rt);

        Stack<Integer> at = new Stack<>();

        while(!rt.isEmpty()){
            at.push(rt.pop());
        }

        //System.out.println(at);

        while(!at.isEmpty()){
            st.push(at.pop());
        }

    }

    public static void PushAtBottom(Stack<Integer> st,int val){

        if(st.isEmpty()){
            st.push(val);
            //System.out.print(st.peek()+" ");
            return;
        }  
        
        int top = st.pop();
        PushAtBottom(st,val);
        st.push(top);
        //System.out.print(st.peek() + " ");
        
        
    }

    public static void Recursive(Stack<Integer> st){

        if(st.size()==1)    return;

        int top = st.pop();
        Recursive(st);
        PushAtBottom(st,top);

    }

    public static void main(String[] args) {
        
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        // Iterative(st);

        // System.out.println(st);

        // Recursive(st);
        // System.out.println(st);

    }
    
}
