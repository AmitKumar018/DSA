package Arraylist;

import java.util.*;

public class Pairsum_2 {
    // public static void pairsum2(ArrayList<Integer> list, int target){
    // for(int i=0; i<list.size(); i++){
    // for(int j=i+1; j<list.size(); j++){
    // int sum=list.get(i)+list.get(j);

    // if(sum==target){
    // System.out.print("("+list.get(i)+","+list.get(j)+")");
    // }
    // }
    // System.out.println();
    // }
    // }

    // WITH PIVOT POINTER---O(n)
    public static boolean pairsum2(ArrayList<Integer> list, int target) {
        int pivot = -1;
        int n = list.size();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                pivot = i;
                break;
            }
        }
        int lp = pivot + 1;
        int rp = pivot;
        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            } else {
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 210;
        System.out.println(pairsum2(list, target));
    }
}
