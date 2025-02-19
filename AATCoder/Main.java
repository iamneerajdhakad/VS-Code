import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static int search(int arr[], int key) {
        // Write your code here.
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(m.containsKey(key)){
                return m.get(key);
            }
            m.put(arr[i], i);
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int 

        
    }
    
}