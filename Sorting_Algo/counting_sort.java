package Sorting_Algo;
import java.util.*;

public class counting_sort {
    public static void counting(int arr[]){
       int largest=Integer.MIN_VALUE;
    //    iterating on orgional array
       for(int i=0; i<arr.length;i++){
        largest=Math.max(largest,arr[i]);
       }
    //    iterating on frequency count array
       int count[]=new int[largest+1];  // for including 0 as a positive number
       for(int i=0; i<arr.length; i++){
        count[arr[i]]++;
       }
    //    sorting
       int j=0;
       for(int i=0;i<arr.length; i++){
        while(count[i]>0){
            arr[j]=i;
            j++;
            count[i]--;
        }
       }
    }
    public static void arrprint(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[]={1,4,1,3,2,4,3,7};
        counting(arr);
        arrprint(arr);
    }
    
    
}
