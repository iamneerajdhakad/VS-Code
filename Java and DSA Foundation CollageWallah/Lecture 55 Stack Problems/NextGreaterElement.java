
import java.util.Stack;

public class NextGreaterElement {

    public static int[] nextGreater(int[] arr){

        Stack<Integer> st = new Stack<>();

        int[] res = new int[arr.length];

        res[arr.length-1]=-1;
        st.push(arr[arr.length-1]);

        for(int i = arr.length-2; i>=0; i--){

            while(!st.isEmpty() && st.peek() < arr[i] ){
                st.pop();
            }

            if(st.isEmpty()) res[i]=-1;
            else {
                res[i] = st.peek();
            }
            st.push(arr[i]);
    }

        return res;

    }

    public static void main(String[] args) {
        
        int arr[] = {7,3,2,1,8,6,3,4};

        int[] res = nextGreater(arr);

        for(int i = 0; i < arr.length; i++){

            System.out.print(res[i]+" ");
        }


/*        

        int[] res = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            res[i]=-1;
            for(int j = i+1; j < arr.length; j++){//1 3 2 1 8 6 3 4 
                if(arr[i]<arr[j]){
                    res[i]=arr[j];
                    break;
                }
            }
        }

        for(int i = 0; i < arr.length; i++){

            System.out.print(res[i]+" ");
        }

 */
    }
    
}
