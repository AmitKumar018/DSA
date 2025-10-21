package Recursion;
import java.util.*;

public class naturalSum {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int sumone=sum(n-1);
        int totalsum=n+sum(n-1);
        return totalsum;
    }
    public static void main(String[] args) {
        int n=10;
        int result=sum(n);
        System.out.println(result);
    }
}
