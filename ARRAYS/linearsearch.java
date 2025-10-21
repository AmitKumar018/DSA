package ARRAYS;
import java.util.*;

public class linearsearch {
    // public static int  linear(int arr[],int key){
    //     for(int i=0; i<arr.length;i++){
    //         if(arr[i]==key){
    //             return i;
    //         }
    //     }
    //     return -1;

    // }
    public static int menuitem(String menu[],String key){
        for(int i=0; i<menu.length;i++){
            if(menu[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // int arr[]={2,4,6,8,10,12,14,16};
        // int key=10;
        // int index=linear(arr,key);
        // if(index==-1){
        //     System.out.println("Element not found");
        // }else{
        // System.out.println("index of element is:"+index);
        // }

        String menu[]={"samosa","kachori","pakode","poha","dosa"};
        String key="samosa";
        int index=menuitem(menu, key);
        if(index==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("index of element is:"+index);
        }

        
    }
    
}
