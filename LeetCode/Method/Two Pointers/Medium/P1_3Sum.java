
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class P1_3Sum {

    public static ArrayList<ArrayList<Integer>> Bf(int[] arr) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        ArrayList<Integer> trip = new ArrayList<>(Arrays.asList(arr[i], arr[j], arr[k]));
                        Collections.sort(trip);

                        // Avoid duplicate triplets
                        if (!result.contains(trip)) {
                            result.add(trip);
                        }
                    }
                }
            }
        }
        return result;
    }

    public static ArrayList<ArrayList<Integer>> Better(int[] arr) {
        Arrays.sort(arr);  // Sort the array to avoid duplicate triplets
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            // Avoid duplicate values for arr[i]
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            HashSet<Integer> set = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int complement = - (arr[i] + arr[j]);

                // If complement exists in the set, we found a triplet
                if (set.contains(complement)) {
                    ArrayList<Integer> triplet = new ArrayList<>(Arrays.asList(arr[i], arr[j], complement));
                    Collections.sort(triplet); // Sort for consistency

                    if (!result.contains(triplet)) {
                        result.add(triplet);
                    }
                }
                
                // Add current number to the set
                set.add(arr[j]);
            }
        }
        return result;
    }

    public static ArrayList<ArrayList<Integer>> TwoP(int[] arr){

        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> trip = new ArrayList<>();

        for(int i = 0; i < arr.length-2; i++){

            if(i>0 && arr[i]==arr[i-1]) {
                continue;
            }
            
            int j=i+1,k = arr.length-1;
            int sum = -arr[i];

            while(j<k){

                if(sum > arr[k]+arr[j]){
                    j++;
                } 
                
                else if(sum < arr[k]+arr[j]){
                    k--;
                }

                else{
                    
                    trip.add(new ArrayList<>(Arrays.asList(arr[i],arr[j],arr[k])));
                    k--;
                    j++;
                }
                while(j<k && arr[j]==arr[j+1])      j++;
                while(j<k && arr[k]==arr[k-1])      k--;

            }

        }
        return trip;
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            

            int[] arr = new int[N];
            
            
            for(int i = 0; i < N; i++){
                arr[i]=sc.nextInt();
            }
      
            
            
            System.out.println(TwoP(arr));
            //ystem.out.println(TwoP(arr));
        }
    }
}
