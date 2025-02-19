
import java.util.Scanner;

public class Template {
    
    static Scanner sc = new Scanner(System.in);

        public static int[] input(){

            System.out.print("Enter The No. Of Element in The Array : ");
            int N = sc.nextInt();
            System.out.println();
            int[] arr = new int[N];

            if(N<0){

                System.out.println("Invalid Input Please Re-");
                input();

            }

            else if(N==0){
                
                System.out.println("NULL");
                return new int[0];

            }

            else{

                for(int i = 0; i < N; i++ ){

                    System.out.print("Enter " + i + "th Element Of Array : " );
                    arr[i]=sc.nextInt();

                }
            }

            return arr;
        }

        public static void display(int[] arr,String message){

            System.out.println(message);

            for(int i = 0; i < arr.length; i++){

                System.out.print(arr[i]+" ");
            
            }

            System.out.println();

        }

        public static int InputInt(){

            System.out.print("Enter The No. : ");
            int num = sc.nextInt();
            
            return num;
        }

        public static int findArraySum(int[] arr){

            int TotalSum = 0;

            for(int i =0; i < arr.length; i++){
                TotalSum+=arr[i];
            }

            return TotalSum;
        }
        
        
        
        }

