
import java.util.HashMap;

public class RomantoInteger {

    public static int romanToInt(String s) {

        HashMap<Character,Integer> map = new HashMap<>();

        int num = 0;

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        for(int i = 0 ; i < s.length()-1; i++){

            if(map.get(s.charAt(i))<map.get(s.charAt(i+1))){
                num-= map.get(s.charAt(i));
            }
            else{
                num+=map.get(s.charAt(i));
            }

            
        }
        return num +map.get(s.charAt(s.length()-1));  
    }

    public static void main(String[] args) {

        System.out.println(romanToInt("MCMXCIV"));
        
    }
}