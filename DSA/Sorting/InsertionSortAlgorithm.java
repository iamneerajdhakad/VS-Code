
import java.util.Scanner;

public class InsertionSortAlgorithm {
    
    public static class InsertionSort{

        Scanner sc = new Scanner(System.in);

        int[] input(){
        
            int N = -1; 

            while (N < 0) { 

                System.out.print("Enter No. of Elements in Array: ");
                N = sc.nextInt();

                if (N < 0) {

                    System.out.println("Invalid Input! Please enter a non-negative number.");

                }
            }

            
            if (N == 0) {

                System.out.println("NULL");
                return new int[0]; 
                
            }

            int[] arr = new int[N];

            

                for(int i = 0; i < N; i++){

                    System.out.print("Enter " + i + "th Element Array : ");
                    arr[i]=sc.nextInt();

                }
            

            return arr;
        }

        int[] sort(int[] arr){

            for (int i = 0; i <= arr.length - 1; i++) {

                int j = i;
                
                while (j > 0 && arr[j - 1] > arr[j]) {

                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    j--;

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
        
        InsertionSort s = new InsertionSort();

        int[] arr = s.input();
        s.display(arr,"Before Insertion sort:");
        s.display(s.sort(arr),"After Insertion sort:");
        s.closeScanner();

    }
}
