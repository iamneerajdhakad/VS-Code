/* Problem Statement: Given an integer N, print the following pattern : 

******
*    *
*    *
*    *
*    *
******

*/

import java.util.Scanner;

public class P21HollowRectanglePattern {
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
                    
                    for(int j=0;j<N;j++){
             
                        if(i==0 || j==0 || i==N-1 || j==N-1)
                           System.out.print(N);
                           
                        // if not border index, print space.
                        else System.out.print(" ");
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
