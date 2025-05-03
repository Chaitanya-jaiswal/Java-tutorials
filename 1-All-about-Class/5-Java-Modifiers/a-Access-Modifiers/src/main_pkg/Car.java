package main_pkg;

public class Car {
    public int speed= 100;
    private String EngineCode= "V12";
    protected String FuelType= "Diesel";
    int GearCount= 5;

    public Car() {
        System.out.println("Public Constructor of Car called.");
    }

    public void showPublic(){
        System.out.println("Public method: Max Speed: " + speed);
    }

    private void showPrivate(){
        System.out.println("Private method: Engine Code: " + EngineCode);
    }

    protected void showProtected(){
        System.out.println("Protected method: Fuel Type: " + FuelType);
    }

    void showDefault(){
        System.out.println("Default method: Gear Count: " + GearCount);
    }

}