/*

Problem Statement: Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array.

*/

import java.util.Scanner;

public class MaximumConsecutive {
    public static int Solution(int[] arr){

        int count = 0;
        int max=0;
        

        for(int i = 0; i < arr.length; i++){

            count++;

            if(arr[i]==0){
                count=0;
            }

            max = Math.max(max, count);

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

        System.out.println(Solution(arr));

        sc.close();
        }

    }
}
