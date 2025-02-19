
import java.util.HashMap;

/*

Given a string s, return true if s is a good string, or false otherwise.
A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).

*/

public class CheckifAllCharactersHaveEqualNumberofOccurrences {

    public static boolean areOccurrencesEqual(String s) {

        HashMap<Character,Integer> m  = new HashMap<>();


        for(int i = 0; i < s.length(); i++){

            Character ch = s.charAt(i);
            
            if(!m.containsKey(ch)){

                m.put(ch, 1);

            }

            else{

                int freq = m.get(ch);
                m.put(ch, freq+1);
            }

        }

        int val = m.get(s.charAt(0));

        for(int i : m.values()){

            if(i!=val){
                return false;
            }
        }

        
        return true;
    }

    public static void main(String[] args) {

        String s = "abacbc";

        System.out.println(areOccurrencesEqual(s));
    }
    
}
