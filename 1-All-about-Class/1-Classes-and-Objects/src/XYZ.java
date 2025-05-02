
// Creating a 'CLASS FIRST'
class First{

    // 'FIELDS/ ATTRIBUTES' of the class
    int x= 5;

    // 'MAIN METHOD' of the 'CLASS FIRST'
    public static void main(String[] args) {

        // Creating 'OBJECTS' of the 'CLASS FIRST'
        // NOTE: Multiple Objects can be created of a Single Class
        First obj1 = new First();
        First obj2 = new First();

        System.out.println("'x' field of 'obj1' of the class first (inside class first's main fn) : " + obj1.x);
        System.out.println("'x' field of 'obj2' of the class first (inside class first's main fn) : " + obj2.x);

        // Explicitly calling the 'MAIN METHOD' in the 'CLASS SECOND'
        String[] test= {"TESTING"};
        Second.main(test);

        // Modifying the 'x' field of "obj1" object (Won't affect 'x' field of other objects).
        System.out.println("Modifying 'x' field of 'obj1' of the class first (inside class first's main fn) : ");
        obj1.x= 2;
        System.out.println("'obj1' After modifying 'x' field of 'obj1' of the class first (inside class first's main fn) : " + obj1.x);
        System.out.println("'obj2' After modifying 'x' field of 'obj1' of the class first (inside class first's main fn) : " + obj2.x);
    }
}

// Creating a "CLASS SECOND"
class Second{
    public static void main(String[] args){
        First cl2_obj1 = new First();
        System.out.println("'x' field of 'cl2_obj1' of the class first (inside class second's main fn): " + cl2_obj1.x);
    }
}

/*
    NOTES:

    1)  There are two different main functions in two different classes.

        Q) Which main function will run/ be executed?
        => It depends mainly on the file_name and whether any class is declared as public.

        a)  File_name different from the names of classes inside the file
            Example:
                file_name -> "XYZ.java"
                class_names -> "class First", "class Second"

            ->  If we compile the "XYZ.java" file containing "class First" and "class Second",
            ->  Both classes will be compiled into two separate bytecode files:
                - "First.class"
                - "Second.class"

            ->  After compilation:
                - We can run either "First" or "Second" independently by using:
                    - `java First`
                    - `java Second`
                - Thus, the main() method of whichever class we specify in the java command will execute.
                - The filename ("XYZ.java") does not affect which main() runs when no class is public.

        b)  File_name same as a public class inside the file
            Example:
                file_name -> "First.java"
                class_names -> "public class First", "class Second"

            ->  In Java, if a class is declared as `public`, then:
                - The filename must exactly match the public class name (case-sensitive).
                - Only one public class is allowed per .java file.

            ->  After compilation:
                - Both "First.class" and "Second.class" will still be generated.
                - However, at runtime:
                    - It is standard to run the public class (`java First`).
                    - Other non-public classes like "Second" can be accessed internally (creating objects, calling methods).
                    - Running `java Second` directly **may not always work** reliably and is not a good practice if a public class exists.

    ⚡ Important Points:
    - If **no class is public**, you can run any class that has a valid `main()` method.
    - If a **public class exists**, Java expects you to run the public class.
    - "private", "protected" modifiers are not allowed for top-level classes (only public or default are allowed at file level).
*/

