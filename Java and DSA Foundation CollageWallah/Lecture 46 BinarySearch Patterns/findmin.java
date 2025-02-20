public class findmin {

    public static int min(int[] a){

        int n = a.length;

        int st = 0, end = n-1;

        int ans = -1;

        while(st<end){

            int mid = st + (end-st)/2;

            if(a[mid]>a[n-1])   st = mid + 1;
            
            else if(a[mid] <= a[n-1]){
                ans = mid;
                end = mid -1;
            }

        }

        return ans;
    }

    public static void main(String[] args) {
        int[] a = {3,4,5,1,2};

        System.out.println(min(a));
    }
    
}
