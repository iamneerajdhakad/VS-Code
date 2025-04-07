// Write a program to count the number of 1's in the binary representation of an integer.
// https://www.naukri.com/code360/guided-paths/basics-of-java/content/815940/offering/13843918?goalRedirection=true&leftPanelTabValue=PROBLEM&customSource=studio_nav
public class CountBits {

    public static int countSetBits(int n) {
		// Write your code here.

		int count = 0;
        while (n > 0) {
            n = n & (n - 1); // Removes the rightmost 1
            count++;
        }
        return count;
	}
    
}
