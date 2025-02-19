/* Given an array of integers of size n. Answer q queries where you need to print the sum of values in a given range of indices from l to r (both included).
    NOTE: The values of l and r in queries follow 1 based indexing.
 */

import java.util.Scanner;

public class Question2 {

    static Scanner sc = new Scanner(System.in);

    public static int[] input(){

        System.out.print("Enter The No. Of Element in The Array : ");
        int N = sc.nextInt();
        System.out.println();
        int[] arr = new int[N+1];

        if(N<0){

            System.out.println("Invalid Input Please Re-");
            input();

        }

        else if(N==0){
            
            System.out.println("NULL");
            return new int[0];

        }

        else{

            for(int i = 1; i <= N; i++ ){

                System.out.print("Enter " + i + "th Element Of Array : " );
                arr[i]=sc.nextInt();

            }
        }

        return arr;
    }

    public static int Solution(int[] arr, int l, int r){

        int sum  = 0;

        for(int i = l; i <= r; i++){

            sum= sum + arr[i];
            
        }

        return sum;
    }

    public static void Solution2(int[] arr, int l, int r){
        int N = arr.length;

        int sum;
        
        for(int i = 1; i < N; i++ ){

            arr[i]+=arr[i-1];
        }

        sum = arr[r] - arr[l-1];

        System.out.printf("Sum of No. Betwwen %d and %d is %d : ",l,r,sum);
        
    }

    
    public static void main(String[] args) {
        
        int[] arr = input();
        int l = Template.InputInt();
        int r = Template.InputInt();

        System.out.println(Solution(arr,l,r));
        Solution2(arr, l, r);                   //More Efficient

    }
}
