
import java.util.Scanner;
import java.util.Stack;

public class InsertionInStack {

    @SuppressWarnings({ "SizeReplaceableByIsEmpty", "resource" })
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int  i = 0; i < n; i++){
            int x = sc.nextInt();
            st.push(x);
        }

        System.out.println(st);

        int idx = sc.nextInt();
        int x = sc.nextInt();

        Stack<Integer> temp = new Stack<>();

        while(st.size()>idx){
            temp.push(st.pop());
        }

        st.push(x);

        while(temp.size()>0){
            st.push(temp.pop());
        }

        System.out.println(st);

    }
    
}
