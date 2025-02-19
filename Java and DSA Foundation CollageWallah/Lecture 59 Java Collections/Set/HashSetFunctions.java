/* It is :
    unordered
    unique
    uses hasing internally

 */
import java.util.HashSet;

public class HashSetFunctions {
    
    public static void Solution(){

        HashSet<Integer> s = new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(3);

        System.out.println(s);

        s.add(1);
        s.add(2);

        System.out.println(s);

        s.remove(2);

        System.out.println(s);
        System.out.println(s.contains(2));
        System.out.println(s.size());

    }
    public static void main(String[] args) {
        Solution();
    }
}
