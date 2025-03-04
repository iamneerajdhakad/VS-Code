import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindAllAnagramsinaString {
    
    public static List<Integer> findAnagrams(String s, String p) {

        List<Integer> l = new ArrayList<>();
        HashSet<Character> h = new HashSet<>(); 

        for(var i : p.toCharArray()){
            h.add(i);
        }

        int idx = 0,right = 0;

        for(int left = 0; left < s.length();){

            if(right==p.length()+1) {
                l.add(idx);
                right++;
                left++;
            }

            else if(!h.contains(s.charAt(left)))    left++;

            else if(right<p.length())   right++;

        }

        return l;
    }

    public static void main(String[] args) {
        
        String s = "cbaebabacd";
        String p = "abc";

        System.out.println(findAnagrams(s, p));
    }
    mfsnlkrngl
