import java.util.Scanner;

public class CountSpacesAndLines {
    public static void main(String[] args) {
        int spaces, lines;

        try (Scanner scanner = new Scanner(System.in)) {
            spaces = 0;
            lines = 0;
            System.out.println("Enter text (type 'END' on a new line to stop):");
            while (true) {
                String line = scanner.nextLine();
                if (line.equals("END")) { // Stop input when user types "END"
                    break;
                }
                lines++; // Count lines
                spaces += countSpaces(line); // Count spaces in the line
            }
            // Close scanner
        }

        // Display the results
        System.out.println("Number of spaces: " + spaces);
        System.out.println("Number of lines: " + lines);
    }

    // Method to count spaces in a line
    private static int countSpaces(String line) {
        int count = 0;
        for (char ch : line.toCharArray()) {
            if (ch == ' ') {
                count++;
            }
        }
        return count;
    }

    
}
