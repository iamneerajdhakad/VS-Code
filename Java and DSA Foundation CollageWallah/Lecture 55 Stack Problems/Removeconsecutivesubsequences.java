
import java.util.Stack;

public class Removeconsecutivesubsequences {

    public static int[] remove(int[] arr){

        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < arr.length; i++){

            if(st.isEmpty() || st.peek() != arr[i])    st.push(arr[i]);

            else if(st.peek() == arr[i]){

                if(i == arr.length-1 || arr[i] !=arr[i+1]){
                    st.pop();
                }

                
            }    

        }

        int[] ans = new int[st.size()];

        for(int i = st.size()-1; i>=0; i--){

            ans[i]= st.pop();
        }


        return ans; 

    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3,4,5,7,7,7,9,9,9,9};

        int[] res = remove(arr);

        for(var i : res){
            System.out.print(i+" ");
        }
    }
}
