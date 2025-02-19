import java.util.Stack;

public class InsertionUsingRecursion {

    public static void insertUsingRec(Stack<Integer> st,int val){

        if(st.isEmpty()){
            st.push(val);
            System.out.print(st.peek()+" ");
            return;
        }  
        
        int top = st.pop();
        insertUsingRec(st,val);
        st.push(top);
        System.out.print(st.peek() + " ");
        
        
    }
    
    public static void main(String[] args) {
        
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);


       insertUsingRec(st, 0);
       System.out.println(st);

    }
}
