/* Problem Statement: Given an integer N, print the following pattern : 

1
2  3
4  5  6
7  8  9  10
11  12  13  14  15
16  17  18  19  20  21

*/

import java.util.Scanner;

public class P13IncreasingNumberTrianglePattern {
    
    public static class Pattern{

        Scanner sc = new Scanner(System.in);

        void input(){

            System.out.print("Enter No. Of Rows To Display The Pattern : ");
            int N = sc.nextInt();
            System.out.println();
            display(N);

        }

        void display(int N){
            
            if(N<0){

                System.out.print("Invalid Input Please Re-");
                input();
            }

            else if(N==0){System.out.println("NULL");}

            else{

                int num=1;

                for(int i = 1; i < N; i++){

                    for(int j = 1; j <= i; j++){

                        System.out.print(num+" ");
                        num++;
                        
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
