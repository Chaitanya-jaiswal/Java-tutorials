
# Non-Access Modifiers in Java

Java provides several **non-access modifiers** to provide functionalities such as optimization, concurrency control, and immutability. Here's a breakdown by usage context.

---

## 📌 For Classes

| Modifier | Description |
|----------|-------------|
| `final`   | The class cannot be inherited. |
| `abstract` | The class cannot be instantiated. Must be extended and its abstract methods must be implemented. |

### ✅ Examples:
```java
final class Vehicle {
    // This class cannot be inherited
}

abstract class Animal {
    abstract void sound();
}
```

---

## 📌 For Attributes and Methods

| Modifier     | Description |
|--------------|-------------|
| `final`      | Prevents method overriding or value modification. |
| `static`     | Belongs to the class, not to any object. Can be accessed without creating an instance. |
| `abstract`   | Defines method signature only. Must be implemented in subclass. |
| `transient`  | Prevents variable from being serialized. |
| `synchronized` | Ensures only one thread can access a method at a time. |
| `volatile`   | Ensures changes to variables are visible to all threads immediately. |

---

## 💡 Code Examples

### 🔹 `final` Method
```java
class Base {
    final void display() {
        System.out.println("This method can't be overridden.");
    }
}
```

### 🔹 `static` and `final` Attribute
```java
class MathUtility {
    static final double PI = 3.14;

    static int sum(int a, int b) {
        return a + b;
    }
}
```

### 🔹 `abstract` Method and Class
```java
abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound() {
        System.out.println("Woof");
    }
}
```

### 🔹 `transient` Attribute
```java
class UserSession implements Serializable {
    transient String sessionToken;
}
```

### 🔹 `synchronized` Method
```java
class Counter {
    private int count = 0;

    synchronized void increment() {
        count++;
    }
}
```

### 🔹 `volatile` Variable
```java
class SharedFlag {
    volatile boolean ready = false;
}
```

---

## 🧠 Summary
- Use **`final`** to prevent inheritance or overriding.
- Use **`abstract`** to enforce implementation in child classes.
- Use **`static`** for class-level data and methods.
- Use **`transient`** and **`volatile`** for memory control.
- Use **`synchronized`** for thread-safe methods.

---

> 📁 This documentation accompanies the example files inside the `Non-Access-Modifiers` folder.
