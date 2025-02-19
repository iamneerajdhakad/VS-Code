/* Problem Statement: Given an array, and an element num the task is to find if num is present in the given array or not. If present print the index of the element or print -1. */
public class LinearSearch {

    public static int LSearch(int[] arr,int num){
        int N = arr.length;

        for(int i = 0; i < N; i++){
            if(arr[i]==num){
                return i;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        System.out.println(LSearch(Template.input(),Template.InputInt()));
    }

}