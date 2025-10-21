package BST;
import java.util.*;
public class BstSearch {
    static class Node{
        int data;
        Node left; 
        Node right;
        Node (int data){
            this.data=data;
        }
    }

    public static Node  insertone(Node root, int val){
        if(root==null){
            return new Node(val);
        }
        if(root.data>val){
            root.left=insertone(root.left, val);
        }else{
            root.right=insertone(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " "); 
        inorder(root.right);
    }

    public static boolean Search(Node root, int key){       //TC={O(H)}
        if(root==null){
            return false;
        }

        if(root.data==key){
            return true;
        }

        if(root.data>key){
            return Search(root.left, key);
        }

        else{
            return Search(root.right, key);
        }
    }


    // delete a node
    public static Node delete(Node root, int val){
        if(root.data <val){
            root.right=delete(root.right, val);
        }else if(root.data>val){
            root.left=delete(root.left,val);
        }
        else{
            // case-1  leaf node
            if(root.left == null && root.right == null){
                return null;
            }
            // case-2 single child
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }

            // case-3 both children

            Node INordSuccess=findInOrderSuccessor(root.right);
            root.data=INordSuccess.data;
            root.right=delete(root.right, INordSuccess.data);
        }
        return root;
    }


    //PRINT IN RANGE

    public static void printInRange(Node root, int k1, int k2){
        if(root==null){
            return;
        }
        if(root.data >= k1 && root.data <= k2){
            printInRange(root.left, k1, k2);
            System.out.println(root.data+" ");

            printInRange(root.right, k1, k2);
        }
        else if(root.data < k1){
            printInRange(root.left, k1, k2);
        }else{
            printInRange(root.right, k1, k2);
        }
    }

    public static Node findInOrderSuccessor(Node root){
        while(root.left != null){
            root=root.left;
        }
        return root;
    }



    // ROOT TO LEAF
    public static void printPath(ArrayList<Integer> path){
        for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i)+"-> ");
        }
        System.out.println("null");
    }

    public static void printRoot2Leaf(Node root, ArrayList<Integer> path){
        
         if(root==null){
            return;
        }
        path.add(root.data);
       
        if(root.left == null && root.right==null){
           printPath(path);
        }
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
        path.remove(path.size()-1);
    }



    public static void main(String[] args) {
        int values[]={8,5,3,6,1,4,10,11,14};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insertone(root,values[i]);
        }

        // System.out.print("Inorder Traversal (Sorted):");
        // inorder(root);

        // if(Search(root,7)){
        //     System.out.println("found");
        // }
        // else{
        //     System.out.println("not found");
        // }

        // root=delete(root, 5);
        // System.out.println();

        // inorder(root);

        //printInRange(root, 5, 12);

        printRoot2Leaf(root, new ArrayList<>());
    }
}
