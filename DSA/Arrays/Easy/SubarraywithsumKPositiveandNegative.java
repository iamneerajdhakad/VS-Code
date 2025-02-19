
import java.util.Scanner;

/*

Problem Statement: Given an array and a sum k, we need to print the length of the longest subarray that sums to k.

*/

public class SubarraywithsumKPositiveandNegative {


    public static int solution(int[] arr, int k){

        int N = arr.length;
        int i = 0;
        
        int sum = arr[0];
        int max = 0 ;
        
        for(int j =i+1; j < N; j++){

            sum+=arr[j];
            if(sum>k){
                sum=0;
                i++;
            }
            
            max = Math.max(j-i+1, max);
        }
        return max;
    }

    public static void main(String[] args) {


        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i =0; i < N; i++){
            
            arr[i]=sc.nextInt();

        }

        int k = sc.nextInt();

        System.out.println(solution(arr,k));
    }
    
}
