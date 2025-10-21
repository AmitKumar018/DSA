package functions;
import java.util.*;

public class factorial {
    public static int factorialnum(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        return f;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number: ");
        int n=sc.nextInt();
        int fact=factorialnum(n);
        System.out.println("factorial is: "+fact);
    }
    
}
