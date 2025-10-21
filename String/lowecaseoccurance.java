package String;
import java.util.*;

// NO OF VOWEL IN GIVEN STRING

public class lowecaseoccurance {
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("input your string");
        String str=sc.nextLine();
        int count=0;
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ){
                count++;
            }
            
        }
        System.out.print(count);
    }
      
    // true
    
               
    
}
