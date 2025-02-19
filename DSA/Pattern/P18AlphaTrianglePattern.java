import java.util.Scanner;

public class P18AlphaTrianglePattern {

    public static class Pattern{

        Scanner sc = new Scanner(System.in);

        void input(){

            System.out.print("Enter The No. Of Rows To Display Pattern : ");
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

                int i;

                for(i = 0; i < N; i++){

                    char ch ;

                    for(ch =(char)(int)('A'+N-1-i) ; ch <=(char)(int)('A'+ N-1); ch++){

                        System.out.print(ch);
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
