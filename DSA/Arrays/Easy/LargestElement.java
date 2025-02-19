/* Problem Statement: Given an array, we have to find the largest element in the array. */

import java.util.Scanner;

public class LargestElement {
    public static class Largest{

        Scanner sc = new Scanner(System.in);

        int[] input(){
            System.out.print("Enter The No. Of Elements in Array : ");
            int N = sc.nextInt();
            int[] arr= new int[N];
            if(N<0){

                System.out.print("Invalid Input Please Re-");
                input();
            }

            else if(N==0){

                System.out.println("Null");
                arr= new int[0];

            }

            else{

                for(int i = 0; i < N; i++){

                    System.out.print("Enter " + i + "th Element of Array :");
                    arr[i]= sc.nextInt();

                }
            }

            return arr;
        }

        int Large(int[] arr){

            int x=Integer.MIN_VALUE;

            for (int i = 0; i < arr.length; i++){
                
                if(x<arr[i]){
                    x=arr[i];
                }
            }

            return x;
        }

    }
    
    public static void main(String[] args) {
        
        Largest l = new Largest();
        
        int Large = l.Large(l.input());
        System.out.println("Largest Element in the Array : " + Large);
    }
}
