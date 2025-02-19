import java.util.Arrays;

public class Sort0and1 {

    public static int[] Solution(int[] arr){

        int N = arr.length;
        int count = 0;

        for(int i = 0; i < N; i++){
            if(arr[i]==0){
                count++;
            }
        }

        for(int i = 0; i < N; i++){

            if(i < count)   arr[i] = 0;

            else       arr[i] = 1;

        }

        return arr;
    }

    public static int[] Solution2(int[] arr){

        int left= 0;
        int right= arr.length-1;

        while(left<right){

            if(arr[left]==1 && arr[right]==0){

                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }

            else if(arr[right]==1){

                right--;
            }

            else if(arr[left]==0){

                left++;
            }

        }
        
        return arr;
    }

    public static void main(String[] args) {
        
        int[] arr = Template.input();

        System.out.println(Arrays.toString(Solution2(arr)));

    }
}
