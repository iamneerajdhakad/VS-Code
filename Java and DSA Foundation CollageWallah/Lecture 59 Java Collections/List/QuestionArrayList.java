
import java.util.ArrayList;

public class QuestionArrayList {

    public static void Solution(){

        ArrayList<Integer> a = new ArrayList<>();

        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        
        System.out.println(a);
        System.out.println(a.remove(3));
        System.out.println(a);
    }

    public static void main(String[] args) {
        Solution();
    }
}
