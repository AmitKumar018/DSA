package loopslec;
import java.util.*;
public class floydtriangle {
    public static void floyd(int counter,int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        floyd(1,5);
    }
    
}
