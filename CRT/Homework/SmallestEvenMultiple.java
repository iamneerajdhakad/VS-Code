// https://leetcode.com/problems/smallest-even-multiple/description/
public class SmallestEvenMultiple {
    public int smallestEvenMultiple(int n) {
        if(n%2 == 0) {
            return n;
        }

        else return n*2;
    }
}
