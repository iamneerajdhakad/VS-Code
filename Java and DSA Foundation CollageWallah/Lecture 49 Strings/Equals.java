public class Equals {
    @SuppressWarnings("StringEquality")
    public static void main(String[] args) {
        String s1 = "hello";
        @SuppressWarnings("unused")
        String s2 = "hello";
        @SuppressWarnings("RedundantStringConstructorCall")
        String s3 = new String("hello");
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
    }
}
