

public class ArmstringNumber {

    public static void allAramStingNumber(int st, int end){

        int count = 0;

        for(int i = st; i < end; i++){
            boolean check = armstrongNumber(i);

            if(check)   count++;
        }

        System.out.println("Total Number of Arstong Number Present in Range "+st+" to " +end+" are: "+count);

    }




    
    public static boolean armstrongNumber(int n) {

        if(n<0) return false;

        String s = ""+n;
        
        int temp = n;
        
        int armstrong = 0;
        
        while(n>0){
            
            int digit = n % 10;
            
            armstrong = armstrong + (int)Math.pow(digit,s.length());
            
            n /= 10;
            
        }

        if(armstrong==temp){

            System.out.println(armstrong);

        }
        
        return armstrong==temp;
        
    }

    public static void main(String[] args) {
        
        allAramStingNumber(0, 10000);

    }

}
