/* Problem Statement: Given an integer N, print the following pattern :

     *
     **
     ***
     ****
     *****
     ******
     *****
     ****
     ***
     **
     *

*/

import java.util.*;
public class P10HalfDiamondStarPattern {

    public static class Pattern{

        Scanner sc = new Scanner(System.in);

        int input(){
            
            System.out.print("Enter The No. of Rows For Half Pattern : ");
            int N = sc.nextInt();
            display(N);
            return N;

        }

        void display(int N){

            if(N<0){
                System.out.print("Invalid Input Please Re-");
                input();
            }

            else if(N==0){System.out.println("NULL");}

            else{

                int i,j;

                for(i=0; i < N; i++){
                    for(j=0;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }

                for(i = N-1; i > 0; i--){
                    for(j = 0 ; j < i ; j++){
                        System.out.print("*");
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
