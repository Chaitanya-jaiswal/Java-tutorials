// File: InnerClassDemo.java

class OuterClass {
    int x = 10;

    // Regular Inner Class
    class InnerClass {
        int y = 5;
        int sum() {
            return x + y;
        }
    }

    // Private Inner Class
    private class PrivateInner {
        int z = 100;
        int multiply() {
            return z * x;
        }
    }

    // Accessor for Private Inner Class
    public void usePrivateInner() {
        PrivateInner obj = new PrivateInner();
        System.out.println("Private Inner Class Output: " + obj.multiply());
    }

    // Static Inner Class
    static class StaticInner {
        int a = 50;
        public void display() {
            System.out.println("Inside static inner class. Value of a: " + a);
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        // Accessing Regular Inner Class
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        System.out.println("Sum (outer.x + inner.y): " + inner.sum());

        // Accessing Private Inner Class through a public method
        outer.usePrivateInner();

        // Accessing Static Inner Class directly
        OuterClass.StaticInner staticInner = new OuterClass.StaticInner();
        staticInner.display();
    }
}
