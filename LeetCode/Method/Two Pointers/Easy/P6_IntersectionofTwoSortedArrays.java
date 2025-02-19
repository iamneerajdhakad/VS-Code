

import java.util.Arrays;
import java.util.Scanner;

public class P6_IntersectionofTwoSortedArrays {
    
    public static int[] merge(int[] arr1,int N,int[] arr2,int M){

        int i=N-1,j=M-1,idx=M+N-1;

        while(i>=0 && j>=0){

            if(arr1[i]>arr2[j]){       arr1[idx--]=arr1[i--];}

            else{    arr1[idx--]=arr2[j--];}
        }

        //  when arr1 have all the element smaller than arr 2
        while(j>=0){

            arr1[idx--]=arr2[j--];
        }


        return arr1;
    }

    

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            int[] arr1 = new int[N+M];
            int[] arr2 = new int[M];
            
            for(int i = 0; i < N+M; i++){
                arr1[i]=sc.nextInt();
            }
      
            
            
            
            for(int i = 0; i < M; i++){
                arr2[i]=sc.nextInt();
            }

            System.out.println(Arrays.toString(merge(arr1,N, arr2,M)));
        }
    }
}
