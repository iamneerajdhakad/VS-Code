public class StringBuilderEg {
    public static void main(String[] args) {
        
        StringBuilder str = new StringBuilder("hello");

        str.append(" world");

        str.append(10);
        str.append(true);


        // System.out.println(str);
        str.setCharAt(0, 'd');
        System.out.println(str);

        str.insert(2, 'y');
        System.out.println(str);

        str.deleteCharAt(2);
        System.out.println(str);

        str.delete(4, 17);

        str.reverse();

        System.out.println(str);



    }
}
