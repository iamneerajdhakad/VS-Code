/* Problem Statement: Given an integer N, print the following pattern : 

1          1
12        21
123      321
1234    4321
12345  54321
123456654321

*/

import java.util.Scanner;

public class P12NumberCrownPattern {
    
    public static class Pattern{

        Scanner sc= new Scanner(System.in);

        void input(){

            System.out.print("Enter no. of Rows To Display The Pattern : ");
            int N = sc.nextInt();
            System.out.println();
            display(N);
        }

        void display(int N){

            if(N<0){

                System.out.print("Invalid Input Please Re-");
                input();
            }

            else if (N==0){System.out.println("NULL");}

            else {

                int i,j;
                int spaces = 2*(N-1);

                for (i = 1; i <= N; i++){

                    for(j = 1; j <= i; j++){

                        System.out.print(j);

                    }
                    for(int k = 1; k <= spaces;k++){

                        System.out.print(" ");

                    }

                    for(j = i; j >=1; j--){

                        System.out.print(j);

                    }

                    System.out.println();

                    spaces-=2;
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
