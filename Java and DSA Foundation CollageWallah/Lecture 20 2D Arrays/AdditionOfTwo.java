public class AdditionOfTwo {

    public static int[][] Addition(int[][] arr1, int[][] arr2){

        
        int[][] sum = new int[arr1.length][arr1[0].length];

        if(arr1.length!=arr2.length || arr1[0].length != arr2[0].length){
            System.out.println("Invalid  Input : ");
        }

        else{

            for(int i = 0; i < arr1.length; i++){
                for(int j = 0; j < arr1[0].length; j++){
                    sum[i][j]=arr1[i][j]+arr2[i][j];
                }
            }

            
        }

        
        return sum;
    }

    public static void main(String[] args) {

        int[][] arr1 = MultiDimensionalArray.MultiArrayInput();
        int[][] arr2 = MultiDimensionalArray.MultiArrayInput();

        MultiDimensionalArray.print(Addition(arr1, arr2));  

        
    }
}
