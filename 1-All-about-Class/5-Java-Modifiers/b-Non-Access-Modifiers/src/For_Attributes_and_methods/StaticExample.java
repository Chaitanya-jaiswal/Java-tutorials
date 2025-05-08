package For_Attributes_and_methods;

class MathUtility {
    static final double PI = 3.14;  // final: cannot change value, static: belongs to class

    static int sum(int a, int b) {
        return a + b;  // static method: can be called without creating an object
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2)); // Outputs: 3
        System.out.println(PI);        // Outputs: 3.14
    }
}

class OtherClass {
    public static void main(String[] args) {
        // Accessing static members from another class without creating an object
        System.out.println(MathUtility.PI);        // Outputs: 3.14
        System.out.println(MathUtility.sum(2, 3)); // Outputs: 5
    }
}
