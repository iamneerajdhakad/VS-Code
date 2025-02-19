import java.util.Scanner;

public class TemplateA {

    static Scanner sc = new Scanner(System.in);

        public static int[]  input(){
            System.out.print("Enter The No. Of Elements in Array : ");
            int N = sc.nextInt();
            int[] arr= new int[N];
            if(N<0){

                System.out.print("Invalid Input Please Re-");
                input();
            }

            else if(N==0){

                System.out.println("Null");
                arr= new int[0];

            }

            else{

                for(int i = 0; i < N; i++){

                    System.out.print("Enter " + i + "th Element of Array :");
                    arr[i]= sc.nextInt();

                }
            }

            return arr;
        }

        public static int InputInt(){

            System.out.print("Enter The No. : ");
            int num = sc.nextInt();
            
            return num;
        }

        public static void display(int[] arr,String message){

            System.out.println(message);

            for(int i = 0; i < arr.length; i++){

                System.out.print(arr[i]+" ");
            
            }

            System.out.println();

        }

        
}
