package hashing;
import java.util.*;
public class MajorityElem {   //O(N)
    public static void main(String[] args) {
        int arr[]={1,3,2,5,1,3,5,1};
        HashMap<Integer, Integer> hm=new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1);
            }else{
                hm.put(arr[i],1);
            }
            
            //can be written like this when we are performing same operetion in both if and else case
          // hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
        }

        Set<Integer> keySet=hm.keySet();
        //  for(Integer key : hm.keySet())   can be written like this
        for(Integer key : keySet){
            if(hm.get(key) > arr.length/3){
                System.out.println(key);
            }
        }
    }
}
