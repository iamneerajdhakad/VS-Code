/*
1. Two Sum 

[2,7,11,15]
9


*/
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class P7_TwoSum {
    
    public static int[] twoSum(int[] arr, int target) {

        HashMap<Integer,Integer> m = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++){

            if(m.containsKey(target-arr[i])) return new int[] {i,m.get(target-arr[i])};

            m.put(arr[i], i);
        }

        return new int[]{-1};
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
