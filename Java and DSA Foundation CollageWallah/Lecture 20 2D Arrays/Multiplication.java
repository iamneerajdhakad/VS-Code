public class Multiplication {

    public static int[][] Solution(int[][] arr1,int[][] arr2){

        int[][] arr = new int[arr1.length][arr2[0].length];

        if( arr1[0].length != arr2.length){
            System.out.println("Invalid Input");
        }

        else{
            for(int i = 0; i < arr1.length; i++){ 
                for(int j = 0; j < arr2[0].length; j++){
                    for(int k = 0; k < arr2.length; k++){
                        
                        arr[i][j] += arr1[i][k]*arr2[k][j];
                    }
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        int[][] arr1 = MultiDimensionalArray.MultiArrayInput();
        int[][] arr2 = MultiDimensionalArray.MultiArrayInput();

        MultiDimensionalArray.print(Solution(arr1, arr2));
        
        
    }
    
}