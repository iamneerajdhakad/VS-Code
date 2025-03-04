
import java.util.Scanner;

public class MaximumSumSubarrayofSizeK {

    public static int MaxSub(int[] arr, int k){

        int sum = 0;
        int max = Integer.MIN_VALUE;

        if(k>arr.length)    return Integer.MIN_VALUE;

        for(int  i = 0 ; i < k; i++){
           
            sum += arr[i];
            
        }

        max = sum;

        for(int i = k; i < arr.length; i++){

            sum = sum + arr[i] - arr[i-k];
            max = Math.max(max, sum);

        }
        
        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for(int i =0 ; i < N; i++){

            arr[i]=sc.nextInt();

        }

        int K = sc.nextInt();

        System.out.println(MaxSub(arr, K));
        
    }

    //kne jkefnklrvnl
    
}
