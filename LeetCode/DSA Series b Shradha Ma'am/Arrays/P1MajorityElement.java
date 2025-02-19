
import java.util.HashMap;
import java.util.Scanner;

/*  Problem link : https://leetcode.com/problems/majority-element/description/

Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

*/
public class P1MajorityElement {

    public static int majorityElement(int[] arr) {

        HashMap<Integer,Integer> m = new HashMap<>();

        int N = arr.length;

        for(int i = 0; i < N; i++){
            if(!m.containsKey(arr[i])){

                m.put(arr[i], 1);
            }
            else{

                int freq = m.get(arr[i]);
                m.put(arr[i], freq+1);

            }
        }

        for(var i : m.entrySet()){
            if(i.getValue()>N/2){
                return i.getKey();
            }
        }

        
        return -1;
    }

    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in);){

        int N = sc.nextInt();

        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(majorityElement(arr));

    }
    }
}
