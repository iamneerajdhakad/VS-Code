public class CeilingOfaNumber {

    public static int ceiling(int[] arr,int target){

        int n = arr.length;
        int st = 0, end = n-1;

        if(target > arr[end])   return -1;
        if(target < arr[st])   return st;

        while(st<=end){

            int mid = st + (end-st)/2;

            if(arr[mid]==target)    return mid;

            else if( arr[mid] < target) st = mid+1;
            else if( arr[mid] > target) end = mid-1;
        }

        return st;

    }

    public static void main(String[] args) {


        int[] arr = {1,2,3,4,5,6,7,8,9,11};

        int target = -1;

        System.out.println(ceiling(arr, target));
        
    }
}