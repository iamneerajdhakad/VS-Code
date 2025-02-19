/* 

In this article we will learn how to solve the most asked coding interview problem: "Move all Zeros to the end of the array"

Problem Statement: You are given an array of integers, your task is to move all the zeros in the array to the end of the array and move non-negative integers to the front by maintaining their order. 

*/

import java.util.Arrays;
import java.util.Scanner;

public class ZerostotheEnd {
    
    public static int[] Solution(int[] arr){

        int j = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        if(j== Integer.MIN_VALUE) return arr;


        for(int i = j+1; i < arr.length; i++){

            if(arr[i]!=0){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]=temp;
                j++;

            }

             
        }

        
        return arr;
    }

    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in);){

        int N = sc.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i < N; i++){

            arr[i]= sc.nextInt();

        }

        System.out.println(Arrays.toString(Solution(arr)));

        sc.close();
        }
    }
}
