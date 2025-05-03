package external_pkg;
import main_pkg.Car;

class External{
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println("Public field from another package: " + car.speed);
        // System.out.println(car.fuelType);   // ❌ protected: not visible without inheritance
        // System.out.println(car.gearCount);  // ❌ default: not visible
        // System.out.println(car.engineCode); // ❌ private

        car.showPublic(); // ✅
        // car.showProtected(); // ❌
        // car.showDefault();   // ❌
        // car.showPrivate(); // ❌
    }
}