import java.util.*;

public class HashMapExample {

    public static void Solution(){

        HashMap<Integer, String> m = new HashMap<>();

        m.put(3, "Aman");
        m.put(1, "Rohan");
        m.put(2, "Riya");
        m.put(1, "Priya");  //     Over-Ride
        m.putIfAbsent(1, "Helo");
        System.out.println(m);
        System.out.println(m.get(2));
        System.out.println(m.containsKey(4));
        System.out.println(m.containsValue("Riya"));
        System.out.println(m.entrySet());
        System.out.println(m.keySet());
        System.out.println(m.values());


    }
    public static void main(String[] args) {
        Solution();
    }
}
