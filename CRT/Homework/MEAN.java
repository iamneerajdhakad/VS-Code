import java.util.Arrays;

public class MEAN {

    public static int findMean(int[] arr) {
        // code here

        Arrays.sort(arr);

        int sum = 0,n = arr.length;
        
        for(int i : arr){
            
            sum+=i;
        }
        
        return sum/n;
    }
    
}
