package String;
import java.util.*;
// Brute force
// tc=nlogn space=O(n) 
public class anagrams {
    public static boolean isAnagram(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        char[] arr1=s.toCharArray();
        char[] arr2=t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s=sc.nextLine();
        System.out.println("Enter the second string: ");
        String t=sc.nextLine();
        System.out.println(isAnagram(s,t));
       
    }
    
}
