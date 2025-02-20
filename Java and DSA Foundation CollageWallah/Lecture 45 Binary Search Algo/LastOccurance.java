public class LastOccurance {

    public static int LO(int[] a, int target){

        int n = a.length;
        int st = 0;
        int end = n-1;
        int l = -1;


        while(st<=end){

            int mid = (st+end)/2;

            if(a[mid]==target) {
                l=mid;
                st=mid+1;
            }

            else if(a[mid]<target){
                st = mid +1;
            }

            else{
                end = mid-1;
            }
        }

        return l;
    }


    public static void main(String[] args) {

        int[] a = {1,2,2,3,5,5,5,6,6,6,7,7,7,8,8,8,9,9};

        int target = 5;

        System.out.println(LO(a,target));
        
    }
    
}
