
public class InfiniteArray {

    public static int SearchRange(int[] arr, int target){

        int st = 0, end = 1;

        while(target>arr[end]){

            int temp = end+1;

            end =  end + (end - st + 1)*2;

            st = temp;

        }

        return binarySearch(arr, target, st, end);

    }

    public static int binarySearch(int[] arr, int target, int st,int end){

        while(st<=end){

            int mid = st + (end-st)/2;

            if(arr[mid]==target)    return mid;

            else if(arr[mid]>target)    end = mid - 1;

            else st = mid + 1;

        }

        return -1;
    }


    public static void main(String[] args) {


        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};

        int target = 10;

        System.out.println(SearchRange(arr, target));
        
    }

    
}
