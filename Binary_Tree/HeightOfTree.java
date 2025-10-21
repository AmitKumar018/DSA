package Binary_Tree;
import java.util.*;

public class HeightOfTree {
    static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        return Math.max(leftHeight,rightHeight)+1;
    }


    // count of Nodes

    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftCount=countNodes(root.left);
        int rightcount=countNodes(root.right);
        int totalcount=leftCount+rightcount+1;
        return totalcount;
    }


    // SUM OF NODES
    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        int leftSum=sum(root.left);
        int rightSum=sum(root.right);
        return leftSum+rightSum+root.data;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.right.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right.right=new Node(7);
        //System.out.println(height(root));
        //System.out.println(countNodes(root));

        System.out.println(sum(root));

    }
}
