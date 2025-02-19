import java.util.Stack;

public class DisplayStack {

    public static void UsingStack(Stack<Integer> st){

        Stack<Integer> rt = new Stack<>();

        while(!st.isEmpty()){
            rt.push(st.pop());
        }

        while(!rt.isEmpty()){

            int x = rt.pop();
            System.out.print(x + " ");
            st.push(x);
        }

        System.out.println();

    }

    public static void UsingArray(Stack<Integer> st){

        int n = st.size();
        int[] arr = new  int[n];

        for(int i = n -1; i >= 0; i--){
            arr[i]=st.pop();
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+ " ");
            st.push(arr[i]);
        }

        System.out.println();
    }

    public static void ReverseUsingRecursion(Stack<Integer> st){

        if(st.isEmpty())    return;

        int top = st.pop();
        System.out.print(top+" ");
        ReverseUsingRecursion(st);
        st.push(top);

        System.out.println();
    
    }
        
    public static void UsingRecursion(Stack<Integer> st){

        if(st.isEmpty())    return;

            int top = st.pop();
            UsingRecursion(st);
            System.out.print(top+" ");
            st.push(top);

        System.out.println();

    }



    public static void main(String[] args) {
        
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        //System.out.println(st);

        //UsingStack(st);
        //UsingArray(st);
        UsingRecursion(st);//Reverse
        System.out.println(st);

       
        
    }
    
}
