
class Animal {
    public void animalSound() {
        System.out.println("Animal makes a generic sound");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("Pig says: wee wee");
    }

    public void eat() {
        System.out.println("Pig eats slop");
    }
}

public class PolymorphismCases {
    public static void main(String[] args) {

        // ✅ 1. Parent class reference to Subclass object (Upcasting)
        Animal animalRef = new Pig();  // This is valid
        animalRef.animalSound();       // Calls Pig's version (overridden)
        // animalRef.eat();            // ❌ Not allowed: eat() is not in Animal

        // ✅ Downcasting to access subclass methods
        if (animalRef instanceof Pig) {
            Pig pigRef = (Pig) animalRef;  // Safe downcasting
            pigRef.eat();// Now we can access Pig's method
            pigRef.animalSound();
        }

        // ❌ 2. Subclass reference to Parent object (Invalid)
        // Pig pig = new Animal();        // Compile-time error

        // ❌ 3. Unsafe downcasting
        Animal justAnimal = new Animal();
        if (justAnimal instanceof Pig) {
            Pig wrongPig = (Pig) justAnimal;  // This won't execute due to instanceof
            wrongPig.animalSound();
        } else {
            System.out.println("Downcasting failed: justAnimal is not a Pig");
        }
    }
}
