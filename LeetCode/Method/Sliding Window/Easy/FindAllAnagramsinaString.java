import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindAllAnagramsinaString {
    
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> l = new ArrayList<>();
        HashSet<Character> h = new HashSet<>(); 

        for(var i : s.toCharArray()){
            h.add(i);
        }

        int j = s.length();

        for(int i = 0; i < p.length(); i++){
           
            if(h.contains(p.charAt(i)) && )
        }
        
        
        return l;
    }
    
    jk feejks werjk
}
