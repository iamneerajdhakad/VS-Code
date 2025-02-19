
import java.util.HashMap;
import java.util.Scanner;

public class HighLowFrequencey {

    public static void Solution(int[] arr){

        HashMap<Integer,Integer> m = new HashMap<>();

        int high=Integer.MIN_VALUE,low=Integer.MAX_VALUE;
        int Hkey = 0;
        int Lkey=0;

        for(int i = 0; i  < arr.length; i++){

            if(!m.containsKey(arr[i])){
                m.put(arr[i],1);
            }
            else{
                int freq = m.get(arr[i]);
                m.put(arr[i], freq+1);

            }
        }

        for(var i : m.entrySet()){

            
            high = Math.max(high, i.getValue());

            if(high==i.getValue()){ Hkey=i.getKey(); }

            low = Math.min(low, i.getValue());

            if(low==i.getValue()){ Lkey=i.getKey(); }

        }

        

        System.out.printf("Highest frequency of %d is : %d",Hkey, high);
        System.out.println();
        System.out.printf("Lowest frequency of %d is : %d",Lkey,low);

    }

    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in);){

        int N = sc.nextInt();

        int[] arr = new int[N];

        for(int i =0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        Solution(arr);
        sc.close();
    }
    }
}
