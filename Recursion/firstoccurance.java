package Recursion;
import java.util.*;

public class firstoccurance {
    public static int occurance(int arr[], int key,int i){
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i]==key){
        //         return i;
        //     }
        // }
        // return -1;

        if(i==arr.length){
            return -1;
        }

        if(arr[i]==key){
            return i;
        }
        return occurance(arr,key,i+1);
    }
    public static void main(String[] args) {
        int arr[]={2,4,5,6,8,7,8};
        System.out.println(occurance(arr,8,0));
        
    }
    
}
