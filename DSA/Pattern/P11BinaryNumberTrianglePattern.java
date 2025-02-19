/* Problem Statement: Given an integer N, print the following pattern : 

1
01
101
0101
10101
010101

*/
import java.util.Scanner;

public class P11BinaryNumberTrianglePattern {
    public static class Pattern{

        Scanner sc = new Scanner(System.in);

        void input(){

            System.out.print("Enter No. Of Rows To Display Pattern : ");
            int N = sc.nextInt();
            System.out.println();
            display(N);
        }

        void display(int N){

            if(N<0){

                System.out.print("Invalid Input Please Re-");
                input();
            }

            else if(N==0){System.out.println("Null");}

            else {
                
                int i,j,x;

                for(i = 0; i < N; i++){

                    if(i%2 ==0) x = 1;
                    else    x=0;

                        for(j = 0; j <= i; j++){

                            System.out.print(x);
                            x=1-x;

                        }
                    System.out.println();
                }

            }
        }

        void closeScanner(){

            sc.close();
        }
    }
    public static void main(String[] args) {
        
        Pattern p = new Pattern();

        p.input();
        p.closeScanner();
    }
}
