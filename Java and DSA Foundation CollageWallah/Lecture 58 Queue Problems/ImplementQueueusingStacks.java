import java.util.Stack;

public class ImplementQueueusingStacks {
    
    public static class queueA{
        Stack<Integer> st = new Stack<>();
    Stack<Integer> helper = new Stack<>();
    
    public void push(int x) {
        st.push(x);
    }
    
        @SuppressWarnings("SizeReplaceableByIsEmpty")
    public int pop() {
        while(st.size()>1){
            helper.push(st.pop());
        }
        int x = st.pop();
        while(helper.size()>0){
            st.push(helper.pop());
        }
        return x;
    }
    
        @SuppressWarnings("SizeReplaceableByIsEmpty")
    public int peek() {
        while(st.size()>1){
            helper.push(st.pop());
        }
        int x = st.peek();
        while(helper.size()>0){
            st.push(helper.pop());
        }
        return x;
    }
    
        @SuppressWarnings("SizeReplaceableByIsEmpty")
    public boolean empty() {
        if(st.size()==0) return true;
        else return false;
    }
    }
}
