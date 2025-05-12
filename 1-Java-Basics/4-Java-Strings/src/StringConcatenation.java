public class StringConcatenation {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(" ").concat(lastName));
    }
}