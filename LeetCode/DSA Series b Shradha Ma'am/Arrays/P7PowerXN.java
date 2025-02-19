
import java.util.Scanner;

public class P7PowerXN {

    public static double myPow(double x, int n) {

        long binaryForm = n;
        double ans = 1;

        while(binaryForm>0){

            if(binaryForm % 2 == 1){

                ans *= x;
                System.out.println("ans:"+ans);
                System.out.println("x:"+x);
            }

            x *=x;
            System.out.println("x:"+x);
            binaryForm /= 2;
            System.out.println("BinaryForm:"+binaryForm);
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double x = sc.nextDouble();

        System.out.println(myPow(x, n));
    }
}
,mefljknberl
