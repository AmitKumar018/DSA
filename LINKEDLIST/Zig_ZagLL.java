package LINKEDLIST;
import java.util.*;
public class Zig_ZagLL {
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


    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }
    public void zigzag(){
        //find mid
        Node slow=head;
        Node fast=head.next;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;

        // reverse 2nd half

        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node left=head;
        Node right=prev;
        Node nextLeft, nextRight;
        while(left != null && right != null){
            nextLeft=left.next;
            left.next=right;
            nextRight =right.next;
            right.next=nextLeft;
// updation condition
            right=nextRight;
            left=nextLeft;
        }

        // alternate merging
    }
    public void print() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
         Zig_ZagLL ll=new Zig_ZagLL();
         ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.print();
        ll.zigzag();
        ll.print();
        
    }
}
