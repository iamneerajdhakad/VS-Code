
import java.util.HashMap;

/*

Given an array arr[] of length N, find the length of the largest subarray with sum equal to 0.

*/
public class LargestSubArrayWith0Sum {

    public static int Solution(int[] arr){

        int l=0;
        int ps=0;

        HashMap<Integer,Integer> m = new HashMap<>();

        for(int i = 0; i < arr.length; i++){

            ps+=arr[i];

            if(!m.containsKey(ps)){

                m.put(ps,i);
            }

            else{

                l = i - m.get(ps);

            }

        }
        
        return l;
    }

    public static void main(String[] args) {
        
        int[] arr = Template.input();

        System.out.println(Solution(arr));
    }
    
}
