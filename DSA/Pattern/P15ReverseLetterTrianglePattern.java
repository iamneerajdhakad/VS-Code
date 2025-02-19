/* Problem Statement: Given an integer N, print the following pattern : 

A B C D E F
A B C D E 
A B C D
A B C
A B
A

*/

import java.util.*;

public class P15ReverseLetterTrianglePattern {
    
    public static class Pattern {

        Scanner sc = new Scanner(System.in);

        void input(){

            System.out.print("Enter The No. Of Rows To Display The Pattern : ");
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

            else {

                for(int i = N; i > 0; i-- ){
                    for (char ch = 'A'; ch < 'A' + i; ch++){
                        System.out.print(ch + " ");
                    }
                    System.out.println();
                }
                /*  This below algo also give the same result
                
                for(int i = 0; i < N; i++){
                    for(char ch = 'A'; ch <'A'+ N - i;ch++){
                        System.out.print(ch + " ");
                    }
                    System.out.println();
                } 

                */
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
