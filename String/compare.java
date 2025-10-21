package String;
import java.util.*;

public class compare {
    public static void main(String[] args) {
        String str1="Amit";
        String str2="Amit";
        String str3=new String("Amit");

    //     if(str1==str2){
    //         System.out.println("true");
    //     }else{
    //         System.out.println("false");
    //     }

    //     if(str2==str3){
    //         System.out.println("true");
    //     }else{
    //         System.out.println("false");
    //     }
    // }
    // so in second case it return the value false but value stored in both is same
// here we use equals method it only comapre the value of string.
        if(str2.equals(str3)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

    
}
