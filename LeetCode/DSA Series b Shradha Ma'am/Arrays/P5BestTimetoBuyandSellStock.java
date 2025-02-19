/*

You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 */

import java.util.*;

public class P5BestTimetoBuyandSellStock {
    
    public static int BruteForce(int[] arr){
 
           
        int j = 0,max, buy = arr[0],profit=0;

        for(int i = j+1; i < arr.length; i++){

            buy = Math.min(arr[i], buy);
            
            if(arr[i]>arr[j]){

            

            max = Math.max(arr[i], arr[j]);

            profit = Math.max(max-buy,profit);
            


            }

            j++;

        }

        return profit;
           
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            
            arr[i]=sc.nextInt();
        }

        System.out.println(BruteForce(arr));
        
    }
}
