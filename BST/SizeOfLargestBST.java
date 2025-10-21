package BST;

import java.util.*;

public class SizeOfLargestBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    static class Info {
        boolean isBST;
        int size;
        int min;
        int max;

        public Info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    public static int maxBST = 0;

    public static Info largestBst(Node root) {
        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Info leftInfo = largestBst(root.left);
        Info rightInfo = largestBst(root.right);

        int size = leftInfo.size + rightInfo.size + 1;

        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

        if (root.data <= leftInfo.max || root.data >= rightInfo.min) {
            return new Info(false, size, min, max);

        }
        if (leftInfo.isBST && rightInfo.isBST) {
            maxBST = Math.max(maxBST, size);
            return new Info(true, size, min, max);
        }
        return new Info(false, size, min, max);

    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.right = new Node(80);
        root.right.right.left = new Node(65);

        Info info=largestBst(root);
        System.out.println("largest bst is : "+maxBST);
    }
}



// code for node of largest BST
/*package BST;

import java.util.*;

public class SizeOfLargestBST {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static class Info {
        boolean isBST;
        int size;
        int min, max;
        Node root; // root of the largest BST

        public Info(boolean isBST, int size, int min, int max, Node root) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
            this.root = root;
        }
    }

    public static int maxBST = 0;
    public static Node largestBSTRoot = null;

    public static Info largestBst(Node root) {
        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE, null);
        }

        Info leftInfo = largestBst(root.left);
        Info rightInfo = largestBst(root.right);

        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

        // check BST validity
        if (root.data <= leftInfo.max || root.data >= rightInfo.min) {
            return new Info(false, size, min, max, root);
        }

        if (leftInfo.isBST && rightInfo.isBST) {
            // this subtree is a BST
            if (size > maxBST) {
                maxBST = size;
                largestBSTRoot = root; // update root of largest BST
            }
            return new Info(true, size, min, max, root);
        }

        return new Info(false, size, min, max, root);
    }

    // simple inorder traversal to check largest BST contents
    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.right = new Node(80);
        root.right.right.left = new Node(65);

        largestBst(root);

        System.out.println("Largest BST size: " + maxBST);
        System.out.print("Largest BST inorder: ");
        inorder(largestBSTRoot);
    }
}
 */
