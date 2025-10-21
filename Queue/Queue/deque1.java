package Queue;
import java.util.*;
import java.util.Deque;  


public class deque1 {
    public static void main(String[] args) {
        Deque<Integer> d=new LinkedList<>();
        d.addFirst(1);
        d.addFirst(2);
        d.addFirst(3);
        System.out.println(d);
        d.removeFirst();
        System.out.println(d);
    }
}
