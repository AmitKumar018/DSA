package loopslec;

import java.util.*;
public class starpattern {
    public static void main(String[] args) {

        // STAR PATTERN
        for(int i=1;i<=4; i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");  
            }
            System.out.println();
            
        }


        // INVERTED SATR PATTERN
        // for(int i=1;i<=4;i++){
        //     for(int j=1; j<=4-i+1; j++){
        //         System.out.print("*");

        //     }
        //     System.out.println();
        // }

        // HALF-PYRAMID
        // int n=4;
        // for(int line=1;line<=n;line++){
        //     for(int number=1;number<=line;number++){
        //         System.out.print(number);
        //     }
        //     System.out.println();
        // }


        // CHARACTER PATTERN
        // int n=4;
        // char ch='A';
        // for(int line=1;line<=n;line++){
        //     for(int chars=1;chars<=line; chars++){
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }
    }

    
}
