import java.util.Scanner;

public class LongestSubarraywithgivenSumK {

    public static int Solution(int[] arr,int K){

        int j =0, max =0,sub=0; 

        for(int i = j+1; i < arr.length; i++){

            sub+=arr[i];

            while( sub > K && j <= i){
                sub -=arr[j];
                j++;
            }

            max = Math.max(max, i-j+1);
        }

        return max;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){

        int N = sc.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i< N; i++){

            arr[i]=sc.nextInt();
        }

        int K = sc.nextInt();

        System.out.println(Solution(arr,K));

        sc.close();
        }
    }
}
