
public class FloorOfaNumber {

    public static int flooring(int[] arr, int target){
        int n = arr.length;
        int st = 0, end = n-1;

        if(arr[st]>target)  return -1;
        if(arr[end]<target) return n-1;

        while(st<=end){

            int mid  = st + (end-st)/2;
            
            if(arr[mid]== target)   return mid;

            else if(arr[mid] > target)  end = mid-1;

            else    st = mid + 1;
        }

        return end;
    }

    public static void main(String[] args) {


        int[] arr = {1,2,3,4,5,6,7,8,9,11};

        int target = 12;

        System.out.println(flooring(arr, target));
        
    }
    
}
