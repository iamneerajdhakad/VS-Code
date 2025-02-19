
import java.util.Scanner;

public class P3_ReverseString {

    public static void Rev(String s){

        char[] ch = s.toCharArray();
        int left = 0, right = s.length()-1;

        while(left<right){

            char temp = ch[left];
            ch[left] = ch[right];
            ch[right]=temp;

            left++;
            right--;
            
        }

        System.out.println(new String(ch));

    }
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            
            String N = sc.nextLine();

            Rev(N);
            
            System.out.println();
        }
    }
}
