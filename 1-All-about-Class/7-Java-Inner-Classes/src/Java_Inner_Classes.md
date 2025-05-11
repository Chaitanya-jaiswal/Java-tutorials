# Java Inner Classes

Java supports **inner classes**, which are classes defined within another class. They help group logically related classes and increase encapsulation.

---

## 🧱 Types of Inner Classes

### 1. **Regular Inner Class**
- A non-static class defined within another class.
- Requires an instance of the outer class to instantiate.

```java
class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 5;
    }
}
```

### Access Example:

```java
OuterClass outer = new OuterClass();
OuterClass.InnerClass inner = outer.new InnerClass();
```

---

### 2. **Private Inner Class**
- An inner class can be made private to restrict access from outside.
- Cannot be accessed from outside directly.

```java
class OuterClass {
    private class InnerClass {
        int y = 5;
    }
}
```

### ❗Note:
Trying to access a private inner class from outside causes a **compile-time error**.

---

### 3. **Static Inner Class**
- Can be accessed **without an object of outer class**.
- Cannot access non-static members of the outer class.

```java
class OuterClass {
    static class InnerClass {
        int y = 5;
    }
}
```

### Access Example:
```java
OuterClass.InnerClass inner = new OuterClass.InnerClass();
```

---

### 4. **Access Outer Class Members from Inner Class**

Inner classes (non-static) can access members of their outer class directly.

```java
class OuterClass {
    int x = 10;

    class InnerClass {
        public int getOuterValue() {
            return x;
        }
    }
}
```

---

## ✅ Benefits of Inner Classes

- Group logically related code.
- Encapsulation.
- Easier access to outer class members.
- Useful for event-handling, GUI components, etc.

---

## 💡 Real-World Usage

- Java GUI frameworks like Swing and JavaFX use inner classes extensively.
- Useful in scenarios like **anonymous listeners**, **encapsulation of helper classes**, etc.

---

## 📂 Demo Project Structure

```
InnerClassDemo.java
```

This includes:
- Regular Inner Class
- Private Inner Class (with access example)
- Static Inner Class
- Accessing outer members from inner class

---