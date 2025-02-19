/* Problem Statement: Given an integer N, print the following pattern : 

     *
    ***
   *****
  *******
 *********
***********

*/


import java.util.Scanner;

public class P7StarPyramid {
    
    public static class Pattern{

        Scanner sc = new Scanner(System.in);

        int input(){

            System.out.print("Enter The No. Of Rows To Display Stat Pyramid : ");
            int N = sc.nextInt();
            display(N);
            return N;
        }

        void display(int N){
            if(N<0){
                System.out.println("Invalid Input Please Re-");
                input();
            }

            else if(N==0){System.out.println("NULL");}

            else{
                
                int i,j,k;

                for(i = 0; i < N; i++){
                    
                    for(j = 0; j < N-i-1; j++){
                        System.out.print(" ");
                    }

                    for(k = 0; k < 2*i+1; k++){
                        System.out.print("*");
                    }

                    for(j = 0; j < N-i-1; j++){
                        System.out.print(" ");
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
