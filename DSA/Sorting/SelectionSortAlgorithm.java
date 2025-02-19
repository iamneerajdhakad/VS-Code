/* Problem Statement: Given an array of N integers, write a program to implement the Selection sorting algorithm. */

import java.util.*;

public class SelectionSortAlgorithm {
    
    public static class SelectionSort{

        Scanner sc = new Scanner(System.in);

        int[] input(){

            System.out.print("Enter The No. Of Elements in An Array : ");
            int N = sc.nextInt();
            System.out.println();
            int[] arr = new int[N];
            
            if(N<0){

                System.out.print("Invalid Input Please Re- ");
                input();

            }

            else if(N==0){

                System.out.println("NULL");

            }

            else{

                for(int i = 0; i < N; i++){

                    System.out.print("Enter " + i + "th" + " Element Of The Array :");
                    arr[i]=sc.nextInt();

                }
            }

            return arr;
        }

        int[] sort(int[] arr){

            for(int i = 0; i < arr.length; i++){
                
                int min=i;

                for(int j = i+1; j < arr.length; j++){
                    
                    if(arr[j] < arr[min]){

                        min = j;
                    
                    }

                }

                int temp = arr[min];
                arr[min] = arr[i];
                arr[i]   = temp;

            }

            return arr;
        }

        void display(int[] arr){

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

        }


        void closeScanner(){

            sc.close();

        }

    }

    public static void main(String[] args) {
        SelectionSort s = new SelectionSort();

        int[] arr = s.input();
        System.out.println("Before selection sort:");
        s.display(arr);
        System.out.println("After selection sort:");
        s.display(s.sort(arr));
        s.closeScanner();
    }
}
