package loopslec;
import java.util.*;

public class invertedhalf_pyr {
    public static void inverted_rotpyramid(int row){
    //    outer
        for(int i=1;i<=row;i++){
            // spaces
            for(int j=1;j<=row-i; j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        inverted_rotpyramid(5);
        
    }
    
}
