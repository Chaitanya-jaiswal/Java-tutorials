package main_pkg;

public class MainClass {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println("Public field: " + car.speed);
        // System.out.println("Private field: " + car.engineCode); // ❌ Not allowed
        System.out.println("Protected field: " + car.FuelType); // ✅ Same package
        System.out.println("Default field: " + car.GearCount);  // ✅ Same package

        car.showPublic();    // ✅
        // car.showPrivate();  // ❌
        car.showProtected(); // ✅
        car.showDefault();   // ✅
    }
}