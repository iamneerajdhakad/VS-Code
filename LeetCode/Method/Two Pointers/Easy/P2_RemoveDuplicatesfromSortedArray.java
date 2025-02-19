
import java.util.Arrays;
import java.util.Scanner;

public class P2_RemoveDuplicatesfromSortedArray {

    public static int[] Detect(int[] arr){

        int N = arr.length;
        int j = 1;

        for(int i = 0; i < N-1; i++){
            if(arr[i]!=arr[i+1]){

                arr[j++]=arr[i+1];
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            

            int[] arr = new int[N];
            
            
            for(int i = 0; i < N; i++){
                arr[i]=sc.nextInt();
            }
      
            
            

            System.out.println(Arrays.toString(Detect(arr)));
        }
    }
}
