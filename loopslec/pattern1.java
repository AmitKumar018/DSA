package loopslec;
import java.util.*;
public class pattern1 {
    public static void main(String args[]){
        // for(int line=1;line<=4;line++){
        //     System.out.println(" * * * *");
        // }

        // REVERSE OF NUMBER
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number: ");
        
        // while(n>0){
        //     int lastdigit=n%10;
        //     System.out.print(lastdigit +" ");
        //     n=n/10;

        // }


        // REVERSE THE NUMBER
        // int rev=0;
        // while(n>0){
        //     int lastdigit=n%10;
        //      rev=(rev*10)+lastdigit;
        //      n=n/10;


        // }
        // System.out.println(rev);


        // BREAK AT MULTIPLE OF 10
    
        do{
            System.out.println("enter the number: ");
            int n=sc.nextInt();
            if(n%10==0){
                continue;
            }  
            System.out.println(n);
        }while(true);
        
            
        
    }
}
