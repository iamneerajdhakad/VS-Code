
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

    public static boolean isBalanced(String str){
        Stack<Character> s = new Stack<>();

        int n = str.length();

        for(int i = 0; i < n; i++){
            char ch = str.charAt(i); 

            if(ch == '('){
                s.push(ch);
            }

            else{
                if(s.isEmpty())     return false;
                if(s.peek()=='(')   s.pop();
            }
        }

        if(s.isEmpty()) return true;

        else    return false;

    }

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(isBalanced(str));
    }
}