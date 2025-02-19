import java.util.Arrays;
import java.util.Scanner;

public class TwoSumII {

    public static int[] twoSum(int[] numbers, int target) {

        int i = 0, j = numbers.length-1;
        while(i<j){

            if(numbers[i]+numbers[j] == target){return new int[]{i,j};}

            else if (numbers[i]+numbers[j]<target){i++;}

            else{j--;}

        }
     
        return new int[]{};
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            

            int[] arr = new int[N];
            
            
            for(int i = 0; i < N; i++){
                arr[i]=sc.nextInt();
            }

            int target=sc.nextInt();
      
            
            

            System.out.println(Arrays.toString(twoSum(arr,target)));
    }
    }
}
