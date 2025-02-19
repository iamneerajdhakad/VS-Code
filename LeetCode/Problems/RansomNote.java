
import java.util.HashMap;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character,Integer> m = new HashMap<>();

        for(int i =0; i < magazine.length(); i++){

            if(!m.containsKey(magazine.charAt(i))){
                m.put(magazine.charAt(i), 1);
            }

            else{
                int freq = m.get(magazine.charAt(i));
                m.put(magazine.charAt(i),freq+1);
            }
        }

        int i = 0; 
        while(i<ransomNote.length()){

            if(!m.containsKey(ransomNote.charAt(i))){
                return false;
            }

            else{
                int freq = m.get(ransomNote.charAt(i));
                if(freq==0){return false;}
                else{
                m.put(ransomNote.charAt(i), freq-1);
                }
            }
            i++;
        }

        return true;
        
    }

    public static void main(String[] args) {
        
    }
}
