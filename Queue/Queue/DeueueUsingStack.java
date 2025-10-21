package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class DeueueUsingStack {
    static class queue{
        Deque<Integer> d1=new LinkedList<>();

        public void push(int data){
            d1.addLast(data);
        }

        public int pop(){
            return d1.removeFirst();
        }

        public int peek(){
            return d1.getFirst();
        }
    }
    public static void main(String[] args) {
        queue q1=new queue();
        q1.push(1);
         q1.push(2);
         q1.push(3);
          q1.push(4);
          
          System.out.println("peek : "+q1.peek());
          System.out.println(q1.pop());
         System.out.println(q1.pop());
         System.out.println(q1.pop());

    }
}
