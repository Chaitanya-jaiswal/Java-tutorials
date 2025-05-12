# Java Type Casting

Type casting in Java refers to converting a variable from one data type to another. It is mainly used in scenarios where we need to convert primitive data types.

## Types of Casting

### 1. **Widening Casting** (Automatic)
- Converts a smaller type to a larger type size.
- Done automatically by the compiler.
- Order: `byte -> short -> char -> int -> long -> float -> double`

#### Example:
```java
int myInt = 9;
double myDouble = myInt; // Widening casting

System.out.println(myInt);    // Outputs 9
System.out.println(myDouble); // Outputs 9.0
```

### 2. **Narrowing Casting** (Manual)
- Converts a larger type to a smaller type size.
- Must be done manually using parentheses.
- Order: `double -> float -> long -> int -> char -> short -> byte`

#### Example:
```java
double myDouble = 9.78d;
int myInt = (int) myDouble; // Narrowing casting

System.out.println(myDouble); // Outputs 9.78
System.out.println(myInt);    // Outputs 9
```

---

## 💡 Real-Life Example: Score Percentage Calculation

We use type casting to ensure accurate float division.

```java
int maxScore = 500;
int userScore = 423;

float percentage = (float) userScore / maxScore * 100.0f;

System.out.println("User's percentage is " + percentage);
```

### Output:
```
User's percentage is 84.6
```

---

## 🔑 Key Points to Remember

- Widening is safer and implicit.
- Narrowing can lose precision and must be explicit.
- Always cast carefully when dividing integers if a floating-point result is needed.
- Useful in real-life applications such as financial calculations, percentages, etc.

---

📁 **Recommended File Structure:**
```
Java-Type-Casting/
├── JavaTypeCastingDemo.java
└── TypeCastingNotes.md
```