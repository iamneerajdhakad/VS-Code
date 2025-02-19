/* It uses :
        alaways Sorted
        self Balancing BST(Red Black Tree)
 */

import java.util.*;

public class SortedSetExample {
    public static void Solution(){

        TreeSet<Integer> s = new TreeSet<>();

        s.add(1);
        s.add(2);
        s.add(3);
        s.add(48);
        s.add(15);
        s.add(10);

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
