package Recursion;
import java.util.*;

public class fibonacci {
    public static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int fib1=fib(n-1);
        int fib2=fib(n-2);
        return fib1+fib2;
    }
    public static void main(String args[]){
        int n=25;
        System.out.println("fibonacci num is: "+fib(n));
    }
    
}
