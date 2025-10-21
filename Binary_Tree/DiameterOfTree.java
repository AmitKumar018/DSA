package Binary_Tree;
import java.util.*;
public class DiameterOfTree {
    static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.left=null;
            this.right=null;
            this.data=data;
        }

    }

    //method-1

    // public static int height(Node root){
    //     if(root==null){
    //         return 0;
    //     }
    //     int lh=height(root.left);
    //     int rh=height(root.right);
    //     return Math.max(lh,rh)+1;
    // }

    // public static int diameter(Node root){
    //     if(root==null){
    //         return 0;
    //     }
    //     int leftdiam=diameter(root.left);
    //     int leftht=height(root.left);
    //     int rightdiam=diameter(root.right);
    //     int rightht=height(root.right);
    //     int selfDiam=leftht+rightht+1;
    //     return Math.max(selfDiam, Math.max(leftdiam,rightdiam));
    // }



    // METHOD-2
    static class info{   //O(N)
        int diam;
        int ht;
        public info(int diam, int ht){
            this.diam=diam;
            this.ht=ht;
        }
    }

    public static info diameter(Node root){
        if(root==null){
            return new info(0,0);
        }
        info leftInfo=diameter(root.left);
        info rightInfo=diameter(root.right);

        int diam=Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht+rightInfo.ht+1);
        int ht=Math.max(leftInfo.ht, rightInfo.ht)+1;

        return new info(diam,ht);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.right.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right.right=new Node(7);
        //System.out.println(diameter(root));
        System.out.println(diameter(root).diam);
    }
}
