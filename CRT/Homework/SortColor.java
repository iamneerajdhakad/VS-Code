
import java.util.ArrayList;

public class SortColor {

    public static void sortcolor(ArrayList<Integer> nums){

        int low = 0, mid =0, high = nums.size()-1;

        while(mid<=high){

            if(nums.get(mid)==0){

                int temp = nums.get(low);
                nums.set(low, mid);
                nums.set(mid, temp);

                low++;
                mid++;
            }

            if(nums.get(mid)==1){
                mid++;
            }

            if(nums.get(high)==2){
                int temp = nums.get(high);
                nums.set(high, mid);
                nums.set(mid, temp);

                high--;
                
            }
        }

    }

    
    
}
