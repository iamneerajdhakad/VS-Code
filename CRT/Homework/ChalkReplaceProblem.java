public class ChalkReplaceProblem {
    public int chalkReplacer(int[] chalk, int k) {

        long sum =0;

        for(int i : chalk){
            sum+=i;
        }

        k = (int)((long)k % sum);


        for (int i = 0; i < chalk.length; i++) {
            if (k < chalk[i]) {
                return i;
            }
            k -= chalk[i];
        }

        return -1;
        
    }
}
