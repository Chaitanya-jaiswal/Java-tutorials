// This program demonstrates basic Object-Oriented Programming (OOP) concepts
// and shows usage of all Java Access Modifiers: public, private, protected, and default.


// Define a Class: 'Dog'
// A class is a blueprint/template for creating objects.
class Dog { // default access: accessible within the same package

    // ------------------- Attributes (also called Fields or Instance Variables) -------------------
    // These represent the **state** (data) of the object.

    private String name;   // private: only accessible within the Dog class
    int age;               // default (package-private): accessible within the package
    protected String breed; // protected: accessible within package + by subclasses
    public String color;    // public: accessible from anywhere

    // ------------------- Constructor -------------------
    // A constructor initializes the object's state.
    public Dog(String name, int age, String breed, String color) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
    }

    // ------------------- Behavior / Methods -------------------

    public void bark() {
        // public method: accessible from anywhere
        System.out.println(name + " says: Woof!");
    }

    void wagTail() {
        // default (package-private) method: accessible within the same package
        System.out.println(name + " is wagging its tail.");
    }

    protected void sleep() {
        // protected method: accessible within package and by subclasses
        System.out.println(name + " is sleeping.");
    }

    private void secretTrick() {
        // private method: only accessible inside Dog class
        System.out.println(name + " performs a secret trick!");
    }

    // A method to demonstrate private method usage internally
    public void performSecretTrick() {
        secretTrick(); // calling the private method inside the class
    }
}


// The 'Main' class where program execution begins.
public class Main {
    public static void main(String[] args) {

        // ------------------- Creating an Object -------------------
        Dog dog_1 = new Dog("Giacomino, guardiano delle galassie e dell'iperspazio", 12, "German Shepherd", "Black and Tan");

        // ------------------- Calling Methods -------------------
        dog_1.bark();         // public method
        dog_1.wagTail();      // default method (allowed: same package)
        dog_1.sleep();        // protected method (allowed: same package)
        dog_1.performSecretTrick(); // public method calling private method internally

        // ------------------- Accessing Attributes -------------------
        // System.out.println(dog_1.name); // Error: name is private (uncommenting will cause error)
        System.out.println(dog_1.age);    // default access: allowed (same package)
        System.out.println(dog_1.breed);  // protected access: allowed (same package)
        System.out.println(dog_1.color);  // public access: allowed from anywhere
    }
}

/*
-----------------------------------
📚 OOP Concepts + Access Modifiers Demonstrated:

1. Class: 'Dog' class created. 'Main' class created.

2. Object: 'dog_1' is an instance of Dog class.

3. Encapsulation:
   - name: private (strictly hidden)
   - age: default (package-private, no keyword)
   - breed: protected (package + subclasses)
   - color: public (accessible from anywhere)

4. Constructor:
   - public constructor initializing all fields.

5. Methods:
   - public methods (bark, performSecretTrick)
   - default method (wagTail)
   - protected method (sleep)
   - private method (secretTrick)

6. Accessing fields and methods according to their access levels.

-----------------------------------
*/
