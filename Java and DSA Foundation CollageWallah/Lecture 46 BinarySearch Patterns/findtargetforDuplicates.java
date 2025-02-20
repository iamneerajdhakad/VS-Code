public class findtargetforDuplicates {
    
    public static int search(int[] arr, int target){

        int st = 0, end = arr.length-1;

        while(st<=end){

            int mid = st + (end-st)/2;

            if(arr[mid]==target)    return mid;

            else if(arr[st]==arr[mid] && arr[end]== arr[mid]){
                st++;
                end--;
            }

            else if(arr[mid] <= arr[end]){

                if(arr[mid] < target && arr[end] >= target){
                    st = mid +1;
                }
                else{
                    end = mid -1;
                }
            }

            else{
                if(arr[mid]>target && arr[st]<=target){
                    end = mid -1;
                }
                else{
                    st = mid +1;
                }
            }
            
        }

        return -1;
    }
    
    public static void main(String[] args) {

        int[] a = {0,0,0,1,1,1,2,0,0,0};
        int t = 2;

        System.out.println(search(a, t));
        
    }
}
