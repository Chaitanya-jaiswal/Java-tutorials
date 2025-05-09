# 🛡️ Encapsulation in Java

Encapsulation is one of the core concepts of Object-Oriented Programming (OOP). It is the practice of **hiding internal fields** of a class from outside access and providing **controlled access** through public methods.

---

## ✅ Why Use Encapsulation?

- Protects data from unauthorized access.
- Improves code readability and maintainability.
- Allows controlled data modification.
- Supports the principle of "data hiding".

---

## 🛠️ How to Achieve Encapsulation

1. Declare variables as `private`.
2. Provide public `get` and `set` methods.

---

## 📘 Example

### `Student.java`

```java
public class Student {
  private String name;
  private int age;

  // Getter for name
  public String getName() {
    return name;
  }

  // Setter for name
  public void setName(String name) {
    this.name = name;
  }

  // Getter for age
  public int getAge() {
    return age;
  }

  // Setter for age
  public void setAge(int age) {
    this.age = age;
  }
}
```

---

### `Main.java`

```java
public class Main {
  public static void main(String[] args) {
    Student student = new Student();

    student.setName("Chaitanya");
    student.setAge(20);

    System.out.println("Student Name: " + student.getName());
    System.out.println("Student Age: " + student.getAge());
  }
}
```

---

## 💡 Output

```
Student Name: Chaitanya
Student Age: 20
```

---

## 📝 Summary

| Feature             | Description                              |
|---------------------|------------------------------------------|
| `private` variables | Cannot be accessed directly              |
| Getter method       | Used to retrieve the value of a variable |
| Setter method       | Used to modify the value of a variable   |

Encapsulation is all about **control**—you decide what can be read or written, and how.

---
