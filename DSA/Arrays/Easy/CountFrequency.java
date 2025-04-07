
import java.util.HashMap;
import java.util.Map;

/* Problem statement: Given an array, we have found the number of occurrences of each element in the array. */
public class CountFrequency {

    public static void Solution(int[] arr){

        HashMap<Integer,Integer> m = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++){
            
            if(!m.containsKey(arr[i])){
                m.put(arr[i], 1);
            }
            else{
                int freq = m.get(arr[i]);
                m.put(arr[i], freq+1);
            }
        }
        for (Map.Entry<Integer,Integer> entry : m.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        // int[] arr = Template.input();
        Solution(arr);
    }
}
