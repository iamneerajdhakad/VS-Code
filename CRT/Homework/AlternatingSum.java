public class AlternatingSum {

    public static int alternateDigitSum(int n) {

        String s = ""+n;

        int l = s.length();
        int odd = 0;
        int even = 0;

        for(int i = 0; i < l; i++){

            Character ch = s.charAt(i);

            int digit = ch -'0';

            if(i%2==0)  even += digit;
            else odd += digit;

            System.out.println("odd:"+ odd+"even"+even);
        }


        return even-odd;
        
    }

    public static void main(String[] args) {

        System.out.println(alternateDigitSum(521));
        
    }
}
