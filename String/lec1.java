package String;
import java.util.*;
public class lec1 {
    public static void printletter(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
    } 
    public static void main(String[] args) {
        // char arr[]={'a','b','c'};
        String str="he is going to school";
        // Scanner sc=new Scanner(System.in);
        // String name=sc.nextLine();
        // System.out.println(name);
        // System.out.println(name.length());
        printletter(str);

    }
    
}
