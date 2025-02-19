/*

Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 
*/

import java.util.*;

public class P4SingleNumber {

    public static int singleNumber(int[] arr) {
        HashMap<Integer,Integer> m = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            
            if(!m.containsKey(arr[i])){
                m.put(arr[i], 1);
            }
            else{
                int freq = m.get(arr[i]);
                m.put(arr[i], freq+1);
            }
        }

        for(var i : m.entrySet()){

            if(1==i.getValue()){
                
                return i.getKey();
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in);){

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            
            arr[i] = sc.nextInt();
        }
        System.out.println(singleNumber(arr));

        sc.close();
    }
    }
    
}
