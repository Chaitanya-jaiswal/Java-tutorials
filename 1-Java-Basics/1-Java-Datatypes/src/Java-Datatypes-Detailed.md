
# Java Data Types

In Java, **data types** specify the size and type of values that can be stored in variables. They are divided into two major categories:

---

## 🔹 1. Primitive Data Types

Java supports 8 built-in primitive types:

| Type     | Size     | Description                                     | Example               |
|----------|----------|-------------------------------------------------|------------------------|
| `byte`   | 1 byte   | Whole numbers from -128 to 127                  | `byte b = 127;`        |
| `short`  | 2 bytes  | Whole numbers from -32,768 to 32,767            | `short s = 32000;`     |
| `int`    | 4 bytes  | Default integer type                            | `int i = 100000;`      |
| `long`   | 8 bytes  | Whole numbers, use `L` suffix                   | `long l = 100000000L;` |
| `float`  | 4 bytes  | Decimal with ~6-7 digits precision, use `f`     | `float f = 5.75f;`     |
| `double` | 8 bytes  | Decimal with ~15 digits precision               | `double d = 19.99;`    |
| `char`   | 2 bytes  | Single character or Unicode                     | `char c = 'A';`        |
| `boolean`| 1 bit    | Logical values: true or false                   | `boolean b = true;`    |

### ✅ Important Notes:
- `int` is the default for integers, `double` is the default for decimals.
- Use `L` for long literals and `f` for float literals.
- `boolean` does not accept 0/1 like in C/C++; must be `true` or `false`.
- `char` stores Unicode, e.g. `'\u0041'` is `'A'`.

---

## 🔹 2. Non-Primitive (Reference) Data Types

These are types based on objects and classes, including:

### ➤ String
```java
String greeting = "Hello, Java!";
```
- Stores sequences of characters.
- Immutable and part of `java.lang`.

### ➤ Arrays
```java
int[] numbers = {1, 2, 3};
```
- Stores multiple values of the same type.
- Fixed in length.

### ➤ Classes and Objects
```java
class Person {
    String name;
    int age;
}
```
- A blueprint for creating objects.
- Objects are instances of classes.

### ➤ Other reference types
- Wrapper classes: `Integer`, `Double`, `Character`, etc.
- Interfaces, Enums, Collections (like `List`, `Map`, `Set`).

---

## 🔸 Differences Between Primitive and Non-Primitive

| Aspect            | Primitive Types                  | Non-Primitive Types                |
|------------------|----------------------------------|------------------------------------|
| Memory            | Stored in stack                  | Stored in heap                     |
| Null allowed      | No                               | Yes                                |
| Methods available | No                               | Yes                                |
| Size fixed        | Yes                              | No                                 |
| Examples          | `int`, `float`, `boolean`, etc.  | `String`, `Array`, `Object`, etc.  |

---

## 🔍 Other Key Points

- Java is **strongly typed**: every variable must be declared with a type.
- Default values (if not initialized): `int = 0`, `boolean = false`, `char = '\u0000'`, object references = `null`.
- Java provides **wrapper classes** (`Integer`, `Float`, etc.) for converting primitives to objects — useful in collections and generics.
- Use `var` in Java 10+ for type inference, but type still resolved at compile time.

---

## 💡 Summary

| Category          | Examples                            | Notes                             |
|------------------|-------------------------------------|-----------------------------------|
| Primitive         | `int`, `char`, `boolean`, etc.      | Fast, memory-efficient            |
| Non-Primitive     | `String`, `Array`, `Class`          | Flexible, object-based operations |

---

## 🧪 Demo Code Reference

Refer to the included `DataTypesDemo.java` file to see examples of both primitive and non-primitive types in action.
