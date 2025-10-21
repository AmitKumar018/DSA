package Recursion;
import java.util.*;

public class binaryString {
    public static void binaryStringret(int n,int lastplace, String str ){
        if(n==0){
            System.out.println(str);
            return;
        }
        // for no consequitive 1's
        
        // binaryStringret(n-1,0, str+"0" );
        // if(lastplace==0){
        //     binaryStringret(n-1,1,str+"1");
        // }


        //for no consiquitive zero
        binaryStringret(n-1,1, str+"1" );
        if(lastplace==1){
            binaryStringret(n-1,0,str+"0");
        }

    }
    public static void main(String[] args) {
        binaryStringret(3,1,"");
    }
    
}
