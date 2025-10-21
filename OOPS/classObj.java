package OOPS;
import java.util.*;

public class classObj {
    public static void main(String[] args) {
        Pen p1=new Pen();  //pen object p1
        //p1.setColor("Blue");
        // OR
        p1.color="yellow";
        System.out.println(p1.color);
        p1.setTip(2);
        System.out.println(p1.tip);

        BankAccount myAcc=new BankAccount();
        myAcc.username="Amit";
        myAcc.setPassword("abcdef");
       
    }
}
class BankAccount{
   public  String username;
   private String password;
   public void setPassword(String pwd){
    password=pwd;
   }

}
class Pen{
    String color;
    int tip;
    void setColor(String newColor){
        color= newColor;
    }

    void setTip(int newTip){
        tip=newTip;
    }
}

class Student{
    String name;
    int age;
    int marks;
    float percentage;

    void claculatePerc(int math, int phy, int chem){
        percentage=(math+phy+chem)/3;
    }
}
