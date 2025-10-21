package OOPS.inheritance;

public class abstractclass {
    public static void main(String args[]){
        // Horse h=new Horse();
        // h.walk();
        // System.out.println(h.color);


        Mustang myHorse= new Mustang();
        

        // chiken c= new chiken();
        // c.walk();

    }
}
abstract class Animal{
    String color;
    // constructor for Animal class
    Animal(){
        // color="peach";
        System.out.println("Animal constructor is called" );
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk(); // here it only give idea to other function that
    //every function should have one method called walk and it behave diffrent for diffrent.
}
class Horse extends Animal{
    Horse(){
        System.out.println("horse constructor is called...");
    }
    void changeColor(){
        color="red";
    }
    void walk(){
        System.out.println("walking fast");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("constructor mustang is called...");
    }
}
class chiken extends Animal{
    void changeColor(){
        color="green";
    }
    void walk(){
        System.out.println("walks on two legs");
    }
}