
import java.util.Scanner;


public class P6KadanesAlgorithm {

    public static int BF(int[] arr){

        int max = Integer.MIN_VALUE,sum = 0;

        for(int i = 0; i < arr.length; i++){

            sum = arr[i];

            for(int j = i+1; j < arr.length; j++){   

                sum = sum+arr[j];
                max = Math.max(sum, max);

            }
        }
        return max;
    }

    public static int Optimal(int[] arr){

        int maxSum=Integer.MIN_VALUE, currSum = 0;


        for(int i = 0; i < arr.length; i++){

            currSum += arr[i];

            maxSum = Math.max(currSum, maxSum);

            if(currSum<0){

                currSum=0;
            }
        }
        return maxSum;
    }
    

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(Optimal(arr));

    }
}
