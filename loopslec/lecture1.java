package  loopslec;
import java.util.*;

public class lecture1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int sum=0;
        int i=1;
        // while(counter<=n){
        //     System.out.println(counter);
        //     counter++;
        // }


        // SUM OF NATuRAL NO
        while( i<=n){
            sum+=i;
            i++;
           

        }
        System.out.println("sum is: "+sum);
        
    }
    
}
