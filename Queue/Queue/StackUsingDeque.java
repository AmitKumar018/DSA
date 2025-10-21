package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class StackUsingDeque {
    static class stack{
        Deque<Integer> deq=new LinkedList<>();

        public void push(int data){
            deq.addLast(data);
        }

        public int pop(){
            return deq.removeLast();
        }

        public int peek(){
            return deq.getLast();
        }
    }
    public static void main(String[] args) {
         stack s=new stack();
         s.push(1);
         s.push(2);
         s.push(3);

         System.out.println("peek: "+s.peek());
         System.out.println(s.pop());
         System.out.println(s.pop());
         System.out.println(s.pop());
    }
}
