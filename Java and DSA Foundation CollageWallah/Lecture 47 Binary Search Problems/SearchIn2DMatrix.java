public class SearchIn2DMatrix {

    public static boolean searchMatrix(int[][] a, int target){
        
        int n = a.length,m = a[0].length;

        int st = 0, end = m*n-1;

        while(st<=end){
            int mid = st + (end - st)/2;

            int midEle = a[mid/m][mid%m];

            if(midEle==target)  return true;

            else if( midEle < target)   st = mid + 1;
            else if( midEle > target)   end = mid - 1;
        }
        return false;
    }
    

    public static void main(String[] args) {
        
    }
}
