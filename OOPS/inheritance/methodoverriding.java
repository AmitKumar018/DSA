package OOPS.inheritance;
class Animal {
    void sound() {
        System.out.println("Animals make a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class methodoverriding {
    public static void main(String[] args) {
        Animal obj = new Dog(); // Upcasting
        obj.sound(); // Calls Dog's sound() method (Dynamic Method Dispatch)
    }
}
