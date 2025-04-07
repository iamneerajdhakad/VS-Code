
import java.util.List;

public class SherlockandArray {

    public static String balancedSums(List<Integer> arr) {
        // Write your code here
        
        int total = 0;
        
        for(int i : arr){
            total +=i;
        }
        
        int left =0;
        
        for(int i = 0; i < arr.size(); i++){
            
            int right = total - left -arr.get(i);
            
            if(right==left){
                return "YES";
            } 
            
            left+=arr.get(i);
            
        }
        
        return "NO";
    
        }

        public static void main(String[] args) {


            
    }
}