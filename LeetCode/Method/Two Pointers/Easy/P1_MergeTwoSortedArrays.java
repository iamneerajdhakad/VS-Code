
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class P1_MergeTwoSortedArrays {

    public static int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> s = new HashSet<>();
        ArrayList<Integer> l = new ArrayList<>();

        for(int i : nums1)  s.add(i);

        for(int j : nums2){
            if(s.contains(j)){
                l.add(j);
                s.remove(j);
            }
        }

        int res[] = new int [l.size()];
        for(int i = 0; i<res.length; i++){
            res[i] = l.get(i);
        }

        

        return res;
    }

    public static int[] intersectionM(int[] nums1, int[] nums2) {
        
        
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++; // Move pointer `i` forward
            } else if (nums1[i] > nums2[j]) {
                j++; // Move pointer `j` forward
            } else { // nums1[i] == nums2[j], common element found
                if (result.isEmpty() || result.get(result.size() - 1) != nums1[i]) {
                    result.add(nums1[i]); // Add to result (avoid duplicates)
                }
                i++;
                j++;
            }
        }

        // Convert list to array
        return result.stream().mapToInt(x -> x).toArray();
    }

    

    
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            int[] arr1 = new int[N];
            int[] arr2 = new int[M];
            
            for(int i = 0; i < N; i++){
                arr1[i]=sc.nextInt();
            }
      
            
            
            
            for(int i = 0; i < M; i++){
                arr2[i]=sc.nextInt();
            }

            System.out.println(Arrays.toString(intersection(arr1, arr2)));
            System.out.println(Arrays.toString(intersectionM(arr1, arr2)));

            
        }
    }
    
}
