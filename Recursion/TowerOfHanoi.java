package Recursion;
import java.util.*;
public class TowerOfHanoi {
    public static void towerOfHanoi(int n,char from_rod,char to_rod,char aux_rod){
        if(n==0){
            return;
        }
// move n-1 disk from rod A(from_rod) to rod B(aux_rod)
        towerOfHanoi(n-1,from_rod,aux_rod,to_rod);
        System.out.println("moved disk "+n+" from rod "+from_rod+" to rod "+to_rod);
        //move n-1 disk from rod B(aux_rod) to rod c(to_rod)
        towerOfHanoi(n-1,aux_rod,to_rod,from_rod);
       

    }
    public static void main(String[] args) {
        towerOfHanoi(3, 'A', 'B','C' );
    }
}
