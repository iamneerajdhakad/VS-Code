import java.util.Arrays;

public class SortEvenandOdd {

    public static int[] Solution(int[] arr){

        int left = 0;
        int right = arr.length-1;

        while(left < right){

            if(arr[left]%2==1 && arr[right]%2==0){

                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }

            else if (arr[left]%2==0){
                left++;
            }

            else if(arr[right]%2==1){

                right--;
            }


        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = Template.input();

        System.out.println(Arrays.toString(Solution(arr)));
    }
}
