package Queue;

import Stack.usingLL;

public class UsingLL {
    static class Node{
        int data;
        Node next;
         
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static class Usingll {
        static Node head=null;
        static Node tail=null;

        public static boolean isEmpty(){
            return head==null && tail==null;
        }


        // add
        public static void add(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;    
            }
            tail.next=newNode;
            tail=newNode;

        }

        // remove
        public static int  remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int front=head.data;
            if(tail==head){
                tail=head=null;
            }else{
                head=head.next;
            }
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return head.data;
        }

    }
    public static void main(String[] args) {
        Usingll ll=new Usingll();
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
