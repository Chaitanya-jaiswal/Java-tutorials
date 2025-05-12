// File: DataTypesDemo.java
// Package not added for simplicity if running standalone

public class DataTypesDemo {
    public static void main(String[] args) {

        // ----------- Primitive Data Types ------------
        // Integer Types
        byte byteValue = 127;          // 1 byte
        short shortValue = 32000;      // 2 bytes
        int intValue = 100000;         // 4 bytes
        long longValue = 10000000000L; // 8 bytes

        // Floating Point Types
        float floatValue = 5.75f;      // 4 bytes
        double doubleValue = 19.99;    // 8 bytes

        // Character Type
        char charValue = 'A';          // 2 bytes

        // Boolean Type
        boolean booleanValue = true;   // 1 bit

        // Print primitive types
        System.out.println("Primitive Data Types:");
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: " + charValue);
        System.out.println("boolean: " + booleanValue);

        System.out.println("\n-------------------------\n");

        // ----------- Non-Primitive Data Types ------------
        // String (class-based, reference type)
        String greeting = "Hello, Java!";

        // Array (reference type)
        int[] numbers = {1, 2, 3, 4, 5};

        // Object (User-defined class)
        Person person = new Person("Chaitanya", 20);

        // Print non-primitive types
        System.out.println("Non-Primitive Data Types:");
        System.out.println("String: " + greeting);
        System.out.print("Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Object: " + person);
    }
}

// A simple class for demonstration of Object (non-primitive type)
class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " (" + age + " years old)";
    }
}
