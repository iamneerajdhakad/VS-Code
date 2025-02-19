
import java.util.Arrays;
import java.util.Scanner;

public class P4_MoveZeroestoEndofArra {

    public static int[] Move(int[] arr){
    
        
        int N = arr.length;
        int x = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
        if (arr[i] == 0) {
            x = i;
            break;
        }
        }

        if (x == Integer.MIN_VALUE) return arr;

        for(int i = x+1; i < N; i++){

            if(arr[i]!=0){
                arr[x++] = arr[i];
                arr[i]=0;
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
      
            
            

            System.out.println(Arrays.toString(Move(arr)));
        }
    }
}
