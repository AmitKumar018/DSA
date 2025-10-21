package functions;
import java.util.*;

public class binarytodec {
    public static void bindec(int binNum){
        int myNum=binNum;
        int decNum=0;
        int pow=0;
        while(binNum>0){
            int lastdig=binNum%10;
            decNum=decNum+(lastdig*(int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("decimal of "+myNum+"="+decNum);
    }
    public static void main(String[] args) {
        bindec(1111);
    }
    
}
