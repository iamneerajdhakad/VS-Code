/* Problem:  Given an array of size n, sort the array using Merge Sort. */

import java.util.ArrayList;
import java.util.Scanner;


public class MergeSortAlgorithm {

    public static class MergeSort{

        Scanner sc = new Scanner(System.in);

        int[] input(){

            int N = -1;

            while(N<0){

                System.out.print("Enter The Size Of The Array : ");
                N = sc.nextInt();

                if(N<0){

                    System.out.print("Invalid Input Please Enter A Positive Number : ");
                    input();
                }
            }

            if(N==0){

                System.out.println("NULL");
                return new int[0];
            }

            int[] arr = new int[N];

            for(int i = 0; i < N; i++ ){

                System.out.print("Enter " + i + "th Element of the Array : ");
                arr[i]=sc.nextInt();

            }

            return arr;
        }

        void merge(int[] arr,int low,int mid,int high){

            ArrayList<Integer> temp = new ArrayList<>();
            int left = low;
            int right = mid +1;


            while( left<= mid && right <= high){

                if (arr[left] <= arr[right]) {

                    temp.add(arr[left]);
                    left++;
                } 
                
                else {

                    temp.add(arr[right]);
                    right++;
                }
            }

            while (left <= mid) {

                temp.add(arr[left]);
                left++;
            }
            
            while (right <= high) {

                temp.add(arr[right]);
                right++;
            }
            
            for (int i = low; i <= high; i++) {

                arr[i] = temp.get(i - low);
            }
        }

        int[] mergeSort(int[] arr, int low, int high) {
            
            if (low >= high) return arr;
            int mid = (low + high) / 2 ;
            mergeSort(arr, low, mid);  
            mergeSort(arr, mid + 1, high); 
            merge(arr, low, mid, high);
            
            return arr;
        }

        void display(int[] arr, String message){
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
        
        MergeSort s = new MergeSort();

        int[] arr = s.input();
        s.display(arr,"Before Merge Sort : ");
        s.display(s.mergeSort(arr, 0, arr.length-1 ), "After Merge Sort : ");
        s.closeScanner();
    }
}
