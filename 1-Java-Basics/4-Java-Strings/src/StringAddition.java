public class StringAddition {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("Sum: " + sum);
        String x = "10";
        String y = "20";
        String z = x + y;
        System.out.println("Concatenated Strings: " + z);
        String mixed = x + b;
        System.out.println("String + int = " + mixed);
    }
}