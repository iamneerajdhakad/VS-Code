
import java.util.ArrayList;
import java.util.List;

public class NQueen {

    public static void  main(String[] args) {
        
        int n = 4;
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];

        for(int i =0 ; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j]='.';
            }
        }

        nqueen(board,0,ans);
        System.out.println(ans);

        
    }

    private static void nqueen(char[][] board, int row,List<List<String>> ans) {
        int n = board.length;

        if(row==n){

           List<String> list = new ArrayList<>();
            String s = "";
            for(int i =0 ; i < n; i++){
                for(int j = 0; j < n; j++){
                   
                    list.add(""+board[i][j]);
                   

                }
            }

            ans.add(list);
            return;
        }
        for(int j = 0; j < n; j++){
            if(isSafe(board,row,j)){ 
                board[row][j]='Q';
                nqueen(board, row+1,ans);
                board[row][j]='.'; 
            }
        }

    }

    private static boolean isSafe(char[][] board, int row, int col) {

        // check the row
        int n = board.length;
        for(int j  = 0; j < n ; j++){
            if(board[row][j]=='Q')  return false;
            if(board[j][col]=='Q')  return false;      
        }

        int i = row;
        int j = col;

        while (i>=0 && j <n) { 
            
            if(board[i][j]=='Q')  return false;
            i--;
            j++;
        }

        i = row;
        j = col;

        while(i<n && j<n){
            if(board[i][j]=='Q')  return false;
            i++;
            j++;
        }

        i = row;
        j = col;

        while(i < n && j>=0){
            if(board[i][j]=='Q')  return false;
            i++;
            j--;
        }

        i = row;
        j = col;

        while(i>=0 && j>=0){
            if(board[i][j]=='Q')  return false;
            i--;
            j--;
        }

        return true;
    }
    
}
