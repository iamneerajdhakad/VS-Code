
import java.util.Arrays;


public class ReverseArray {

    public static int[] Solution(int[] arr){

        int N = arr.length;
        int[] ans = new int[N];
        int j = 0;

        for(int i = N-1; i >= 0; i--){
            
            ans[j++]=arr[i];

        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = Template.input();

        
        System.out.println(Arrays.toString(Solution(arr)));
    }
}
