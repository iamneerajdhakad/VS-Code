public class PairSum {

    public static class Algo{
        
        int[] BruteForce(int[] arr,int target){

            for(int i = 0; i < arr.length; i++){

                for(int j=i+1;j<arr.length;j++){

                    if(arr[i]+arr[j]==target){

                        return new int[]{i,j};

                    }
                }
            }
            
            return new int[]{0};
        }

        int[] OptimalAlgo(int[] arr , int target){

            int i=0,j=arr.length-1;

            while(i<j){

                int ps=arr[i]+arr[j];

                if(ps>target){

                    j--;
                }

                else if(ps<target){

                    i++;
                }

                else{

                    return new int[]{i,j};
                }


            }
            return new int[]{0};
        }

    }

    public static void main(String[] args) {

        // Algo a = new Algo();

        // System.out.println("Using Brute Force Approach");
        // int[] arr1 = a.BruteForce(TemplateA.input(), 9);
        // System.out.println("Using Optimal Approach");
        // int[] arr2 = a.OptimalAlgo(TemplateA.input(), 9);
        // System.out.println(arr1[0]+","+arr1[1]);
        
        // System.out.println(arr2[0]+","+arr2[1]);
    }
}
