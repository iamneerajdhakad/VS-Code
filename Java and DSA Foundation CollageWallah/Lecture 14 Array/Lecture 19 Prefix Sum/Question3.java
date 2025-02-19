/* Check if we can partition the array into two subarrays with equql sum. More formally, 
check that the prefix sum of a part of the array is equal to the suffix sum of rest of the array 
*/
public class Question3 {
    
    public static boolean Solution(int[] arr){

        int TotalSum = Template.findArraySum(arr);
        int prefixSum =0;

        for(int i = 0; i < arr.length; i++){

            prefixSum+=arr[i];

            int suffixSum = TotalSum - prefixSum;

            if(suffixSum == prefixSum){
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int[] arr = Template.input();

        System.out.println(Solution(arr));
    }
}
