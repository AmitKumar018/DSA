package LINKEDLIST;
import java.util.*;
public class Find_and_removenode_end {
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
    //public static int size;

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

    // find and remove from end

    public void deleteNthFomrEnd(int n){
        int size=0;
        Node temp=head;
        while(temp != null){
            temp=temp.next;
            size++;
        }
        if(n==size){
            head=head.next;
            return;  //remove first operation

        }
       int idx=1; 
       int idxToFind=size-n;
       Node prev=head;
       while(idx < idxToFind){
            prev=prev.next;
            idx++;
       }
       prev.next=prev.next.next;
       return;
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
        Find_and_removenode_end ll=new Find_and_removenode_end();
        
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.print();
        ll.deleteNthFomrEnd(3);
        ll.print();
        
       
        
    }
}
