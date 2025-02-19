/*
Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. NO two
characters may map to the same character, but a character may map to itself.
 */

import java.util.HashMap;
import java.util.Scanner;


public class isomorphicStrings {

    
    @SuppressWarnings({"BoxedValueEquality", "NumberEquality"})
    public static boolean Solution(String s, String t){

        if(s.length()!=t.length())   return false;

        HashMap<Character,Character> m = new HashMap<>();

        int j = 0;
        for(int i = 0; i < s.length(); i++){

            Character ch1 = s.charAt(i);
            Character ch2 = t.charAt(j++);

            if(!m.containsKey(ch1)){

                if(m.containsValue(ch2)) return false;

                else{
                    m.put(ch1, ch2);
                }
            }

            else{

                if(m.get(ch1) != ch2)   return false;

                
            }
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
