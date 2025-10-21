package OOPS;
import java.util.*;

public class getters_setters {
    public static void main(String[] args) {
        Pencil p2=new Pencil();
        p2.setcolor("blue");
        System.out.println(p2.getColor());
        p2.setTip(2);
        System.out.println((p2.getTip()));
        
    }
}
class Pencil{
    private String color;
    private int tip;

    String getColor(){
       return this.color;
    
    }

    int getTip(){
        return this.tip;
    }
    void setcolor(String newColor){
        color = newColor;
    }

    void setTip(int tip){
       this.tip=tip;

    //    when variable are of same name  then it is more iseful.
    }
}
