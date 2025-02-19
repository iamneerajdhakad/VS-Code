
import java.util.Scanner;

public class P3_TrappingRainWater {

    public static int trap(int[] height) {
        int lmax=0,rmax=0,total=0,l=0,r=height.length-1;

        while(l<r){

            if(height[l]<=height[r]){

                if(lmax>height[l])     total += lmax - height[l];
                else    lmax    =   height[l];
                l++;
            }

            else{

                if(rmax>height[r])  total += rmax - height[r];
                else    rmax = height[r];
                r--;
            }
        }

        return total;

    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            

            int[] arr = new int[N];
            
            
            for(int i = 0; i < N; i++){
                arr[i]=sc.nextInt();
            }
      
            
            

            System.out.println(trap(arr));
        }
    }
    
}
