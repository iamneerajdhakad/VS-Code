import java.util.Scanner;

public class CountVowels {
    
    public static void main(String[] args) {
        // Input from user
        try (Scanner scanner = new Scanner(System.in)) {
            // Input from user
            System.out.println("Enter a line of text:");
            String line = scanner.nextLine();
            // Count vowels
            int vowelCount = countVowels(line);
            // Display the result
            System.out.println("Number of vowels: " + vowelCount);
            // Close scanner
        }
    }

    // Method to count vowels in a line
    private static int countVowels(String line) {
        int count = 0;
        String vowels = "AEIOUaeiou";

        for (char ch : line.toCharArray()) {
            if (vowels.indexOf(ch) != -1) { // Check if character is a vowel
                count++;
            }
        }
        return count;
    }
}
