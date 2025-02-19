
import java.util.Scanner;

public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {

        int i = 0,j=0;

        while(i < s.length() && j < t.length()){

            if(s.charAt(i)!=t.charAt(j)){
                j++;
            }

            else {
                i++;
                j++;
                if(s.length()==i){return  true;}
            }

        }

        return false;
        
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();

        System.out.println(isSubsequence(s, t));
    }
    
}
