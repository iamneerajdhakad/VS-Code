/* 

Rotate array by K elements

Problem Statement: Given an array of integers, rotating array of elements by k elements either left or right.

*/
import java.util.Arrays;

public class RotateArrayByK {

    public static int[] Solution(int[] arr, int k){

        int N = arr.length;

        k= k % N;
        int i = 0;
        int[] arr1 = new int[N];

        for(int j = N - k; j < N; j++){
            
            arr1[i]=arr[j];
            i++;
        }

        for(int j = 0; j < N - k; j++){
            
            arr1[i]=arr[j];
            i++;
        }
        
        for(i = 0; i < N; i++){

            arr[i]=arr1[i];
        }
        
        
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = TemplateA.input();
        int N = TemplateA.InputInt();
        System.out.println(Arrays.toString(Solution(arr,N)));
        
    }
}
