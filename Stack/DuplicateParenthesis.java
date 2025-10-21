package Stack;
import java.util.*;
public class DuplicateParenthesis {
    public static boolean duplicate(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            // closing
            if(ch==')'){
                int count=0;
                while(s.pop() != '('){
                    count++;
                }
                // condition when there is no operand and operator is left
                if(count <1){
                    return true; // means duplicate exist
                }
            }else{
                // opening
                s.push(ch);
            }
        }
        return false;
        

    }
    public static void main(String[] args) {
        String str="(A+B)";
        System.out.println(duplicate(str));
    }
}
