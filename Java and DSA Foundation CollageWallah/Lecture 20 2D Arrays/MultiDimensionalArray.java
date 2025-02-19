
import java.util.Scanner;

public class MultiDimensionalArray {

    public static Scanner sc = new Scanner(System.in);

    public static void print(int[][] arr){

        for (int[] arr1 : arr) {

            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[j]+" ");
            }
            System.out.println();
        }

    }

    public static int[][] MultiArrayInput(){

        System.out.print("Enter No. of Rows Of 2D Array : ");
        int r = sc.nextInt();
        System.out.print("Enter No. of Columns Of 2D Array : ");
        int c = sc.nextInt();
        
        int[][] arr = new int[r][c];

        for(int i =0; i < arr.length; i++){

            for(int j =0; j < arr[i].length; j++){

                System.out.printf("Enter the value for index %d , %d: ",i,j);
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }

        return arr;
        

    }
    public static void main(String[] args) {
        int[][] arr = MultiArrayInput();
        print(arr);
    }
}
