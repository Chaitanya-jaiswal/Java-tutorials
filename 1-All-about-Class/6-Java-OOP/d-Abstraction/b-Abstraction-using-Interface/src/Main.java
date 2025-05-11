public class Main {
    public static void main(String[] args) {
        System.out.println("=== Interface with Single Implementation ===");
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();

        System.out.println("\n=== Interface with Multiple Implementation ===");
        DemoClass myDemo = new DemoClass();
        myDemo.myMethod();
        myDemo.myOtherMethod();
    }
}
