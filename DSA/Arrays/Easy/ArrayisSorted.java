public class ArrayisSorted {

    public static class Solution{

        boolean check(int[] arr){

            int N = arr.length;

            for(int i = 1; i < N-1; i++){

                if(arr[i-1]>arr[i]){
                
                    return false;
                }
            }

            return true;
        }

    }

    public static void main(String[] args) {

        Solution  s = new Solution();

        System.out.println(s.check(TemplateA.input()));
    }
}
