package Arraylist;
import java.util.ArrayList;
import java.util.*;

public class Containerwithmostwater {
    // BRUTE FORCE APP.-O(n^2)
    // public static int StoredWater(ArrayList<Integer> height){
    //     int maxWater=0;
    //     for(int i=0; i<height.size(); i++){
    //         for(int j=i+1; j<height.size(); j++){
    //             int heit=Math.min(height.get(i), height.get(j));
    //             int width=j-i;
    //             int currentWater=heit*width;
    //             maxWater=Math.max(maxWater,currentWater);
    //         }
    //     }
    //     return maxWater;
    // }

    // optimized-2 pointer app.-O(n).
    public static int maxstoredWater(ArrayList<Integer> height){
        int maxwater=0; 
       
        int left=0;
        int right=height.size()-1;
        while(left<right){
            
            int heit=Math.min(height.get(left),height.get(right));
            int width=right-left;
            int currWater=heit*width; 
            maxwater=Math.max(maxwater,currWater);
            if(height.get(left)<height.get(right)){
                left++;
            }else{
                right--;
            }

            
        }
        return maxwater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6); 
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8); 
        height.add(3);
        height.add(7);

        // System.out.println(StoredWater(height));
        System.out.println(maxstoredWater(height));
    }
}
