# Java Polymorphism (Extended Concepts)

## What is Polymorphism?
Polymorphism means "many forms". It allows Java objects to be accessed in multiple forms, typically when a parent class reference points to a child class object.

---

## How to Achieve Polymorphism in Java

Java achieves polymorphism in two main ways:

1. **Method Overriding (Runtime Polymorphism)**
    - A subclass provides a specific implementation of a method already defined in its superclass.
    - Method call is resolved at runtime based on the object's actual type.
   ```java
   class Animal {
       public void sound() {
           System.out.println("Generic animal sound");
       }
   }

   class Dog extends Animal {
       public void sound() {
           System.out.println("Bark");
       }
   }
   ```

2. **Method Overloading (Compile-Time Polymorphism)**
    - Multiple methods in the same class share the same name but differ in parameter list (type, number, or order).
    - Method call is resolved at compile time.
   ```java
   class MathUtil {
       int add(int a, int b) { return a + b; }
       double add(double a, double b) { return a + b; }
   }
   ```

---

## 1. Parent Class Reference → Subclass Object (Upcasting)

This is **allowed** and forms the base of **runtime polymorphism**.

```java
Animal animalRef = new Pig();  // Upcasting
animalRef.animalSound();       // Calls overridden method in Pig
```

---

## 2. Subclass Reference → Parent Object ❌ (Not Allowed)

This will result in a **compile-time error**.

```java
Pig pigRef = new Animal();  // ❌ Invalid
```

---

## 3. Downcasting

Used to access subclass-specific behavior from a superclass reference — **must be done carefully**.

### ✅ Safe Downcasting (with instanceof)
```java
Animal animalRef = new Pig();

if (animalRef instanceof Pig) {
Pig pigRef = (Pig) animalRef;
    pigRef.eat();  // Accessing subclass-specific method
}
```

### ❌ Unsafe Downcasting (causes Runtime Error)
```java
Animal justAnimal = new Animal();
Pig pigRef = (Pig) justAnimal;  // ❌ ClassCastException
```

Use `instanceof` to check before downcasting.

---

## Example Code
```java
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

        // Upcasting
        Animal animalRef = new Pig();
        animalRef.animalSound();

        // Downcasting (safe)
        if (animalRef instanceof Pig) {
            Pig pigRef = (Pig) animalRef;
            pigRef.eat();
        }

        // Invalid downcasting (guarded with instanceof)
        Animal justAnimal = new Animal();
        if (justAnimal instanceof Pig) {
            Pig wrongPig = (Pig) justAnimal;
            wrongPig.animalSound();
        } else {
            System.out.println("Downcasting failed: justAnimal is not a Pig");
        }
    }
}
```

---

## Output
```
Pig says: wee wee
Pig eats slop
Downcasting failed: justAnimal is not a Pig
```

---

## Summary

| Operation                         | Allowed? | Notes |
|----------------------------------|----------|-------|
| Parent ref = new Subclass();     | ✅       | Enables polymorphism |
| Subclass ref = new Parent();     | ❌       | Compile-time error |
| Downcasting with instanceof      | ✅       | Safe |
| Downcasting without instanceof   | ❌       | Runtime error possible |