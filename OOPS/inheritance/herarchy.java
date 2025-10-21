package OOPS.inheritance;

public class herarchy {
    public static void main(String[] args) {
        // Animal A1=new Animal();
        dog d1=new dog();
        d1.run();

        Human h1 = new Human();
        h1.walk();
        int legs=2;
        System.out.println(legs);
    }
}

class Animal{
    void run(){
        System.out.println("running");
    }
    void walk(){
        System.out.println("walking");
    }
    void jump(){
        System.out.println("jumping");
    }
    void swim(){
        System.out.println("swimming");
    }
}
class Fish extends Animal{
    int fins;
}
class dog extends Animal{
    int legs;

}
class Human extends Animal{
    int legs;
}