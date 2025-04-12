
import java.util.ArrayList;
import java.util.List;

public class PrintPermutation {

    public static void printpermutation(String s, String t,List<String> l){

        if(s.isEmpty()){
            l.add(t);
            return;
        } 
        for(int i =0; i< s.length(); i++){
            char ch = s.charAt(i);
            String left = s.substring(0,i);
            String right = s.substring(i+1);
            String rem = left + right;

            printpermutation(rem, t+ch,l);
        }

    }


    public static void main(String[] args) {

        List<String>    l = new ArrayList<>();

        printpermutation("abc", "",l);

        System.out.println(l);
        
    }
    
}