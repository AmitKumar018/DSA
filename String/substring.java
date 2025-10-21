package String;
import java.util.*;

public class substring {
    public static String SubString(String Str, int si, int ei){
        String substr="";
        for(int i=si; i<ei; i++){
            substr +=Str.charAt(i);

        }
        return substr;
    }
    public static void main(String[] args) {
        String Str="Hello World";
    //    System.out.println( SubString(Str,0,4));
        System.out.println(Str.substring(0,4));
    }
    
}
