
/*  Abstract class (Partial Abstraction)  */


abstract class Animal {     // abstract class (to create abstract methods in a class, it's mandatory that the class
                            // should be abstract as well)

    abstract void sound();  // abstract method (abstract methods cannot be implemented)

    void eat() {  // concrete method
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {  // concrete class (Dog) extending abstract class (Animal).
                            // Therefore, Mandatory: must implement/ override abstract methods
                            // that is in the abstract class (Animal) .
    @Override
    void sound() { //
        System.out.println("Dog is barking");
    }
}


public class Main {
    public static void main(String[] args) {
        Dog Capone= new Dog();
        Capone.eat();
        Capone.sound();

        //Animal Cat = new Animal(); //'Animal' is abstract; cannot be instantiated


    }
}