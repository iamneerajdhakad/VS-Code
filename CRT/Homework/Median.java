
import java.util.Arrays;

public class Median {
    public static double findMedian(int[] arr) {
        // Code here.
        Arrays.sort(arr);
        
        int n = arr.length;
        
        if(n%2!=0)  return (double)arr[n/2];
        
        else{
            
            n /= 2;
            
            double average = (double)arr[n] + (double)arr[n-1];
            
            average/=2;
            
            return average;
        }
    }
   public static void main(String[] args) {
        
        int[] arr = {90, 100, 78, 89, 67};

        System.out.println(findMedian(arr));

    }
}
