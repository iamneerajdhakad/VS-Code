
import java.lang.reflect.Array;

public class BinarySearchalgo {

    public static boolean BS(int[] arr, int target){

        int st = 0;
        int end = arr.length-1;

        while(st<=end){
            
            int mid = (st+end)/2;

            if(arr[mid]==target)    return true;

            else if(arr[mid]<target)    st=mid+1;

            else if(arr[mid]>target)    end=mid-1;
        }

        return false;

    }

    public static boolean RBS(int[] arr, int target,int st, int end){

        

        if(st>end)  return false;

        int mid = (st+end)/2;

        if(arr[mid]==target)    return true;

        else if(arr[mid]<target)    return RBS(arr, target, mid+1, end);

        else  return RBS(arr, target, st, mid-1);


    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};

        int target = 9;

        System.out.println(RBS(a,target,0,a.length-1));

    }
    
}
