/* Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence. */

import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static int Solution(int[] arr){

        HashSet<Integer> h = new HashSet<>();
        int maxStreak = 0;  
        
        for(int num : arr) h.add(num);

        for(int num : h){

            if(!h.contains(num-1)){
                
                int currNum = num;
                int currStreak = 1;

                while(h.contains(currNum +1)){
                    currStreak++;
                    currNum++;
                } 

                maxStreak = Math.max(maxStreak, currStreak);
            }
        }
        

        return maxStreak;
    }

    public static void main(String[] args) {

        int[] arr = Template.input();

        System.out.println(Solution(arr));
    }
}
