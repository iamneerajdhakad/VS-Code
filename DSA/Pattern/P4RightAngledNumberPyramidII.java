/* Problem Statement: Given an integer N, print the following pattern : 

1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
6 6 6 6 6 6

*/

import java.util.Scanner;

public class P4RightAngledNumberPyramidII {
    public static class Pattern {
        
        Scanner sc = new Scanner(System.in);
        
        int input(){

            System.out.println("Enter The No. Of Rows To Display Pattern :");
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

                for(i = 1; i <= N; i++){
                    for(j = 1; j <= i; j++){
                        System.out.print(i+" ");
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

