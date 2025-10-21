package Arraylist;
import java.util.ArrayList;
import java.util.Collections;

public class Sortarrylist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(6);
        list.add(9);
        System.out.println(list);
        Collections.sort(list); //Ascending order
        System.out.println(list);

        // descending order
        Collections.sort(list, Collections.reverseOrder());

        // reverseORDER is a comaprator function for fixing the logic in java
        System.out.println(list);
    }
}
