package For_Attributes_and_methods;

class Base {
    final void display() {
        //FINAL METHOD :- This method can't be overridden.
        System.out.println("This method can't be overridden.");
    }
}

class Derived extends Base {
    // Below code would result in compilation error if uncommented
    // void display() { System.out.println("Trying to override"); }
}

class Main2{
    public static void main(String[] args) {
        Base obj1 = new Derived();
        obj1.display(); // OUTPUT: "This method can't be overridden."

        Base obj2 = new Base();
        obj2.display(); // OUTPUT: "This method can't be overridden."
    }
}