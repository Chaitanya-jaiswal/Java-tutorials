public class Main {
    // Static method
    static void myStaticMethod1() {
        System.out.println("Static method-1");

        //Accessing static method inside static method
        System.out.println("Accessing static method inside static method");
        myStaticMethod2();

        //Accessing non-static method inside static method
        System.out.println("Accessing non-static method inside static method");
        System.out.println("ERROR: Cannot access non-static methods inside static method");
        //myNonStaticMethod2(); //ERROR: Cannot access non-static methods inside static method
    }

    static void myStaticMethod2() {
        System.out.println("Static method-2");
    }

    // Non-static method
    void myNonStaticMethod1() {
        System.out.println("Non Static method- 1");

        //Accessing static method inside non-static method
        System.out.println("Accessing static method inside non-static method");
        myStaticMethod2();

        //Accessing non-static method inside non-static method
        System.out.println("Accessing non-static method inside non- static method");
        myNonStaticMethod2();
    }

    void myNonStaticMethod2() {
        System.out.println("Non Static method- 2");
    }



    // Main method
    public static void main(String[] args) {
        myStaticMethod1();   // Call the static method


        // myNonStaticMethod1();    //ERROR: it's a non-static method, so we need
                                // to create the object of the class main firstly, and
                                // then we can access it using '.' annotation
                                // (See below)

        Main myObj = new Main(); // Create an object of Main
        myObj.myNonStaticMethod1(); // Call the non-static method on the object
    }
}



/*
    NOTES:

    📌 Purpose of this program:
    - Demonstrates the difference between static and non-static methods in Java.
    - Shows how to call each type correctly.

    --------------------------------------------------------------------
    🔹 static method:
    - Declared with the `static` keyword.
    - Belongs to the class, not to any object.
    - Can be called without creating an object.
    - Syntax: ClassName.methodName() or just methodName(), if inside the same class.

    --------------------------------------------------------------------
    🔸 non-static (instance) method:
    - Does NOT use the `static` keyword.
    - Belongs to an object of the class.
    - Must be accessed by creating an object/ instance of the class.

    --------------------------------------------------------------------
    ⚠️ Important Notes:
    - A static method cannot directly access non-static fields or methods.
    - An instance method can access both static and non-static members.
    - If you try to call a non-static method from a static method (like `main()`) without an object, you'll get a compile-time error.

    --------------------------------------------------------------------
    ✅ Summary:
    - `static` = class-level, no object needed
    - `non-static` = instance-level, object required
    - This example shows how to use both correctly within the same class.

    --------------------------------------------------------------------
*/
