/* Problem Statement: Given an integer N, print the following pattern : 

     A
    ABA
   ABCBA
  ABCDCBA
 ABCDEDCBA
ABCDEFEDCBA

*/

import java.util.Scanner;

public class P17AlphaHillPattern {

    public static class Pattern{

        Scanner sc = new Scanner(System.in);

        void input(){

            System.out.print("Enter The No. Of Rows To Display Pattern : ");
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
                int i,j;
                for(i = 0; i < N; i++){

                    char ch;

                    for (j = i; j < N-1; j++ ){
                        System.out.print(" ");
                    }

                    for(ch = 'A'; ch <= 'A'+i; ch++){
                        
                        System.out.print(ch);
                    }

                    
                    for(ch = (char) ('A' + i - 1); ch >= 'A'; ch--){
                        System.out.print(ch);
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
