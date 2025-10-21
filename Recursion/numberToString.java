package Recursion;
import java.util.*;

public class numberToString {
    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void returnString(int n){
       
        if(n==0){
            return;
        }
        int lastdigit=n%10;
        returnString(n/10);
        System.out.print(digits[lastdigit]+" ");
    }
    public static void main(String[] args) {
        returnString(1947);
    }
}

