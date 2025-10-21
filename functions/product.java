package functions;
import java.util.*;

public class product {
    public static int multiply(int a,int b){
        int product=a*b;
        return product;
    }
    public static void main(String[] args) {
        int num1=5;
        int num2=6;
       int prod= multiply(num1,num2);
       System.out.println("multiplication is: "+prod);
        
            
        }
    }