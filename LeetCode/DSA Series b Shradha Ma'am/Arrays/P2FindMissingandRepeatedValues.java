
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class FindMissingandRepeatedValues {

    public static int[] findMissingAndRepeatedValues(int[][] arr) {

        HashMap<Integer,Integer> m = new HashMap<>();

        int k = 0;
        int count=1;

        for(int i = 0; i < arr.length; i++){
            for(int j =0; j < arr[i].length; j++){

                if(!m.containsKey(arr[i][j])){
                    m.put(arr[i][j],i+j);
                }
                else{
                    k = arr[i][j];
                }

            }
        }

        for(@SuppressWarnings("unused") var i : m.entrySet()){

            if(!m.containsKey(count)){
               
                break;
            }

            count++;
        }


        return new int[]{k,count};
        
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][N];

        for (int[] arr1 : arr) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[j] = sc.nextInt();
            }
        }

        System.out.println(Arrays.toString(findMissingAndRepeatedValues(arr)));

        sc.close();
    }
}
