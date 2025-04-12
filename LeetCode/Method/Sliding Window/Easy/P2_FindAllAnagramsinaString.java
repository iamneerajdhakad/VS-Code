import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class P2_FindAllAnagramsinaString {
    
    public static List<Integer> findAnagrams(String s, String p) {

        List<Integer> l = new ArrayList<>();
        HashMap<Character,Integer> h = new HashMap<>(); 

        for(var i : p.toCharArray()){
            h.put(i,h.getOrDefault(i, 0)+1);
        }

        int right = 0;

        while(right < s.length()){

            int left = right;

            char ch = s.charAt(left);

            if(h.containsKey(ch)){

                boolean flag = false;
                int count = 0;

                for(int i = left; i < p.length(); i++){

                    if(h.containsKey(s.charAt(i))){
                        count++;
                    }

                    if(count==p.length()){
                        flag=true;
                    }

                }

                if(flag){
                    l.add(left);
                }
            }

            right++;

        }
        
        return l;
    }

    public static void main(String[] args) {
        
        String s = "cbaebabacd";
        String p = "abc";

        System.out.println(findAnagrams(s, p));
    }
}dnked