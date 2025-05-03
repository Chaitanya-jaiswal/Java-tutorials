# Java Access Modifiers – With Program Structure

Access modifiers in Java control where **classes**, **methods**, **constructors**, and **attributes (variables)** can be accessed from.  
This project demonstrates access rules using three packages:

- `main_pkg`: Defines the core `Car` class with all modifiers.
- `external_pkg`: Tests access from a different package (no inheritance).
- `inherited_pkg`: Extends `Car` in a subclass from another package.

---

## 🔐 Types of Access Modifiers

| Modifier    | Class | Same Package | Subclass (other pkg) | Other Package |
|-------------|:-----:|:------------:|:--------------------:|:-------------:|
| `private`   | ✅     | ❌            | ❌                    | ❌             |
| (default)*  | ✅     | ✅            | ❌                    | ❌             |
| `protected` | ✅     | ✅            | ✅                    | ❌             |
| `public`    | ✅     | ✅            | ✅                    | ✅             |

> **\*** Default = no modifier = package-private.

---

## ✅ Package Structure

```
src/
├── main_pkg/
│   ├── Car.java         # Defines fields & methods with all modifiers
│   └── MainClass.java   # Accesses Car within the same package
├── external_pkg/
│   └── External.java      # Accesses Car without inheritance
└── inherited_pkg/
    └── SportsCar.java   # Subclass of Car to test protected access
                                            OR
                         # Accesses Car with inheritance
```

---

## ✅ Access Modifiers in Practice

### 1. Class-Level Modifiers

- `public class Car {}` → accessible from any package
- `class External {}` → default/package-private, accessible only inside same package

> ❌ You **cannot use** `private` or `protected` on top-level classes.

---

### 2. Member-Level Modifiers (in `Car.java`)

```java
public int speed;              // ✅ Accessible everywhere
private String engineCode;     // ❌ Only within Car
protected String fuelType;     // ✅ Accessible to subclasses and same package
int gearCount;                 // ✅ Default: same package only

public void showPublic() { ... }
private void showPrivate() { ... }
protected void showProtected() { ... }
void showDefault() { ... }       // default
```

---

## 🔍 Test Cases Across Packages

| From Class                                          | Access to Car’s Fields        | Notes                        |
|-----------------------------------------------------|-------------------------------|------------------------------|
| `MainClass` (same package)                          | public, protected, default ✅<br>private ❌ | All allowed except private   |
| `External` (different package)                      | public ✅<br>others ❌            | Only public is visible       |
| `SportsCar` (subclass [inherited class] , diff pkg) | public, protected ✅<br>default, private ❌ | Inherited members accessed via subclass |

---

## 🧠 Best Practices

- Use `private` for fields and helper methods to encapsulate logic.
- Use `public` for APIs or methods intended for external use.
- Use `protected` in base classes to support inheritance.
- Use default (no modifier) to limit usage within the same package.

---

## ❗Common Mistakes to Avoid

- ❌ Using `private` on top-level classes.
- ❌ Thinking `protected` means public.
- ❌ Assuming default is accessible everywhere.
- ❌ Trying to access private fields outside their class.

---

## ✅ Summary

Java access modifiers provide fine-grained control over visibility:

- `private` → Safest, fully hidden.
- `default` → Visible to the same package.
- `protected` → Inherited visibility across packages.
- `public` → Fully visible everywhere.

Use the most restrictive modifier that meets your needs for better code safety and maintainability.

---