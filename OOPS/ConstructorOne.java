package OOPS;

public class ConstructorOne {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Amit";
        s1.roll = 23;
        s1.password = "abd";

        Student s2 = new Student(s1);
        s2.password = "def";

        Student s3 = new Student(123);
    }
}

class Student {
    String name;
    int roll;
    String password;

    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
        this.password = s1.password;
    }

    Student() {
        System.out.println("Constructor is called...");
    }

    Student(String name) {
        this.name = name;
    }

    Student(int roll) {
        this.roll = roll;
    }
}