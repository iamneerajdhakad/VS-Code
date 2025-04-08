import java.util.ArrayList;

public class ReverseArrayList {

    
    public static ArrayList<Integer> reverse(ArrayList<Integer> arr){

        int n = arr.size()-1,i=0;

        while(i<n){

            int temp = arr.get(i);
            arr.set(i,arr.get(n));
            arr.set(n,temp);
            i++;
        }

        return arr;
    } 

    public static void main(String[] args) {
        
    }
    
}