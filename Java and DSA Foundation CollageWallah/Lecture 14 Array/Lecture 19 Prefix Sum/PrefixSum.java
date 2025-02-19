
import java.util.Arrays;

/* Given an integer array 'a', return the prefix sum/running sum in the same arrsy without creating a new array */

public class PrefixSum {
    
    public static int[] Solution(int[] arr){

        int N = arr.length;
        
        for(int i = 1; i < N; i++){
            arr[i]+=arr[i-1];
        }

        return arr;

    }
    public static void main(String[] args) {

        int[] arr = Template.input();

        System.out.println(Arrays.toString(Solution(arr)));

    }
}
