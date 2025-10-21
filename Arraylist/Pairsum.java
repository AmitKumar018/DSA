package Arraylist;
import java.util.ArrayList;

// Brute force -O(N^2)
public class Pairsum {
//     public static boolean pairSum(ArrayList<Integer> list,int target){
        
//         for(int i=0; i<list.size(); i++){
//             for(int j=i+1; j<list.size(); j++){
//                 int sum=list.get(i)+list.get(j);

//                 if(target==sum){
//                     return true;

//                     // for printing the expected pair
//                     // System.out.print(list.get(i)+" "+list.get(j));
//                 }
//             }
//             // System.out.println();
//         }
//         return false;
//     }

// 2-pointer Approach
public static boolean pairSumtwo(ArrayList<Integer> list,int target){
    int lp=0;
    int rp=list.size()-1;
    while(lp!=rp){
        if(list.get(lp)+list.get(rp)==target){
            return true;
        }else if(list.get(lp)+list.get(rp)<target){
            lp++;
        }else{
            rp--;
        }
    }
    return false;
}
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target=5;
        System.out.println(pairSumtwo(list,target));
        
    }
}
