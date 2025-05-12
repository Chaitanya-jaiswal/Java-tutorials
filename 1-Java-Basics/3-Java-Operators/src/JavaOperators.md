
# Java Operators

Java operators are special symbols or keywords used to perform operations on variables and values. Operators are categorized based on the operation they perform.

---

## 1. Arithmetic Operators

Used to perform basic mathematical operations.

| Operator | Description      | Example     |
|----------|------------------|-------------|
| `+`      | Addition          | `a + b`     |
| `-`      | Subtraction       | `a - b`     |
| `*`      | Multiplication    | `a * b`     |
| `/`      | Division          | `a / b`     |
| `%`      | Modulus (remainder) | `a % b`  |

---

## 2. Assignment Operators

Used to assign values to variables.

| Operator | Description           | Example    |
|----------|-----------------------|------------|
| `=`      | Assign                 | `x = 5`    |
| `+=`     | Add and assign         | `x += 3`   |
| `-=`     | Subtract and assign    | `x -= 2`   |
| `*=`     | Multiply and assign    | `x *= 4`   |
| `/=`     | Divide and assign      | `x /= 2`   |
| `%=`     | Modulo and assign      | `x %= 3`   |

---

## 3. Relational (Comparison) Operators

Used to compare two values.

| Operator | Description       | Example     |
|----------|-------------------|-------------|
| `==`     | Equal to           | `a == b`    |
| `!=`     | Not equal to       | `a != b`    |
| `>`      | Greater than       | `a > b`     |
| `<`      | Less than          | `a < b`     |
| `>=`     | Greater or equal   | `a >= b`    |
| `<=`     | Less or equal      | `a <= b`    |

---

## 4. Logical Operators

Used to combine multiple conditions.

| Operator | Description             | Example             |
|----------|-------------------------|---------------------|
| `&&`     | Logical AND              | `a > 5 && b < 10`   |
| `||`     | Logical OR               | `a > 5 || b < 10`   |
| `!`      | Logical NOT              | `!(a > 5)`          |

---

## 5. Unary Operators

Used with only one operand.

| Operator | Description     | Example |
|----------|-----------------|---------|
| `+`      | Unary plus      | `+a`    |
| `-`      | Unary minus     | `-a`    |
| `++`     | Increment       | `a++` or `++a` |
| `--`     | Decrement       | `a--` or `--a` |

---

## 6. Bitwise Operators

Perform operations on bits.

| Operator | Description         | Example     |
|----------|---------------------|-------------|
| `&`      | Bitwise AND         | `a & b`     |
| `|`      | Bitwise OR          | `a | b`     |
| `^`      | Bitwise XOR         | `a ^ b`     |
| `~`      | Bitwise Complement  | `~a`        |
| `<<`     | Left shift          | `a << 2`    |
| `>>`     | Right shift         | `a >> 2`    |

---

## 7. Ternary Operator

Short-hand for `if-else` statement.

```java
String result = (condition) ? "True" : "False";
```

Example:

```java
int age = 20;
String result = (age >= 18) ? "Adult" : "Minor";
```

---

## 8. instanceof Operator

Checks whether an object is an instance of a specific class.

```java
String s = "Java";
System.out.println(s instanceof String); // true
```

---

## 🔑 Summary

- Operators make it possible to perform operations on variables and values.
- Knowing the category and usage of each operator is essential for writing effective Java code.
