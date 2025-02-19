
import java.util.Scanner;

public class SumOfFirstNums {

    public static class Solution{

        Scanner sc = new Scanner(System.in);

        int input(){

            System.out.print("Enter A Number To Print The Sum : ");
            int N = sc.nextInt();

            if(N<0){

                System.out.println("Please Enter A Positive Number To Display The Sum :");
            }

            else if(N==0){System.out.println("Sum : " + N);}
            
            return N;
        
        }

        int Sum(int N){

            if(N==0) return 0;

            return N + Sum(N-1);
        }

        

        void closeScanner(){

            sc.close();
        }

        
    }   
    public static void main(String[] args) {
        
        Solution s = new Solution();

        System.out.println("Sum of first N Number : "+s.Sum(s.input()));
        s.closeScanner();

    }
}
