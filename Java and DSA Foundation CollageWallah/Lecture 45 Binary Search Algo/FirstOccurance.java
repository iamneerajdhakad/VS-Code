public class FirstOccurance {

    public static int FO(int[] a, int target){

        int st = 0;
        int end = a.length-1;
        int f = -1;

        while(st<=end){

            int mid = (st+end)/2;

            if(target==a[mid]){
                f = mid;
                end = mid-1;
            }
            else if(target>a[mid])  st = mid+1;

            else if(target<a[mid])  end = mid-1;
        }

        return f;
    }


    

    public static void main(String[] args) {

        int[] a = {1,2,2,3,5,5,5,6,6,6,7,7,7,8,8,8,9,9};

        int target = 5;

        System.out.println(FO(a,target));
        
    }
}
