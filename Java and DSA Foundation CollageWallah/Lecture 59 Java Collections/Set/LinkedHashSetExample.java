/*
    we can preserve the order of insertion 
        Linked List + Hash Table


 */

import java.util.*;

public class LinkedHashSetExample {
    
    public static void Solution(){

        LinkedHashSet<Integer> s = new LinkedHashSet<>();
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
