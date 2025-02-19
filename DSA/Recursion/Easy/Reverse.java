public class Reverse {

    public static class solution{

        void reverseArray(int[] arr,int n){

            int p1=0,p2=n-1;

            while(p1<p2){

                int temp=arr[p1];
                arr[p1]=arr[p2];
                arr[p2]=temp;
                p1++;
                p2--;

            }

            printArray(arr, n);

        }

        void printArray(int arr[], int n) {
            System.out.print("Reversed array is:- ");
            for (int i = 0; i < n; i++) {
               System.out.print(arr[i] + " ");
            }
            System.out.println();
         }
    }
    public static void main(String[] args) {

        solution s = new solution();

        int n = 5;
        int arr[] = { 5, 4, 3, 2, 1};
        s.reverseArray(arr, n);
    }
}
