package OOPS.inheritance;
import java.util.*;
public class Statickey {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.schoolNmae="DAV";

        Student s2=new Student();
        System.out.println(s2.schoolNmae);
    }
}
//MAKING PROPERTY AS STATIC
class Student{
    int roll;
    String name;
    static String schoolNmae;

    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
}
