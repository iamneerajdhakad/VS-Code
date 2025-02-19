import java.util.HashSet;

public class MissingNumber {

    public static int Solution(int[] arr, int N){

        int i = 1;

        for(int k = 0; k < N; k++){
            if(arr[k]!=i){
                return i;
            }
            i++;
        }

        return -1;
    }

    public static int missingNumber(int[] arr) {

        HashSet<Integer> h = new HashSet<>();
        int N = arr.length;

        for(int i = 0; i < N; i++){

            h.add(arr[i]);
        }

        for(int i = 0; i < N; i++){
            
            if(!h.contains(i)){
                return i;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = TemplateA.input();
        //int N =arr.length+1;
        
        //System.out.println(Solution(arr,N));
        System.out.println(missingNumber(arr));

    }
}
