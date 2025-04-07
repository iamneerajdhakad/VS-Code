public class Palindrome {

    public static boolean isPalindrome(int n) {
        // Code here

        String s = ""+n;

        int l = s.length()-1;

        int temp =n;

        int Copy = 0;

        for(int i = l; i >= 0; i--){


            int digit = temp %10;

            Copy += digit*(int)Math.pow(10, i); 

            temp/=10;

        }

        return Copy==n;
    }

    public static void main(String[] args) {
        
        System.out.println(isPalindrome(555));

    }
    
}
