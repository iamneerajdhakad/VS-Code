
import java.util.Stack;


public class StackExample {

    public static void Solution(){

        Stack<String> s = new Stack<>();
        s.push("Hello");
        s.push("My");
        s.push("World");
        System.out.println(s.size());
        System.out.println(s.pop());
        System.out.println(s.empty());
        System.out.println(s.peek());

    }

    public static void main(String[] args) {
        Solution();
    }
}