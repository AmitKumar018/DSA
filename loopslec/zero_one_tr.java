package loopslec;
import java.util.*;

// 0-1 TRIANGLE
public class zero_one_tr {
    public static void triangle(int n){
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        triangle(5);
        
    }
}
