/* Problem Statement: Given an integer N, print the following pattern : 

* * * * * *
* * * * *
* * * *
* * *
* *
*

*/
import java.util.Scanner;

public class P5InvertedRightPyramid {
    public static class Pattern {
        
        Scanner sc = new Scanner(System.in);

        int input(){

            System.out.println("Enter The No. Of Rows To Display The Pattern ");
            int N = sc.nextInt();
            display(N);
            return N;
        }

        void display(int N){

            if(N<0){
                System.out.print("Invaild Input Please Re-");
                input();
            }

            else if(N==0){System.out.println("NULL");}

            else{
                
                int i,j;

                for(i = N; i > 0; i--){
                    for(j = 0; j<i; j++ ){
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
