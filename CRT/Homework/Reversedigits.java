// https://www.geeksforgeeks.org/problems/reverse-digit0316/1
public class Reversedigits {
    public int reverseDigits(int n) {
        // Code here
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;  // Extract last digit
            reversed = reversed * 10 + digit; // Append digit
            n /= 10;  // Remove last digit
        }
        return reversed;
    }
}
