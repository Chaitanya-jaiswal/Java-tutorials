# Java Inheritance

Inheritance in Java is a mechanism where one class acquires the properties (fields) and behaviors (methods) of another class.

## 🧬 Terminologies

- **Superclass (Parent class)**: The class being inherited from.
- **Subclass (Child class)**: The class that inherits from another class using the `extends` keyword.

---

## 🔑 Syntax

```java
class Superclass {
    // fields and methods
}

class Subclass extends Superclass {
    // more fields and methods
}
```

---

## 📌 Example

```java
class Vehicle {
    protected String brand = "Ford"; // Superclass attribute

    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle {
    private String modelName = "Mustang";

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + modelName);
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk(); // Inherited method
        myCar.displayDetails();
    }
}
```

---

## 🔒 Access Modifiers in Inheritance

- `private`: Not accessible in subclass.
- `protected`: Accessible in subclass and same package.
- `public`: Accessible from anywhere.

---

## 🛠️ Why Use Inheritance?

- **Code Reusability**: Reuse existing code instead of rewriting.
- **Extensibility**: Enhance and extend the behavior of inherited methods.
- **Maintainability**: Easier to maintain and update code in superclass.

---

## 🚫 The `final` Keyword

- A class declared as `final` **cannot be inherited**.

```java
final class Vehicle {
    ...
}

// This will cause an error
class Car extends Vehicle {
    ...
}
```

---

## 🌐 Real-world Analogy

Imagine a `Vehicle` class with general features. `Car`, `Bike`, and `Bus` can all extend `Vehicle` to reuse common features like `brand`, `honk()`, etc.

---

## 📎 Summary

- Use `extends` to inherit.
- Use `protected` for accessible attributes.
- Use `final` to prevent inheritance.
- Promotes DRY (Don't Repeat Yourself) principle.---

## 🔐 Final Keyword Example in Code

The `final` keyword prevents a class from being extended:

```java
final class Vehicle {
    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

// This will produce a compile-time error
class Car extends Vehicle {
    // Error: Cannot inherit from final 'Vehicle'
}
```

In real-world use, marking a class `final` ensures its implementation remains untouched and secure from modification via inheritance.