public class KadaneAlgorithm {

    public static class Algo{
        
        int BruteForce(int[] arr){

            int maxSum=Integer.MIN_VALUE;

            for(int i = 0; i < arr.length; i++ ){
                int curSum=0;

                for(int j =i; j < arr.length; j++){

                    curSum+=arr[j];
                    maxSum=Math.max(curSum,maxSum);
                }
            }

            return maxSum;
        }

        int KadaneAlgo(int[] arr){
            
            int curSum=0,maxSum=Integer.MIN_VALUE;

            for(int i = 0; i < arr.length; i++){

                curSum+=arr[i];
                maxSum=Math.max(curSum, maxSum);

                if(curSum<0){
                    curSum=0;
                }

            }

            return maxSum;
        }

    }
    public static void main(String[] args) {
        
        Algo a = new Algo();

        int[] arr = Template.input();

        int result1 = a.BruteForce(arr);
        int result2 = a.KadaneAlgo(arr);

        System.out.println("Max Sub Array Using Brute Force : " + result1);
        System.out.println("Max Sub Array Using Kadane Algorithm : " + result2);

    }
}
