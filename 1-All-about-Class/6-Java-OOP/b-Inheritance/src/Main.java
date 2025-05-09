
class Vehicle {
    protected String brand = "Ford"; // Superclass attribute

    public void honk() {             // Superclass method
        System.out.println("Tuut, tuut!");
    }
}

// Subclass inherits from Vehicle
class Car extends Vehicle {
    private String modelName = "Mustang";

    public void displayDetails() {
        System.out.println("Brand: " + brand);       // Access protected attribute
        System.out.println("Model: " + modelName);   // Access subclass attribute
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();             // Call method from superclass
        myCar.displayDetails();   // Call method from subclass
    }
}
