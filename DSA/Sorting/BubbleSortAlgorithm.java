/* Problem Statement: Given an array of N integers, write a program to implement the Bubble Sorting algorithm. */

import java.util.Scanner;

public class BubbleSortAlgorithm {
    
    public static class  BubbleSort{

        Scanner sc = new Scanner(System.in);

        int[] input(){

            System.out.print("Enter The No. Of Element in The Array : ");
            int N = sc.nextInt();
            System.out.println();
            int[] arr = new int[N];

            if(N<0){

                System.out.println("Invalid Input Please Re-");
                input();

            }

            else if(N==0){
                
                System.out.println("NULL");
                return new int[0];

            }

            else{

                for(int i = 0; i < N; i++ ){

                    System.out.print("Enter " + i + "th Element Of Array : " );
                    arr[i]=sc.nextInt();

                }
            }

            return arr;
        }

        int[] sort(int[] arr){

            for (int i = 0; i < arr.length - 1; i++) { //the largest element moves to the last position

                for (int j = 1; j < arr.length - i; j++) { /* It goes up to n-i to avoid comparing the already sorted portion of the array */

                    if (arr[j] < arr[j - 1]) {

                        int temp = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = temp;

                    }
                }
            }
            

            return arr;

        }

        void display(int[] arr,String message){

            System.out.println(message);

            for(int i = 0; i < arr.length; i++){

                System.out.print(arr[i]+" ");
            
            }

            System.out.println();

        }
        
        void closeScanner(){

            sc.close();
        
        }
    }
    
    public static void main(String[] args) {

        BubbleSort s = new BubbleSort();

        int[] arr = s.input();
        s.display(arr,"Before Bubble sort:");
        s.display(s.sort(arr),"After Bubble sort:");
        s.closeScanner();

    }
}
