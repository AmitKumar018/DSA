package Queue;
import java.util.*;
public class usingJCF {
    public static void main(String[] args) {
        // Queue<Integer> ll=new LinkedList<>();
        Queue<Integer> ll=new ArrayDeque<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);

        while(!ll.isEmpty()){
            System.out.println(ll.peek());
             ll.remove();
             
        }      
        
    }
}
