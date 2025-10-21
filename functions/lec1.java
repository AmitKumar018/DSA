package functions;
import java.util.*;

public class lec1 {
    public static void callhello(){
        System.out.println("hello world!");
    };
    public static int calcSum(int num1,int num2){  //num1 & 2 are parameters or formal param
        int sum=num1+num2;
        return sum;
    }
    public static void main(String[] args) {
        callhello();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first num");
        int a=sc.nextInt();
        System.out.println("enter the seconfd num");
        int b=sc.nextInt();
        int sum=calcSum(a,b);  //ab are arguments or actual parameter
        System.out.println("sum is: "+sum);

    }
}
