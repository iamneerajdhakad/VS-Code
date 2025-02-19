import java.util.Scanner;

public class FibonacciSeries {
    public static class Solution{
        
        Scanner sc = new Scanner(System.in);

        int input(){

            System.out.print("Enter A Number To Print The Fibonacci Series : ");
            int N = sc.nextInt();

            if(N<0){

                System.out.println("Please Enter A Positive Number To Display The FibonacciSeries :");
            }
            
            return N;
        
        }

        int fib(int N){

            if (N == 0) {
                return 0;
            }
            if (N == 1) {
                return 1;
            }

            return fib(N-1)+fib(N-2);

        }

        void closeScanner(){
            sc.close();
        }
    }

    public static void main(String[] args) {

        Solution s = new Solution();

        int n = s.input();
        for (int i = 0; i < n; i++) {
            System.out.print(s.fib(i) + " ");
        }
        s.closeScanner();
    }
}
