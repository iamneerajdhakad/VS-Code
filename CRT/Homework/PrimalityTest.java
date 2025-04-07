public class PrimalityTest {
    
    public static boolean Isprime1(long n){
        
        if(n<2) return false;

        if( n < 4) return true;

        if(n%2==0 || n%3 == 0 )  return false;
        

        for(int i = 5; i <= n/i ; i+=6){
            if(n%(i)==0 || n%(i+2)==0){
                return false;
            }
        }

        return true;
    } 

    static boolean isPrime(int n) {
        // code here

        if(n<=1)    return false;

        if(n==2)    return true;

        if(n%2==0)  return false;

        
        for(int i = 3; i <= Math.sqrt(n); i+=2){

            if(n%i==0)  return false;

        }

        return true;
    }

    public static void main(String[] args) {
        
        System.out.println(isPrime(6));

    }

    
}
