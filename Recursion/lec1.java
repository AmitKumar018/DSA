package Recursion;
import java.util.*;

public class lec1 {
    // printing numbers using recursion;
    public static void printDec(int n){

        // number in decreasing order
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }


    public static void printInc(int n){
        // number in increasing order
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        
        printInc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n=10;
        printDec(n);
        // int n=5;
        //printInc(n);
        
    }
    
}
