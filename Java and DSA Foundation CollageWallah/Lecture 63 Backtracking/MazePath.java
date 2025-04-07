public class MazePath {

    private static void printPathTwoDirection(int sr,int sc, int rows,int columns,String s){

        if(rows > 4 || columns > 4) return;

        if(sr>rows || sc>columns ) return;
        if(sr==rows && sc == columns){ 
            System.out.println(s);  return;
        }

        //go down

        printPathTwoDirection(sr+1, sc, rows, columns, s+"D");
        printPathTwoDirection(sr, sc+1, rows, columns, s+"R");
    }

    private static int mazeTwoDirection(int sr,int sc, int rows,int columns){

        if(sr>rows || sc>columns ) return 0;
        if(sr==rows && sc == columns) return 1;


        int downways = mazeTwoDirection(sr+1, sc, rows, columns);
        int rightways = mazeTwoDirection(sr, sc+1, rows, columns);

        int totalways = downways + rightways;

        return totalways;

    }

    private static int maze4directions(int sr,int sc, int rows,int columns,String s, boolean[][] isVisited){
        
        if(sr<0 || sc<0)     return 0;
        else if(sr>rows || sc > columns) return 0;
        if(isVisited[sr][sc]==true) return 0;
       
        if(sr == rows && sc == columns) {
            //System.out.println(s);
            return 1;
        }

        isVisited[sr][sc]=true;

        int right = maze4directions(sr, sc+1, rows, columns, s+"R",isVisited);
        int down = maze4directions(sr+1, sc, rows, columns, s+"D",isVisited);
        int left = maze4directions(sr, sc-1, rows, columns, s+"L",isVisited);
        int up = maze4directions(sr-1, sc, rows, columns, s+"U",isVisited);

        isVisited[sr][sc] = false;

        int count = down + right + left + up;

        return count;

    }

    public static void main(String[] args) {
    
        int sc = 0;
        int sr = 0;

        int rows = 3;
        int columns = 3;

        // int count = mazeTwoDirection(sr,sc,rows,columns);
        // System.out.println(count);

        // printPathTwoDirection(sr, sc, rows, columns, "");

        boolean[][] isVisited = new boolean[rows][columns];

        System.out.println(maze4directions(sr, sc, rows-1, columns-1, "", isVisited));
    }
}