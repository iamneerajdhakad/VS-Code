import java.util.HashSet;
import java.util.Scanner;

public class P4_LongestSubstringWithoutRepeatingCharacters {
    
    public static int lengthOfLongestSubstring(String s) {

        HashSet<Character> h = new HashSet<>();

        int a_pointer = 0;
        int b_pointer = 0;

        int max = 0;

        while(b_pointer < s.length()){

            if(!h.contains(s.charAt(b_pointer))){
                h.add(s.charAt(b_pointer));
                b_pointer++;
                max = Math.max(max, h.size());

            }

            else{
                h.remove(s.charAt(a_pointer));
                a_pointer++;
            }


        }

        return max;
        
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();

            System.out.println(lengthOfLongestSubstring(s));
        }

    }
}
