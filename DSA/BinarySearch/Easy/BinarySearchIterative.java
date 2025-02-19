
/* Problem statement: You are given a sorted array of integers and a target, your task is to search for the target in the given array. Assume the given array does not contain any duplicate numbers. */

import java.util.Scanner;

public class BinarySearchIterative {
    
    public static class Search{

        Scanner sc = new Scanner(System.in);

        int[] input(){

            System.out.print("Enter No. of Elements in Array : ");
            int N = sc.nextInt();
            System.out.println();
            int[] arr = new int[N];

            if(N<0){

                System.out.print("Invalid Input Please Re-");
                input();

            }

            else if(N==0){System.out.println("NULL");}

            else{
                for(int i = 0; i < N; i++){
                    System.out.print("Enter " + i + "th Element Of  Array : " );
                    arr[i]=sc.nextInt();
                }
            }

            return arr;
        }

        int search(int[] arr, String message){

            System.out.print(message);
            int target = sc.nextInt();
            int size = arr.length;
            int low = 0;
            int high = size-1;
            

            while(low<=high){
                
                int mid=(low+high) / 2;

                if(target==arr[mid]){

                    return mid;

                }

                else if(target < arr[mid]){
                    
                    high = mid -1;

                }

                else{

                    low=mid+1;

                }
            }

            return -1;
        }

        void closeScanner(){
            sc.close();
        }
    }
    
    public static void main(String[] args) {
        
        Search s = new Search();

        int result =s.search(s.input(),"Enter Target : ");

        if(result==-1){
            System.out.println("Target is not present ");
        }

        else{
            System.out.println("The target is at index: " + result);
        }

        s.closeScanner();
    }
}
