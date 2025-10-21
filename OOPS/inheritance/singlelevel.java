package OOPS.inheritance;

public class singlelevel {
    public static void main(String[] args) {
        cow c1=new cow();
        c1.walk();
        c1.eat();
    }
}
class Animalone{
    void eat(){
        System.out.println("eating grass");
    }
    void drink(){
        System.out.println("drinking");
    }
}
class cow extends Animalone{
    void walk(){
        System.out.println("slow walker");
    }
}
