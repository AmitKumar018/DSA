package Arraylist;
import java.util.ArrayList;

public class Size {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        // O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1,9);
        System.out.println(list.size());

        // Iteration
        for(int i=0; i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
