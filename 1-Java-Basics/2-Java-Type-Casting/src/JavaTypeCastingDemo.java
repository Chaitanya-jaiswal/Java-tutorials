// File: JavaTypeCastingDemo.java

public class JavaTypeCastingDemo {
    public static void main(String[] args) {
        // Widening Casting: int to double (automatic)
        int myInt = 10;
        double myDouble = myInt;

        System.out.println("Widening Casting:");
        System.out.println("Original int: " + myInt);
        System.out.println("Converted to double: " + myDouble);

        System.out.println();

        // Narrowing Casting: double to int (manual)
        double anotherDouble = 9.75;
        int anotherInt = (int) anotherDouble;

        System.out.println("Narrowing Casting:");
        System.out.println("Original double: " + anotherDouble);
        System.out.println("Converted to int: " + anotherInt);

        System.out.println();

        // Real-Life Use Case: Score percentage
        int maxScore = 500;
        int userScore = 423;
        float percentage = (float) userScore / maxScore * 100.0f;

        System.out.println("Real-Life Example:");
        System.out.println("User's Score: " + userScore);
        System.out.println("Maximum Score: " + maxScore);
        System.out.println("User's Percentage: " + percentage + "%");
    }
}
