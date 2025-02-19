import java.util.HashMap;
import java.util.Scanner;

public class thenumberthatappearsonce {

    public static int Solution(int[] arr){

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

        for(var i : m.entrySet()){

            if(1==i.getValue()){
                
                return i.getKey();
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){

        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i< N; i++){

            arr[i]=sc.nextInt();
        }

        System.out.println(Solution(arr));

        sc.close();
        }
    }
}
