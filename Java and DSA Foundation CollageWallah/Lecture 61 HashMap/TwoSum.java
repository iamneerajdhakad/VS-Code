/*

Given an array of length n and a target, return a pair(indices) whose sum is equal to the target. If
there is no pair present, return -1.

*/

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] Solution(int[] arr, int target){

        HashMap<Integer,Integer> m = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++){

            if(m.containsKey(target-arr[i])) return new int[] {i,m.get(target-arr[i])};

            m.put(arr[i], i);
        }

        return new int[]{-1};
    }

    public static void main(String[] args) {

        int[] arr = Template.input();
        int target= Template.InputInt();

        System.out.println(Arrays.toString(Solution(arr,target)));
    }
    
}
