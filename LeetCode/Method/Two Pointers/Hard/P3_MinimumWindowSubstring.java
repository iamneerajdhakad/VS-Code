
import java.util.HashMap;

public class P3_MinimumWindowSubstring {

    public static String minWindow(String s, String t) {

        if(t.length()>s.length())   return"";

    
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(char ch : t.toCharArray()){
                map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        int left = 0, right = 0, length = s.length(),count = t.length(),start=0,Min=Integer.MAX_VALUE; 

        while(right!=length){

            char ch = s.charAt(right);

            if(map.containsKey(ch)){
                if(map.get(ch)>0){
                    count--;
                }

                map.put(ch, map.get(ch)-1);
            }

            while(count==0){

                if(right-left+1<Min){
                    start = left;
                    Min=right-left+1;
                }

                char leftChar = s.charAt(left);

                if(map.containsKey(leftChar)){
                    
                    map.put(leftChar, map.get(leftChar));

                    if(map.get(leftChar)>0){
                        count++;
                    }
                }

                left++;

            }

            right++;

        }


        return Min == Integer.MAX_VALUE ? "" : s.substring(start, start + Min);
        
    }
    
    public static void main(String[] args) {

        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
        
    }
}
