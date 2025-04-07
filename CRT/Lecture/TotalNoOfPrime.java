
import java.util.Scanner;

// https://www.naukri.com/code360/guided-paths/basics-of-java/content/815940/offering/13843919?goalRedirection=true&leftPanelTabValue=SOLUTION
// Total Prime
public class TotalNoOfPrime {

    public static int totalPrime(int s, int e) {
		int count = 0;
		for (int i = s; i <= e; i++) {
			if (isPrime(i)) {
				count++;
			}
		}
		return count;
	}
	
	private static boolean isPrime(int num) {
		if (num < 2) return false;
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) return false;
		}
		return true;
	}

    public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		System.out.println(totalPrime(s, e));
	}
    
}
