package OOPS.inheritance;

public class Inheritone {
    public static void main(String[] args) {
        Fish shark=new Fish();
        shark.eat();
        shark.swim();
        
    }
}
// base class
class Animal{
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breathes");
    }
}
// derived class
class Fish extends Animal{
    int fins;
     
    void swim(){
        System.out.println("swims in water");
    }
}
