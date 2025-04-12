
import java.util.ArrayList;
import java.util.List;

public class Permutation {


    public void helper(int[] nums,int idx, List<List<Integer>> ans){
        int n = nums.length;
        if(idx==n-1){
            
            List<Integer> list =  new ArrayList<>();
            
            for(int i =0; i < n; i++){

                list.add(nums[i]);

            }

            ans.add(list);
            return;
        }

        for(int i =idx; i< nums.length; i++){

            swap(i,idx,nums);
            helper(nums,idx+1,ans);
            swap(i,idx,nums);
            
       }
    }

    public void swap(int i, int idx, int[] nums){

        int temp = nums[i];
        nums[i]= nums[idx];
        nums[idx]= temp;

    }


    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>>  ans = new ArrayList<>(); 

        helper(nums,0,ans);
        return ans;
        
    }

    public static void main(String[] args) {
        
    }
    
}
