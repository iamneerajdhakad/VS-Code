
import java.util.Arrays;

/* Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.

If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result. It does not matter what you leave beyond the first k elements.

Note: Return k after placing the final result in the first k slots of the array
 */


public class RemoveDuplicates {

    public static int[] Solution(int[] nums){

        int N = nums.length;

        int i = 0;

        for(int j =1; j < N; j++){

            if(nums[i]!=nums[j]){
                    
                i++;

                nums[i]=nums[j];

                
            }
        }

        
        


        return nums;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(Solution(TemplateA.input())));
    }
}
