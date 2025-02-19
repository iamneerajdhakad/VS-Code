import java.util.*;

public class QuestionHashMap {

    public static void Solution(){

        HashMap<Integer,String> m = new HashMap<>();

        m.put(1, "Hello");
        m.put(2, "World");
        m.put(3, "!");
        m.put(4, "Welcome.");

        for(var i : m.entrySet()){
            
            System.out.print(i.getValue()+" ");
        }
    }
    public static void main(String[] args) {
        Solution();
    }
}
