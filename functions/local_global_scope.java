package functions;
import java.util.*;

public class local_global_scope {
    // public static void prints(){
    //     // System.out.println(s);  // it will throw the error 
    //     // METHOD SCOPE
    //     int s=67;
    //     System.out.println(s); // it will not

    //     // WE CAN ONLY USE IT INSIDE DECLARED FUNCTION
    // }
    public static void main(String args[]){
        // System.out.println(s); //before declaration you can't use a var


        // BLOCK SCOPE : declared bwn curly braces
        {
        int s=45;
        System.out.println(s);

        }//here u can use 
    }
    
}
