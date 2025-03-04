
import java.util.Arrays;


public class FirstandLastPosition {

    public static int[] searchRange(int[] nums, int target) {

        //int[] ans = {-1, -1};

        int st = search(nums, target, true);
        int end = search(nums, target, false);

        int[] ans = {st,end};

        return ans;
        
    }

    public static int search(int[] nums,int target,boolean FindStartIdx){

        int n = nums.length;

        int st = 0, end = n-1;
        int ans = -1;

        while(st<=end){

            int mid = st +(end-st)/2;

            if(nums[mid]<target)    st = mid+1;

            else if(nums[mid] > target)     end = mid - 1;

            else{

                ans = mid;

                if(FindStartIdx){
                    end=mid-1;
                }
                else{
                    st = mid + 1;
                }
            }
        }

        return ans;

    }


    public static void main(String[] args) {


        int[] arr = {5,7,7,8,8,10};

        int target = 7;

        System.out.println(Arrays.toString(searchRange(arr, target)));
        
    }

    
}
