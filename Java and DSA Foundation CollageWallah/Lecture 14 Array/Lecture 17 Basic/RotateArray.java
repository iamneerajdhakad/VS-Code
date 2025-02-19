
import java.util.Arrays;

public class RotateArray {

    public static int[] Solution(int[] arr,int k){

        int N = arr.length;

        k = k % N;
        int j = 0;
        int[] ans = new int[N];

        for(int i = N - k; i < N; i++){
            ans[j++]=arr[i];
        }

        for(int i = 0; i < N-k; i++){
            ans[j++]=arr[i];
        }

        return ans;
    }

    public static void reverse(int[] arr, int i, int j){

         

        while(i <= j){
            
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

    }

    public static int[] Solution2(int[] arr,int k){

        int N = arr.length;
        k = k % N;

        reverse(arr, 0, N-k-1);
        reverse(arr, N-k, N-1);
        reverse(arr, 0, N-1);
        
        return arr;
        
    }



    public static void main(String[] args) {
        
        int k = Template.InputInt();

        int[] arr = Template.input();

        System.out.println(Arrays.toString(Solution(arr, k)));

        System.out.println(Arrays.toString(Solution2(arr, k)));

    }

}
