/* Problem Statement: Given a matrix if an element in the matrix is 0 then you will have to set its entire column and row to 0 and then return the matrix. */


public class SetMatrixZero {

    void display(int[][] matrix){
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    

    void result(int[][] matrix){
         
        for (int[] matrix1 : matrix) {
            for (int j = 0; j < matrix1.length; j++) {
                if (matrix1[j] == 0) {
                    for (int k = 0; k < matrix.length; k++) {
                        matrix[k][j] = 0;  // Set the entire column to 0
                    }
                    for (int k = 0; k < matrix1.length; k++) {
                        matrix1[k] = 0; // Set the entire row to 0
                    }
                }
            }
        }
}
    
    public static void main(String[] args) {
        
        SetMatrixZero s = new SetMatrixZero();

        int[][] matrix1 = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        s.display(matrix1);
        s.result(matrix1);
       s.display(matrix1);
    }
}