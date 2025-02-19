
import java.util.Scanner;


public class FindthePivotInteger {

    public static int pivotInteger(int n) {

        int left = 1, right = n;
        int leftSum = left, rightSum = right;

        if(n == 1) return n;

        while(left < right){

            if(leftSum<rightSum){
                left++;
                leftSum+=left;
            }

            else{
                right--;
                rightSum+=right;
            }

            if(leftSum==rightSum && left+1==right-1){
                return left+1;
            }
        }

        
        return-1;
    }


    public static void main(String[] args) {
    
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();

            System.out.println(pivotInteger(N));
        }

    }
    
}
