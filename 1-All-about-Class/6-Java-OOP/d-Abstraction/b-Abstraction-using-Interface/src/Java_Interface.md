
# 📘 Java Interfaces - Project Notes

This project demonstrates how to use **Java Interfaces** including:
- ✅ Basic interface implementation
- ✅ Multiple interface implementation

---

## 🧱 Interface Definitions

```java
// Animal.java
public interface Animal {
    void animalSound();
    void sleep();
}
```

```java
// FirstInterface.java
public interface FirstInterface {
    void myMethod();
}
```

```java
// SecondInterface.java
public interface SecondInterface {
    void myOtherMethod();
}
```

---

## 🐖 Implementation: Single Interface

```java
// Pig.java
public class Pig implements Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }

    public void sleep() {
        System.out.println("Zzz...");
    }
}
```

---

## 🔁 Implementation: Multiple Interfaces

```java
// DemoClass.java
public class DemoClass implements FirstInterface, SecondInterface {
    public void myMethod() {
        System.out.println("Some text...");
    }

    public void myOtherMethod() {
        System.out.println("Some other text...");
    }
}
```

---

## 🚀 Main Execution Class

```java
// Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Interface with Single Implementation ===");
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();

        System.out.println("\n=== Interface with Multiple Implementation ===");
        DemoClass myDemo = new DemoClass();
        myDemo.myMethod();
        myDemo.myOtherMethod();
    }
}
```

---

## 🔑 Key Takeaways

- Interface methods are **public and abstract** by default.
- All interface fields are **public, static, and final** by default.
- Java uses `implements` to apply interfaces to classes.
- A class can implement **multiple interfaces**, overcoming Java’s single inheritance limitation.

---

📚 **Next Suggested Topic:** Java Enums or Abstract vs Interface comparison
