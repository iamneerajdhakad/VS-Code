/* Problem Statement: Given an integer N, print the following pattern : 

A
A B
A B C
A B C D
A B C D E
A B C D E F

*/

import java.util.Scanner;

public class P14IncreasingLetterTrianglePattern {

    public static class Pattern{

        Scanner sc = new Scanner(System.in);

        void input(){
            
            System.out.print("Enter The No. of Rows To Be Displayed : ");
            int N = sc.nextInt();
            System.out.println();
            display(N);
        }

        void display(int N){

            if(N<0){

                System.out.println("Invalid Input Please Re-");
                input();
            }

            else if(N==0){System.out.println("NULL");}

            else{

                for(int i = 0; i < N; i++){

                    for(char ch ='A'; ch <= 'A'+i; ch++ ){

                        System.out.print(ch + " ");

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
