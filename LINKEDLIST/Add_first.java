package LINKEDLIST;
import java.util.*;
public class Add_first {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    // for checking the size
    public static int size;
    // ADD FIRST
    public void addFirst(int data){
        // step-1
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
       
        // step-2
        newNode.next=head;
        // Step-3
        head=newNode;

    
    }
    // ADD LAST
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    // ADD IN MIDDLE
    public void addmiddle(int idx,int data){
    
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i < idx-1){
            temp=temp.next;
            i++;
        }
        // when i=idx-1
        newNode.next=temp.next;
        temp.next=newNode;
        }

        // REMOVE FIRST ELEMENT
        public int removeFirst(){
            if(size==0){
              System.out.println("empty");  
              return Integer.MAX_VALUE;
            }else if(size==1){
                int val=head.data;
                head=tail=null;
                size=0;
                return val;
            }
            int val=head.data;
            head=head.next;
            size--;
            return val;
        }

        // REMOVE LAST
        public int removeLast(){
            if(size==0){
                System.out.println("ll is empty");
                return Integer.MIN_VALUE;
            }else if(size==1){
                int val=head.data;
                head=tail=null;
                size=0;
                return val;
            }
            Node prev=head;
            for(int i=0; i<size-2; i++){
                prev=prev.next;
            }
            int val=prev.next.data;
            prev.next=null;
            tail=prev;
            size--;
            return val;
        }
        public int itrSearch(int key){
        Node temp=head;
        int i=0;
        while(temp != null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
        
    // for printing
    public void print(){
        if(head==null){
            System.out.println("linkedlist is empty");
            return;
        }
       Node temp=head;
       while(temp != null){
        System.out.print(temp.data+"->");
        temp=temp.next;
        
       }
       System.out.println("null");
    }
    public static void main(String[] args) {
        Add_first ll=new Add_first();
        
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addmiddle(2,5);
        // ll.removeFirst();
        // ll.print();
        // ll.removeLast();
        ll.print();
        System.out.println(ll.size);
    }
}
