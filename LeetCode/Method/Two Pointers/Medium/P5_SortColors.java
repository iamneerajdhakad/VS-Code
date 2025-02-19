import java.util.Arrays;
import java.util.Scanner;

public class P5_SortColors {

    public static int[] sortColors(int[] nums) {

        @SuppressWarnings("unused")
        int counta=0,countb=0,countc=0;
        int i = 0;

        while(i<nums.length){
            
            if(nums[i]==0)     {counta++;}
            else if(nums[i]==1){countb++;}
            else if(nums[i]==2){countc++;}

            i++;
        }

        for(i = 0; i < nums.length; i++){

            if(i<counta){nums[i]=0;}
            else if(i < counta + countb){nums[i]=1;}
            else if(i >= counta + countb){nums[i]=2;}

        }

        return nums;
        
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            

            int[] arr = new int[N];
            
            
            for(int i = 0; i < N; i++){
                arr[i]=sc.nextInt();
            }
      
            
            

            System.out.println(Arrays.toString(sortColors(arr)));
        }
    }
    
}
