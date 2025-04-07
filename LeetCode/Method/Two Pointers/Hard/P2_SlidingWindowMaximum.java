
import java.util.ArrayDeque;
import java.util.Deque;

public class P2_SlidingWindowMaximum {
    
    public static int[] maxSlidingWindow(int[] nums, int k){

        Deque<Integer> dq = new ArrayDeque<>();
        int n = nums.length;
        int[] res = new int[n-k+1];

        for (int i = 0; i < n; i++) {

            /*  ek hi element/index nikle ga jaisa tu dekh sakta hai 
            aur vo bhi tab jab window se bhar chale jaye largest index
            */
            
            if(!dq.isEmpty() && dq.peek() < i-k+1){
                dq.pollFirst();
            }

            /* idher vo sab remove hote hai jo  window mein chote hai mtlb
            jo add kar raha hai vo agr window se bada hai toh bas vo hi bachega window mein
             */

            while(!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]){
                dq.pollLast();
            }

            /* yaha pe add kar de jo bhi largest hai vo end pe bachega DEQUEUE mein
             */

            dq.offerLast(i);

            /* yeh condition islye hai kyu ki starting mein window ki 
                size == K nehi ho toh add nehi karna
             */

            if (i >= k - 1) {
                res[i - k + 1] = nums[dq.peekFirst()];
            }

        }


        return res;

    }

    public static void main(String[] args) {


        
    }
}
