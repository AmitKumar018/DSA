package Recursion;
import java.util.*;

public class friendspairing {
    public static int pair(int n){
        // base case
        if(n==1 || n==2){
            return n;
        }
        // // single
        int fnm1=pair(n-1);

        // // pair
        int fnm2=pair(n-2);
        int pairWays=(n-1)*fnm2;
        int totalways=fnm1+pairWays;
        return totalways;

        // another way to write it easily
        // return pair(n-1)+(n-1)*pair(n-2);
    }

    public static void main(String[] args) {
        System.out.println(pair(3));
    }
    
}
