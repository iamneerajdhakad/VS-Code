
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static List< Integer > printDivisors(int n) {
    // Write your code here
    List<Integer> l = new ArrayList<>();

    for(int i = 1; i <= n; i++){
        
        if(n%i==0)  l.add(i);
    }

    return l;
}


  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int Number = sc.nextInt();
  
    System.out.println(printDivisors(Number));
  }
}