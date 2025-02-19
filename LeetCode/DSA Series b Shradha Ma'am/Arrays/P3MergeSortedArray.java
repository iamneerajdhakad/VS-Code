
import java.util.Arrays;
import java.util.Scanner;


public class P3MergeSortedArray {

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {

        int k=m-1,j=n-1,idx=m+n-1;

        for(int i =m+n-1 ; i >= 0 && j >=0; i--){

            if(nums1[k]<=nums2[j]){
                nums1[idx]=nums2[j];
                j--;
                idx--;
            }
            else if(nums1[k]>nums2[j]){
                nums1[idx]=nums1[k];
                k--;
                idx--; 
            }

        }

       return nums1;
    }

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] nums1 = new int[m+n];
        int[] nums2 = new int[n];

        for(int i = 0; i < m + n; i++){
            nums1[i]=sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            nums2[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(merge(nums1, m, nums2, n)));
    }

}
