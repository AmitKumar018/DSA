package Recursion;
import java.util.*;

public class factorial {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int factorialnminusone=factorial(n-1);
        int factorialofn=n*factorial(n-1);
        return factorialofn;
    }
    public static void main(String[] args) {
        int n=5;
        int factorialresult=factorial(n);
        System.out.println(factorialresult);
    }
    
}
