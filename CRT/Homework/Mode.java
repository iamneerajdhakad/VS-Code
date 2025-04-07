
import java.util.HashMap;

public class Mode {
    public static int mode(int[] n){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : n){

            if(!map.containsKey(i)){
                
                map.put(i, 1);
            }

            else{
                int freq = map.get(i);
                freq++;
                map.put(i, freq);
            }

        }

        int max = 0;

        for(int i : n){

            int freq = map.get(i);
            
            if(freq > max){
                max = freq;
            }
        }

        return n[max+1];
    }

    public static void main(String[] args) {
        
        int[] arr = {90, 100, 78,100, 89, 67};

        System.out.println(mode(arr));

    }
}
