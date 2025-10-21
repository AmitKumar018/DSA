package BST;

import java.util.*;

public class ValidBst {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;

        }
    }

    public static Node insertOne(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (root.data > val) {
            root.left = insertOne(root.left, val);
        } else {
            root.right = insertOne(root.right, val);
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

    public static boolean isValidBST(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.data <= min.data) {
            return false;

        } else if (max != null && root.data >= max.data) {
            return false;
        }
        // now for both the subtrees
        return isValidBST(root.left, min, root)
                && isValidBST(root.right, root, max);

    }

    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 6, 1, 4, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insertOne(root, values[i]);
        }
        inorder(root);
        System.out.println();

        if(isValidBST(root, null, null)){
            System.out.println("valid");
        }else{
            System.out.println("invalid");
        }
    }
}
