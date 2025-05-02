public class Main {

    //Declaration and definition of multiple "CLASS ATTRIBUTES/ FIELDS"
    int x= 5;
    int y= 3;

    // Declaring a "Attribute/ field" as 'final' won't allow it to get modified/override
    final int z= 10;

    public static void main(String[] args) {

        //Accessing Attributes by creating object of the class Main
        Main my_obj1 = new Main();
        System.out.println("Accessing Attributes by creating object.");
        System.out.println(my_obj1.x);
        System.out.println(my_obj1.y);

        //Modifying / Overriding existing values or Attributes
        System.out.println("Before modifying x of my_obj1: " + my_obj1.x);
        my_obj1.x = 9;
        // ERROR: Cannot modify "final" variable of 'z'
        // my_obj1.z = 5;
        System.out.println("After modifying x of my_obj1: " + my_obj1.x);


        //We can create multiple objects of the same class
        System.out.println("Creating multiple objects of class Main");
        Main my_obj2 = new Main();
        System.out.println(my_obj2);


    }
}


/*
    NOTES:

    1)  This program demonstrates key Object-Oriented Programming concepts:
        - Class attributes (fields)
        - Object creation
        - Modifying field values
        - Use of the `final` keyword
        - Default string output of an object

    2)  Fields declared in the class:
        - int x = 5;           → modifiable instance variable
        - int y = 3;           → modifiable instance variable
        - final int z = 10;    → constant instance variable (cannot be changed)

            ⚠️ Attempting to modify `z` will result in a compile-time error:
                e.g. my_obj1.z = 9;  // ❌ Not allowed (z is final)

    3)  Accessing and modifying fields:
        - You must create an object to access non-static fields.
        - Fields like `x` and `y` can be modified using the object:
            e.g. my_obj1.x = 9;

        - Modifying one object's field does NOT affect another object's fields
            ➤ Each object has its own copy of x, y, and z

    4)  Multiple Object Creation:
        - Multiple objects of the same class can be created:
            e.g. Main my_obj1 = new Main();
                 Main my_obj2 = new Main();

        - Each object has independent copies of instance variables.

    5)  Default object output (`System.out.println(my_obj2);`)
        - When you print an object directly without overriding `toString()`, Java outputs:
            ➤ ClassName@HashCodeInHex
            ➤ Example: Main@8efb846

        - This default output is defined by the Object class's `toString()` method.

    6)  Customizing object output:
        - You can override the `toString()` method inside your class to print meaningful information.
            Example:
                @Override
                public String toString() {
                    return "Main Object [x=" + x + ", y=" + y + ", z=" + z + "]";
                }

        - After overriding:
            ➤ System.out.println(my_obj2); will now print something like:
                Main Object [x=5, y=3, z=10]
*/

/*
    NOTES:

    📌 What is hashCode()?

    - `hashCode()` is a method defined in the `Object` class in Java:
        public int hashCode()

    - It returns an integer value that serves as a hash representation of the object.
    - By default, it is often derived from the object’s internal memory address (but not the actual memory location).

    --------------------------------------------------------------------
    🧠 Purpose of hashCode():

    1) Efficient storage and retrieval in hash-based collections like:
        - HashMap
        - HashSet
        - Hashtable

    2) Used in combination with `equals()` for comparing objects.
    3) Included in default object string (e.g., Main@8efb846).

    --------------------------------------------------------------------
    🧪 Default behavior:

    - If you don’t override `hashCode()`, Java uses the default from the `Object` class.
    - That default version typically:
        ➤ Returns an integer derived from the object’s memory identity.
        ➤ Ensures two different objects (even with the same data) have different hash codes.

    Example:
        class A {}
        A obj1 = new A();
        A obj2 = new A();
        System.out.println(obj1.hashCode());  // e.g. 111111
        System.out.println(obj2.hashCode());  // e.g. 222222

    --------------------------------------------------------------------
    ✅ Overriding hashCode():

    - When you override `equals()`, you must also override `hashCode()` to maintain consistency.

    Golden Rule:
    ➤ If `obj1.equals(obj2)` is true, then `obj1.hashCode() == obj2.hashCode()` must also be true.

    - Common approach:
        Use fields of the object to calculate a meaningful hash:
        Example using `Objects.hash(...)`:
            @Override
            public int hashCode() {
                return Objects.hash(id, name);
            }

    --------------------------------------------------------------------
    ⚠️ hashCode() ≠ memory address:

    - Java does not give access to real memory addresses.
    - hashCode() may internally use object location, but it's abstracted for safety and portability.
    - Actual memory addresses are hidden from Java programmers (unlike C/C++).

    --------------------------------------------------------------------
    🔄 hashCode() in toString():

    - If you print an object without overriding toString(), you’ll see:
        ➤ ClassName@hashCodeInHex

    Example:
        Main obj = new Main();
        System.out.println(obj);  // Output: Main@6d06d69c

    - Here, `6d06d69c` is the hexadecimal form of the object’s hashCode.

    --------------------------------------------------------------------
    ✅ Summary:

    - `hashCode()` returns an int that represents the object’s identity.
    - It’s essential for performance in hash-based structures.
    - Always override it alongside `equals()` for correct behavior.
    - You can use `Objects.hash()` or a custom logic to implement it.
*/

