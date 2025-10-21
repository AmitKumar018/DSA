package String;
import java.util.*;
public class stringcomp {
    public static String stringComp(String str){
        

        // but this is ineffcient method
    //  String newstr="";
    //   for(int i=0; i<str.length(); i++){
    //     Integer count =1;
    //     while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
    //          count ++;
    //          i++;
    //     }
    //     newstr+=str.charAt(i);
    //     if(count > 1){
    //         newstr+=count.toString();
    //     }
    //   }
    //   return newstr;

    // USING STRINGBUILDER
    StringBuilder sb= new StringBuilder();
    for(int i=0; i<str.length(); i++){
        Integer count =1;
        while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){  //this is more efficient
             count ++;
             i++;
        }
        sb.append(str.charAt(i));
        if(count > 1){
            sb.append(count);
        }
      }
      return sb.toString();

    }

    
   
    public static void main(String[] args) {
        String str="aaabbcccdd";
        System.out.println(stringComp(str));
    }
}
