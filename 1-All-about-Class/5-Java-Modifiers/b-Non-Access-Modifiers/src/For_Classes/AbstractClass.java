package For_Classes;

abstract class Animal {
    // ABSTRACT METHOD: Must be implemented by subclasses
    abstract void sound();

}

// Subclass implementing abstract method
class Dog extends Animal {
    void sound() {
        System.out.println("Woof");
    }
}

class Main {
    public static void main(String[] args) {
        // Creating Dog object directly
        Dog Tom = new Dog();
        Tom.sound(); // Outputs: Woof

        // Polymorphic behavior: Animal reference pointing to Dog object
        Animal Tom2 = new Dog();
        Tom2.sound(); // Outputs: Woof

        // Anonymous class implementing abstract method
        Animal Tom3 = new Animal() {
            @Override
            void sound() {
                System.out.println("Tom3 Woof");
            }
        };
        Tom3.sound(); // Outputs: Tom3 Woof

        // Animal is abstract; cannot instantiate directly
        // Animal animal = new Animal(); // Compile-time error
    }
}
