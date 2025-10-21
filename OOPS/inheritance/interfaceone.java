package OOPS.inheritance;
import java.util.*;

public class interfaceone {
    public static void main(String[] args) {
        Queen q=new Queen();
        q.moves();
    }
    
}
interface chessPlayer{
    void moves();

}
class Queen implements chessPlayer{
    // here we need to write public becoz if not written it will be of default type
    //due to method overriding.
    public void moves(){
        System.out.println("up, down, left, right, diagonal(in all four direction)");
    }
}
class Rook implements chessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}
class King implements chessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal(by 1 step)");
    }
}




// COE FOR MULTIPLE INHERITANCE.
// First interface
// interface Animal {
//     void eat();
// }

// // Second interface
// interface Bird {
//     void fly();
// }

// // Class implementing multiple interfaces
// class Sparrow implements Animal, Bird {
//     @Override
//     public void eat() {
//         System.out.println("Sparrow eats seeds.");
//     }

//     @Override
//     public void fly() {
//         System.out.println("Sparrow flies in the sky.");
//     }
// }

// // Main class
// public class MultipleInheritanceExample {
//     public static void main(String[] args) {
//         Sparrow sparrow = new Sparrow();
//         sparrow.eat();  // From Animal interface
//         sparrow.fly();  // From Bird interface
//     }
// }
