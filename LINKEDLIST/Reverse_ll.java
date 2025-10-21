package LINKEDLIST;
import java.util.*;
public class Reverse_ll {
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
    

    // ADD FIRST
    public void addFirst(int data){
        Node newNode=new Node(data);
       
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    
    }
// REVERSING A LL.(O(N))
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr != null){
           next=curr.next;
           curr.next=prev;
           prev=curr;
           curr=next; 
        }
        head=prev;
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
        Reverse_ll ll=new Reverse_ll();
        
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.print();
        ll.reverse();
        ll.print();
        
    }
}
