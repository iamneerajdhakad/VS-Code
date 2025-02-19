
import java.util.Arrays;
import java.util.Scanner;

public class Swapping {

    public static int[] Solution(int[] arr){

        int i =0;
        int j = arr.length-1;

        while(i<j){
            
            // int temp = arr[i];
            // arr[i] = arr[j];
            // arr[j] = temp;

            arr[i]=arr[i]+arr[j];
            arr[j]=arr[i]-arr[j];
            arr[i]=arr[i]-arr[j];
            

            i++;
            j--;

        }
        

        return arr;
    }
    
    public static int[] Solution2(int[] arr){

        int i =0;
        int j = arr.length-1;

        while(i<j){
            
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;

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
        System.out.println(Arrays.toString(Solution2(arr)));

        }
    }
}
