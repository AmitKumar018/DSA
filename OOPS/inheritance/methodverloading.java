package OOPS.inheritance;

class MathOperations {
    // Method with 2 parameters
    void add(int a, int b) {
        System.out.println("Sum (int): " + (a + b));
    }

    // Overloaded method with 3 parameters
    void add(double a, double b, double c) {
        System.out.println("Sum (double): " + (a + b + c));
    }
}

public class methodverloading {
    public static void main(String[] args) {
        MathOperations obj = new MathOperations();
        obj.add(5, 10);          // Calls first method
        obj.add(2.5, 3.5, 1.5);  // Calls overloaded method
    }
}
