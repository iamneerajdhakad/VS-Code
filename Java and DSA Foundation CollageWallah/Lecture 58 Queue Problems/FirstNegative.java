
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


/*First negative in each window of size 'k' */
public class FirstNegative {

    @SuppressWarnings("SizeReplaceableByIsEmpty")
    public static long[] printFirstNegativeInteger(long A[],int N,int k){

        long[] res = new long[N-k+1];

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < N; i++){
            if(A[i]<0){
                q.add(i);
            }
        }

        for(int i =0; i < N-k+1; i++){
            if(q.size() > 0 && q.peek()<i)  q.remove();

            if(q.size() > 0 && q.peek()<=i+k+1){
                res[i]=A[q.peek()];
            } 

            else if(q.size()==0) res[i] = 0;

            else res[i]=0;
        
        }

        return res;


    } 
    
    public static void main(String[] args) {
        long[] a = {12,-1,-7,8,-15,30,16,28};
        int k = 3,n =8;

        System.out.println(Arrays.toString(printFirstNegativeInteger(a, n, k)));
    }
}
