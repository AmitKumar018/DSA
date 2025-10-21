package Stack;
import java.util.*;
public class NextGreater {

    public static void main(String[] args) {
        int arr[]={2,5,7,3,6,9};
        int n=arr.length;
        Stack<Integer> s= new Stack<>();
        int nextGreater[]=new int[n];
        for(int i=n-1; i>=0; i--){
            while(!s.isEmpty() && arr[i]>arr[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nextGreater[i]=-1;
            }else{
                nextGreater[i]=arr[s.peek()];
            }
            s.push(i);
        }
        for(int i=0; i<nextGreater.length; i++){
            System.out.println(nextGreater[i]);
        }
        System.out.println();
        
    }
}

