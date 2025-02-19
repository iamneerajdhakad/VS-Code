
import java.util.Scanner;

public class P2_ContainerWithMostWater {

    public static int maxArea(int[] height) {
        
        int left = 0, right = height.length-1;
        int maxWater=0;
        while(left<right){

            int width = right-left;
            int h = Math.min(height[left],height[right]);

            int currWater = width * h;
            maxWater = Math.max(currWater,maxWater);

            if(height[left] < height[right]) left++;
            
            else      right--;
        }

        return maxWater;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            

            int[] arr = new int[N];
            
            
            for(int i = 0; i < N; i++){
                arr[i]=sc.nextInt();
            }
      
            
            

            System.out.println(maxArea(arr));
        }
    }
    
}
