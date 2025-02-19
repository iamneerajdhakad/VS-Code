
import java.util.HashMap;
import java.util.Scanner;

/*
Check whether two Strings are anagram of each other. Return true if they are else return false.
An anagram ofa string is another string that contains the same characters, only the order of
characters can be different. For example, "abcd" and "dabc" are an anagram of each other.
 */

public class ValidAnagram {

    static HashMap<Character,Integer> makeFreqMap(String str){

        HashMap<Character,Integer> m = new HashMap<>();

        for(int i = 0; i < str.length(); i++){

            Character ch = str.charAt(i);

            if(!m.containsKey(ch)){
                m.put(ch, 1);
            }
            else{
                int currFreq = m.get(ch);
                m.put(ch, currFreq+1);
            }
        }

        return  m;
    }

    public static boolean Solution(String s, String t){

        if(s.length()!=t.length())   return false;
 
        HashMap<Character,Integer> m1 = makeFreqMap(s);
        HashMap<Character,Integer> m2 = makeFreqMap(t);
        
        return m1.equals(m2);
         
     }
 
    public static boolean Solution2(String s, String t){

       if(s.length()!=t.length())   return false;

       HashMap<Character,Integer> m = makeFreqMap(s);

       for(int i = 0; i < t.length(); i++){
            Character ch = t.charAt(i);

            if(!m.containsKey(ch))  return false;

            int currfreq = m .get(ch);
            m.put(ch, currfreq-1);
        
       }

       for(Integer i : m.values()){

            if(i!= 0)   return false;

       }

       
       return true;
    }

     

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter First Sting :");
            String s1 = sc.nextLine();
            System.out.print("Enter Second Sting :");
            String s2 = sc.nextLine();
            
            System.out.println(Solution(s1,s2));
        }
    }
    
}
