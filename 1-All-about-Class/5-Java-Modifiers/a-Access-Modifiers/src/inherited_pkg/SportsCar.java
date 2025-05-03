package inherited_pkg;
import main_pkg.Car;

class SportsCar extends Car{
    public SportsCar() {
        System.out.println("SportsCar subclass constructor");
    }

    public void accessInheritedMembers() {
        System.out.println("Accessing from subclass in another package");
        System.out.println("Public: " + speed);       // ✅
        System.out.println("Protected: " + FuelType); // ✅
        // System.out.println("Default: " + gearCount);  // ❌
        // System.out.println("Private: " + engineCode); // ❌

        showPublic();      // ✅
        showProtected();   // ✅
        // showDefault();  // ❌
        // showPrivate();  // ❌
    }

    public static void main(String[] args) {
        SportsCar sc = new SportsCar();
        sc.accessInheritedMembers();
    }
}