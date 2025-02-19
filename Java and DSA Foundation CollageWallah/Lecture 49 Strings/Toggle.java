
import java.util.Scanner;

public class Toggle {

    public static StringBuilder ToggleBuilder(StringBuilder str){

        
        System.out.println(str);

        for(int i = 0; i <= str.length()-1; i++){

            boolean flag = true;
            char ch = str.charAt(i);
            if(ch == ' ')   continue;
            int asci = (int) ch;
            if(asci >= 97)  flag = false;
        
        if(asci >= 65 && asci <= 123){

                if(flag == true){
                    asci += 32;
                    char dh = (char)asci;
                    str.setCharAt(i, dh);
                }

                else{
                    asci -= 32;
                    char dh = (char)asci;
                    str.setCharAt(i, dh);
                }
            }
        }


        return str;
    }

    public static String ToggleString(String str){

        for(int i = 0; i <= str.length()-1; i++){

            boolean flag = true;
            char ch = str.charAt(i);
            if(ch == ' ')   continue;
            int asci = (int) ch;
            if(asci >= 97)  flag = false;
        
        if(asci >= 65 && asci <= 123){

                if(flag == true){
                    asci += 32;
                    char dh = (char)asci;
                    str = str.substring(0,i)+dh+str.substring(i+1);
                }

                else{
                    asci -= 32;
                    char dh = (char)asci;
                    str = str.substring(0,i)+dh+str.substring(i+1);
                }
            }
        }



        return str;
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StringBuilder str = new StringBuilder(sc.nextLine());
        String s = sc.nextLine();

    
        System.out.println(ToggleBuilder(str));
        System.out.println(ToggleString(s));
    }
}
