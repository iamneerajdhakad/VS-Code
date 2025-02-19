import java.util.Arrays;

public class SquareOfNoNumbers {

    public static int[] ReverseArray(int[] arr){

        int N = arr.length;
        int[] ans = new int[N];
        int j = 0;

        for(int i = N-1; i >= 0; i--){
            
            ans[j++]=arr[i];

        }

        return ans;
    }

    public static int[] Solution(int[] arr){

        int left = 0;
        int right = arr.length-1;
        int[] ans  = new int[right+1];
        int i = 0;


        while(left<=right){

            int rs = arr[right] * arr[right];
            int rl = arr[left] * arr[left];
            
            if(rs < rl){
                ans[i++]=rl;
                left++;
            }

            else{

                ans[i++]=rs;
                right--;
            }
        }

        arr = ReverseArray(ans);
        

        return arr;

    }
    public static void main(String[] args) {

        int[] arr = Template.input();
        System.out.println(Arrays.toString(Solution(arr)));
    }
}
