
import java.util.Arrays;

public class SuffixSum {

    public static int[] Solution(int[] arr){

        int N = arr.length-1;

        for(int i = N-1; i>=0; i--){

            arr[i]+=arr[i+1];
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = Template.input();

        System.out.println(Arrays.toString(Solution(arr)));
    }
}
