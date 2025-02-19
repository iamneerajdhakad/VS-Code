
import java.util.Scanner;

public class Factorial {

    public static class Solution{
        
        Scanner sc = new Scanner(System.in);

        int input(){

            System.out.print("Enter A Number To Print The Factorial : ");
            int N = sc.nextInt();

            if(N<0){

                System.out.println("Please Enter A Positive Number To Display The Factorial :");
            }
            
            return N;
        
        }

        int fact(int N){

            if(N==0 || N==1){
                return 1;
            }

            return N*fact(N-1);

        }

        void closeScanner(){
            sc.close();
        }
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println("Factorial : " + s.fact(s.input()));
        s.closeScanner();
    }
}
