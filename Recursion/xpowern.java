package Recursion;
import java.util.*;

public class xpowern {
    public static int  power(int x, int n){
        if(n==0){
            return 1;
        }
        int xnm1=power(x,n-1);
        int xn=x*xnm1;
        return xn;
        // OR for shorter code

        // return x*power(x,n-1);
    }
    // OPTIMIZE APPROACH
    public static int  optimizedPower(int x, int n){
        if(n==0){
            return 1;
        }
        int halfpower=optimizedPower(x,n/2);
        int halfpowersq=halfpower*halfpower;
        if(n%2!=0){
            halfpowersq=x*halfpowersq;
        }
        return halfpowersq;
    }
    
    public static void main(String[] args) {
        // System.out.println(power(3,3));
        System.out.println(optimizedPower(2,5));
    }
       
    
}
