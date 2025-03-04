public class SmallestLetter {

    public static char nextGreatestLetter(char[] ch,char target){

        int st = 0, end = ch.length-1;

        while(st<=end){

            int mid = st + (end-st)/2;

            if(target < ch[mid])    end=mid-1;

            else st = mid+1;
        }

        return ch[st % ch.length];
    }

    public static void main(String[] args) {
        
        char[] ch = {'c', 'f','j'};
        char target = 'a';



    }
}