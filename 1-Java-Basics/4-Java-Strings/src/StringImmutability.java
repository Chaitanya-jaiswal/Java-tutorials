public class StringImmutability {
    public static void main(String[] args) {
        String str = "Hello";
        str.concat(" World");
        System.out.println(str);
        str = str.concat(" World");
        System.out.println(str);
    }
}