
import java.util.HashMap;

public class GoodPairs {
    
    public static int numIdenticalPairs(int[] nums) {

        HashMap<Integer,Integer> m = new HashMap<>();
        int gp = 0;

        for(int i = 0; i< nums.length; i++){

            if(!m.containsKey(nums[i])){
                m.put(nums[i], 1);
            }

            else{
                int freq = m.get(nums[i]);
                m.put(nums[i], freq+1);

                gp+=freq;
            }

        }

        return gp;
    }
    

}
