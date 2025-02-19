/* Problem Statement: Given an integer N, print the following pattern : 
        
        * 
        * * 
        * * *

 */

import java.util.Scanner;

public class P2RightAngledTrianglePattern {
    
    public static class Pattern{
        Scanner sc = new Scanner(System.in);
            int input(){

                System.out.print("Enter The No. of Rows For Right Angled Triangle Pattern : ");
                int N = sc.nextInt();
                System.out.println();
                display(N);
                
                return N;
            }

            void display(int N){
                
                if(N<0){
                    System.out.print("Invalid Input Please re-");
                    input();

                }

                else if (N==0){System.out.println("NULL");}

                else{
                    int i,j;

                    for(i = N; i >= 0; i--){
                        for(j = i; j < N; j++){
                            System.out.print("*"+" ");
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
