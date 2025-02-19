
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P1_4Sum {

    public static List<List<Integer>> fourSum(int[] nums, int target) {
            
            Arrays.sort(nums);
            List<List<Integer>> result = new ArrayList<>();
            int n = nums.length;
    
            for (int i = 0; i < n - 3; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) continue; // Skip duplicates
    
                for (int j = i + 1; j < n - 2; j++) {
                    if (j > i + 1 && nums[j] == nums[j - 1]) continue; // Skip duplicates
    
                    int p = j + 1, q = n - 1;
    
                    while (p < q) {
                        long sum = (long) nums[i] + nums[j] + nums[p] + nums[q];
    
                        if (sum < target) {
                            p++;
                        } else if (sum > target) {
                            q--;
                        } else {
                            result.add(Arrays.asList(nums[i], nums[j], nums[p], nums[q]));
                            p++;
                            q--;
    
                            while (p < q && nums[p] == nums[p - 1]) p++; // Skip duplicates
                        }
                    }
                }
            }
            return result;
        }
    
    
        public static void main(String[] args) {
    
            try (Scanner sc = new Scanner(System.in)) {
                int N = sc.nextInt();
                
    
                int[] arr = new int[N];
                
                
                for(int i = 0; i < N; i++){
                    arr[i]=sc.nextInt();
                }
    
                int target=sc.nextInt();
          
                
                
    
                System.out.println(fourSum(arr,target));
        }
    }
}
