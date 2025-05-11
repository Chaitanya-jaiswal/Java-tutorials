
# 📘 Java Abstraction

## 💡 What is Abstraction?
Abstraction is the process of hiding the implementation details and showing only the functionality to the user.

Java supports abstraction using:
- ✅ **Abstract Classes**
- ✅ **Interfaces** (covered in the next chapter)

## 🔧 Abstract Classes and Methods

- 📌 An **abstract class** is a class that cannot be instantiated.
- 📌 An **abstract method** is a method without a body; it must be implemented in a subclass.

### 🧱 Syntax
```java
abstract class Animal {
    public abstract void animalSound();  // Abstract method
    public void sleep() {                // Regular method
        System.out.println("Zzz");
    }
}
```

### 🐾 Example
```java
abstract class Animal {
    public abstract void animalSound();
    public void sleep() {
        System.out.println("Zzz...");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal pig = new Pig();
        pig.animalSound();
        pig.sleep();

        Animal dog = new Dog();
        dog.animalSound();
        dog.sleep();
    }
}
```

## 🔑 Key Points
- ✅ Abstract classes **can have both abstract and regular methods**.
- ✅ Abstract methods **must** be implemented in non-abstract subclasses.
- 🚫 Abstract classes **cannot be instantiated** directly.

## 🎯 Why and When to Use Abstraction?
- 🔒 To achieve security by hiding internal implementation details.
- 📉 Helps in reducing code complexity and increases reusability.

## 📌 Note
Abstraction can also be achieved using **Interfaces**, which is a more flexible alternative to abstract classes.

---

📚 **Next Topic: Java Interfaces**
