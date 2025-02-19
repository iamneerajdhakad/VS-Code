
import java.util.Scanner;

public class StringIntChar {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Scanner sc = new Scanner(System.in);
        String str = "abc";
        //str += "def";
        str += 'r';
        str +=10;
        System.out.println(str);

        System.out.println("ABC"+10+20);//ABC1020       Left to right opration are performed
        System.out.println(10+20+"ABC");//30ABC
    }
}
