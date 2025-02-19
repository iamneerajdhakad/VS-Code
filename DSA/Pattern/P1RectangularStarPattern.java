/* Problem Statement: Given an integer N, print the following pattern.

    * * *
    * * *
    * * *

*/

import java.util.Scanner;

class P1RectangularStarPattern {
    
    public static class Pattern{

        Scanner sc = new Scanner(System.in);

    int input(){
        
        System.out.print("Enter The No. Of Rows & Columns TO Print The Rectangular Star Pattern : ");
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
        else{
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
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