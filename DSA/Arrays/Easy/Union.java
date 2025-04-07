/*

Problem Statement: Given two sorted arrays, arr1, and arr2 of size n and m. Find the union of two sorted arrays.

The union of two arrays can be defined as the common and distinct elements in the two arrays.NOTE: Elements in the union should be in ascending order.

 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Union {

    public static List<Integer> Solution(int[] arr1, int[] arr2){
        
        TreeSet<Integer> s = new TreeSet<>();
        ArrayList<Integer> Union = new ArrayList<>();

        int n = arr1.length;
        int m = arr2.length;

        for(int i = 0; i < n ; i++){
            s.add(arr1[i]);
            
        }

        for(int i = 0; i < m ; i++){
            s.add(arr2[i]);
            
        }

        System.out.println(s);

        for(var i : s){
            Union.add(i);
        }

        

        return Union;
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();

        int[] arr1 = new int[m];

        for(int i = 0; i < m; i++){

        arr1[i]= sc.nextInt();

        }

        int n = sc.nextInt();

        int[] arr2 = new int[n];

        for(int i = 0; i < n; i++){

        arr2[i] = sc.nextInt();
        
        }

        Solution(arr1,arr2);

        sc.close();
    }
}