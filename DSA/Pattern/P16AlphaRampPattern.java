/* Problem Statement: Given an integer N, print the following pattern : 

A 
B B
C C C
D D D D
E E E E E
F F F F F F

*/

import java.util.Scanner;

public class P16AlphaRampPattern {

    public static class Pattern {

        Scanner sc = new Scanner(System.in);

        void input(){

            System.out.print("Enter the No. of rows to be displayed : ");
            int N = sc.nextInt();
            System.out.println();
            display(N);

        }

        void display(int N){

            if(N<0){

                System.out.print("Invalid Input Please Re-");
                input();
                
            }

            else if(N==0){System.out.println("NULL");}

            else{

                for(int i = 0; i < N; i++){
                    for(int j = 0; j <= i; j++){
                        System.out.print((char)(int)('A'+i) + " ");
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
