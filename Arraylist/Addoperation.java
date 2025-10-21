package Arraylist;
import java.util.ArrayList;
public class Addoperation {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        // O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1,9);
        System.out.println(list);

        // Get operation  O(1)
        int elem=list.get(2);
        int eleme=list.get(1);
        System.out.println(elem);
        System.out.println(eleme);


        // DELETE  O(n)
        list.remove(3);
        System.out.println(list);

        // SET ELEMENT AT INDEX   O(N)
        int l1=list.set(2,6 );
        System.out.println(list);


        // contains element    O(N)
        System.out.println(list.contains(6));
        System.out.println(list.contains(11));
    }
    
}
