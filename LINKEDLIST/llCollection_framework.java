package LINKEDLIST;
import java.util.LinkedList;
public class llCollection_framework {
    public static void main(String[] args) {
        // create 

        LinkedList<Integer> ll=new LinkedList();

        ll.addFirst(3);
        ll.addLast(5);
        ll.addFirst(2);
        System.out.println(ll);

        ll.removeLast();
        System.out.println(ll);
    }
}
