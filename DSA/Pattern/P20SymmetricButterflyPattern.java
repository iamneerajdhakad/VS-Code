/* Problem Statement: Given an integer N, print the following pattern : 

*          *
**        **
***      ***
****    ****
*****  *****
************
*****  *****
****    ****
***      ***
**        **
*          *

*/

import java.util.Scanner;

public class P20SymmetricButterflyPattern {

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

                for(int i = N; i >= 0; i--){
                    
                    for(int j = 0; j < (N - i) ;j++){
                        System.out.print("*");
                    }

                    for(int j = 0; j <= 2*(i-1)+1;j++ ){
                        System.out.print(" ");
                    }

                    for(int j = 0; j < (N - i) ;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }

                for(int i = 0; i < N-1; i++){
                    
                    for(int j = 0; j < (N - i)-1 ;j++){
                        System.out.print("*");
                    }

                    for(int j = 0; j <= 2*(i+1)-1;j++ ){
                        System.out.print(" ");
                    }

                    for(int j = 0; j < (N - i)-1 ;j++){
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
