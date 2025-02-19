/* Problem statement: You are given a sorted array of integers and a target, your task is to search for the target in the given array. Assume the given array does not contain any duplicate numbers */
import java.util.Scanner;

public class BinarySearchRecursive {
    
    public static class Search{

        Scanner sc = new Scanner(System.in);

        int[] input(){

            System.out.print("Enter No. Of Elements in Array : ");
            int N = sc.nextInt();
            int[] arr = new int[N];

            if(N<0){

                System.out.print("Invalid Input Please Re-");
                input();
            }

            else if(N==0){

                System.out.println("NULL");
            }

            else{

                for(int i=0 ; i < N; i++){
                    System.out.print("Enter " + i + "th Element of the Array : ");
                    arr[i]=sc.nextInt();
                }
            }
            return arr;
        }

        int binarySearch(int[] arr,int low,int high,int target){
            
            if (low > high) {

                return -1;

            }

            int mid = ( low + high ) / 2;

            if(arr[mid]==target){ 
                
                return mid;
            }

            else if(arr[mid]<target){

                return binarySearch(arr, mid+1, high, target);

            }

            else{

                return binarySearch(arr, low, mid-1, target);

            }
        }

        int Target(){

            System.out.print("Eneter Target : ");
            int target = sc.nextInt();
            return target;

        }
        void closeScanner(){

            sc.close();
        }
    }
    public static void main(String[] args) {
        
        Search s = new Search();
        
        int[] arr = s.input();

        while (true) {

        int Result = s.binarySearch(arr, 0, arr.length-1, s.Target());
        
            if (Result != -1) {
                System.out.println("Target found at index: " + Result);
                break;
            }
            
            else {
                System.out.print("Target not found. Please Re-");
            }
        }

        s.closeScanner();
    }
}
