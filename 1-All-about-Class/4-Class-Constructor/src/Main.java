
//Creating class Car
class Car{
    String Brand;
    String Model;
    int Year_of_manufacture;

    //Parameterised constructor
    Car(String brand, String model, int year_of_manufacture){
        Brand = brand;
        Model = model;
        Year_of_manufacture = year_of_manufacture;
    }
}

// Creating a class Tesla
class Tesla{
    String Brand;
    String Model;
    int Year_of_manufacture;

    //Non-Parameterised constructor
    Tesla(){
        //Default definitions
        Brand = "Tesla";
        Model = "electric";
        Year_of_manufacture = 2018;
    }
}


public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Tata", "Safari", 2024);
        System.out.println(car1.Brand);

        Tesla car2 = new Tesla();
        System.out.println(car2.Brand);
    }
}


/*
    NOTES:

    📌 Purpose of this program:
    - Demonstrates the use of constructors in Java.
    - Shows both parameterized and non-parameterized (default) constructors.

    --------------------------------------------------------------------
    🔹 What is a constructor?
    - A special method that gets called automatically when an object is created.
    - It is used to initialize the object.
    - It has the same name as the class and does NOT have a return type (not even void).

    --------------------------------------------------------------------
    🔸 Constructor with Parameters (Car class):
    - The `Car` class defines a constructor that accepts values to initialize:
        ➤ Brand
        ➤ Model
        ➤ Year_of_manufacture
    - Syntax: Car(String brand, String model, int year)

    --------------------------------------------------------------------
    🔸 Constructor without Parameters (Tesla class):
    - The `Tesla` class defines a constructor with no arguments.
    - It sets default values internally for:
        ➤ Brand = \"Tesla\"
        ➤ Model = \"electric\"
        ➤ Year_of_manufacture = 2018

    --------------------------------------------------------------------
    ✅ Summary:
    - Constructors are used to set up object values during creation.
    - You can create multiple constructors in a class using **constructor overloading**.
    - If no constructor is defined, Java provides a default one automatically (only if no other constructor exists).
*/
