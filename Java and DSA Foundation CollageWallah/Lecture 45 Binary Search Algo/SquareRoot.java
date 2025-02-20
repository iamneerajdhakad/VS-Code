public class SquareRoot {

    public static int root(int sr){
        int st = 0;
        int end = sr;
        int ans =0;

        while(st <= end){

            int mid = st + (end - st)/2;
            int val = mid*mid;

            if(val == sr){
                return mid;
            }

            else if (val < sr){
                ans = mid;
                st = mid+1;
            }
            else {
                end = mid-1;
            }
            //ans = mid;
        }

        return ans;
    }

    public static void main(String[] args) {
        int sr = 26;

        System.out.println(root(sr));
    }
    
}
