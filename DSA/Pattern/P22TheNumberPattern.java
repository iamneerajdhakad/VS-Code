/* Problem Statement: Given an integer N, print the following pattern : 

6 6 6 6 6 6 6 6 6 6 6 
6 5 5 5 5 5 5 5 5 5 6 
6 5 4 4 4 4 4 4 4 5 6 
6 5 4 3 3 3 3 3 4 5 6 
6 5 4 3 2 2 2 3 4 5 6 
6 5 4 3 2 1 2 3 4 5 6 
6 5 4 3 2 2 2 3 4 5 6 
6 5 4 3 3 3 3 3 4 5 6 
6 5 4 4 4 4 4 4 4 5 6 
6 5 5 5 5 5 5 5 5 5 6 
6 6 6 6 6 6 6 6 6 6 6

*/

import java.util.Scanner;

public class P22TheNumberPattern {

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

                for(int i=0;i<2*N-1;i++){
         
                    // inner loop for no. of columns.
                    for(int j=0;j<2*N-1;j++){
                        
                        // Initialising the top, down, left and right indices of a cell.
                        int top = i;
                        int bottom = j;
                        int right = (2*N - 2) - j;
                        int left = (2*N - 2) - i;
                        
                        // Min of 4 directions and then we subtract from n
                        // because previously we would get a pattern whose border
                        // has 0's, but we want with border N's and then decrease inside.
                        System.out.print(N- Math.min(Math.min(top,bottom), Math.min(left,right)) + " ");
                    }
                    
                    // As soon as the numbers for each iteration are printed, we move to the
                    // next row and give a line break otherwise all numbers
                    // would get printed in 1 line.
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
