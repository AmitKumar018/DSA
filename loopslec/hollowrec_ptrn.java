package loopslec;
import java.util.*;


public class hollowrec_ptrn {
    public static void hollow_rec(int total_row,int total_col){
        // outer loop
        for(int i=1; i<=total_row; i++){
            // inner-loop
            for(int j=1; j<=total_col; j++){
                // cell(i,j)
                if(i==1 || i==total_row || j==1 || j==total_col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        hollow_rec(4, 5);
        
    }
    
}
