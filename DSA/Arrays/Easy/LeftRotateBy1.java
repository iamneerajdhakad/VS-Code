
import java.util.Arrays;

public class LeftRotateBy1 {

    public static int[] Solution(int[] arr){

        int temp=arr[0];
        int n =arr.length;

        for(int i = 0; i < n-1; i++){
            
            arr[i]=arr[i+1];

        }

        arr[n-1]=temp;

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution(Template.input())));
    }
}
