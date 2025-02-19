import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DigitalClockCountdowntimer {
    
    public static Scanner scanner = new Scanner(System.in); // Moved to static field

    public static void main(String[] args) {
        while (true) {
            System.out.print("Choose an option (1:Digital Clock, 2:Countdown Timer): ");
            String choice = scanner.nextLine().trim();
            System.out.println(choice);
            userChoice(choice);
        }
    }

    @SuppressWarnings("ConvertToStringSwitch")
    public static void userChoice(String choice) {
        
        if(choice.equals("1")){    digitalClock();}

        else if(choice.equals("2")){
            System.out.print("Enter the number of seconds to countdown: ");
            int s = scanner.nextInt();
            countdownTimer(s);
        }

        else{
            System.out.print("Invalid choice!");
        }
    }

    @SuppressWarnings("CallToPrintStackTrace")
    public static void digitalClock() {
        System.out.println("Digital clock is displayed.\n");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");

        while (true) {
            LocalTime currentTime = LocalTime.now(); // Update time
            String formattedTime = currentTime.format(formatter);

            System.out.print("\rCurrent Time: " + formattedTime); // Overwrites previous output

            try {
                Thread.sleep(1000); // Wait for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void countdownTimer(int seconds) {
        System.out.println("Countdown Timer started!");

        while(seconds>0){

            System.out.print("\rTime remaining: "+seconds+ " seconds ");
            
             try {
                // Pause for 1 second
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }
            seconds--;
        }
        System.out.println("\nTime's up!");
    }

}
