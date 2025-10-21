package Stack;

public class usingLL {
   static class Node{
            int data;
            Node next;

            Node(int data){
                this.data=data;
                this.next=null;
            }
    } 
    static class linkedlist{
        static Node head=null;

        // empty
        public static boolean isEmpty(){
            return head==null;
        };

        // push
        public static void push(int data){
            Node newNode=new Node(data);

            newNode.next=head;
            head=newNode;
        } 

        // pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }

        public static int peek(){
             if(isEmpty()){
                return -1;
            }
            return head.data;
        }

    }
   public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.push(1);
        ll.push(2);
        ll.push(3);

        while(!ll.isEmpty()){
            System.out.println(ll.peek());
            ll.pop();
        }
   } 
}
