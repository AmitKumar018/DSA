package LINKEDLIST;
import java.util.*;
public class Itrative {
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

    // Iterative search
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

    // Recursive search
    public int helper(Node head, int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }

        int idx=helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    
    public int recursive(int key){
        return helper(head,key);
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
        Itrative ll=new Itrative();
        
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addmiddle(2,5);
        ll.print();
        // System.out.println(ll.itrSearch(5));
        // System.out.println(ll.itrSearch(10));

        System.out.println(ll.recursive(5));
        System.out.println(ll.recursive(10));
        // System.out.println(ll.size);
    }
}
