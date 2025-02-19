
public class P8ContainerWithMostWater {
    public int maxArea(int[] height) {

        int left = 0, right = height.length-1, maxWater = 0;

        while(left < right){

            int width = right - left;

            int minheight = Math.min(height[left], height[right]);

            int CurrWater = width*minheight;

            maxWater = Math.max(CurrWater, maxWater);

            if(height[left]<height[right])  left++;

            else right--;

        }

        return maxWater;
    }

    public static void main(String[] args) {
        
    }
}
