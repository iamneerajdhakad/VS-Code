public class RecursiveBubbleSortAlgorithm {
    
    public static class Algo{

        void Rsort(int[] arr,int N){

            if(N==0){ return;}

            for(int i = 1; i < N; i++){
                
                if(arr[i-1]>arr[i]){

                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                }

            }

            Rsort(arr,N-1);

        }

    }
    
    public static void main(String[] args) {

        Algo a = new Algo();

        int[] arr = Template.input();

        Template.display(arr," Array Before sort : ");

        a.Rsort(arr, arr.length);

        Template.display(arr, "Array After Sorting :");

    }
}
