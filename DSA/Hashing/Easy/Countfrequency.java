
/* Problem statement: Given an array, we have found the number of occurrences of each element in the array. */

import java.util.Scanner;

public class Countfrequency {

    public static Scanner sc = new Scanner(System.in);

    public static void Solution(int N, int[] arr){

        

        int[] hash = new int[13];

        for(int i = 0; i < N; i++){
            hash[arr[i]] +=1;
        }

        System.out.print("Enter The No of Numbers : ");
        int q = sc.nextInt();
        System.out.println();

        while(q-->0){

            int number = sc.nextInt();
            System.out.println("Frequency Of  "+ number +" in Array is : " +hash[number]);

        }
    }

    public static void closeScanner(){
        sc.close();
    }

    public static void main(String[] args) {

        int[] arr = TemplateB.input();
        int N = arr.length;

        Solution(N, arr);
        closeScanner();
        
    }
}
