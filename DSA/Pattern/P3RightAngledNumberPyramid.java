/* Problem Statement: Given an integer N, print the following pattern : 
        
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6

 */

import java.util.Scanner;

public class P3RightAngledNumberPyramid {
    public static class Pattern{

        Scanner sc = new Scanner(System.in);
        
        int input(){
            
            System.out.print("Enter The No. Of Rows To Display Right Angled Number Pyramid : ");
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

            else if(N==0){System.out.println("NULL");}

            else{
                int i,j;
                for (i = 1; i <=N; i++){
                    for(j = 1; j <=i; j++){
                        System.out.print(j+" ");
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
