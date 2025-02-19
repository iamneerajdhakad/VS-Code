import java.util.Stack;

public class postfixToprefix {
    public static void main(String[] args) {
        
        String postfix = "953+4*6/-";

        Stack<String> val = new Stack<>();

        for(int i = 0; i < postfix.length(); i++){

            char ch = postfix.charAt(i);

            int ascii = (int)ch;

            if(ascii >= 48 && ascii <= 57){
                int n = ascii-48;
                val.push("" + n);
                
            }

            else if(ch=='+' || ch=='-' || ch== '*' || ch == '/'){

                
                String v2 = val.pop();
                String v1 = val.pop();

                String t = "" + ch + v1 + v2;

                val.push(t);
            }
        }

        System.out.println(val.peek());
    }
    
}
