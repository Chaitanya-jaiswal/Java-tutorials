public class Main {
    public static void main(String[] args) {

        // 1. Arithmetic Operators
        int a = 10, b = 3;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus

        // 2. Assignment Operators
        System.out.println("\nAssignment Operators:");
        int x = 5;
        x += 3; // x = x + 3
        System.out.println("x += 3 => " + x);
        x *= 2; // x = x * 2
        System.out.println("x *= 2 => " + x);

        // 3. Relational (Comparison) Operators
        System.out.println("\nRelational / Comparison Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // 4. Logical Operators
        System.out.println("\nLogical Operators:");
        boolean cond1 = true, cond2 = false;
        System.out.println("cond1 && cond2: " + (cond1 && cond2));
        System.out.println("cond1 || cond2: " + (cond1 || cond2));
        System.out.println("!cond1: " + (!cond1));

        // 5. Unary Operators
        System.out.println("\nUnary Operators:");
        int c = 5;
        System.out.println("++c = " + (++c)); //6
        System.out.println("c++ = " + (c++)); //6 but c = 7
        System.out.println("c-- = " + (c--)); //7 but c = 6
        System.out.println("--c = " + (--c)); //5
        System.out.println("c = " + c);       //5
        System.out.println("-c = " + (-c));   //-5

        // 6. Bitwise Operators
        System.out.println("\nBitwise Operators:");
        int m = 5, n = 3;
        System.out.println("m & n = " + (m & n));  // AND
        System.out.println("m | n = " + (m | n));  // OR
        System.out.println("m ^ n = " + (m ^ n));  // XOR
        System.out.println("~m = " + (~m));        // NOT
        System.out.println("m << 1 = " + (m << 1)); // Left shift
        System.out.println("m >> 1 = " + (m >> 1)); // Right shift

        // 7. Ternary Operator
        System.out.println("\nTernary Operator:");
        int age = 20;
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Result: " + result);

        // 8. instanceof Operator
        System.out.println("\ninstanceof Operator:");
        String text = "Hello";
        System.out.println("text instanceof String: " + (text instanceof String));
    }
}
