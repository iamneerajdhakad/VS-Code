
import java.util.Scanner;

public class P5_ValidPalindrome {

    public static boolean isPalindrome(String str) {

        StringBuilder s = new StringBuilder();

        for(var i : str.toCharArray()){
            if(Character.isLetterOrDigit(i)){
                s.append(Character.toLowerCase(i));
            }
        }
        
        int size = s.length();

        int j=size-1;

        for(int i = 0; i < size/2; i++){

            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

            j--;
        }
        
        return true;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
			String str = sc.nextLine();


			System.out.println(isPalindrome(str));
		}
        
    }
}
