// 1. What is the Diameter of a Binary Tree?
// The diameter is the number of edges in the longest path between any two nodes in a binary tree.

import java.util.*;

import java.util.*;

class Node {
    int data;
    Node left;
    Node right;
    Node (int data){
        this.data = data;
        this.left=null;
        this.right = null;
    }
}

class heightCalculation{
    int diameter = 0;

    public static int diameterOfBinaryTree(TreeNode root) {

        height(root);

        return diameter;
    }

    public static int height(TreeNode root) {

        if (root == null) {
            return -1;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        // Diameter passing through current node
        int currentDiameter = leftHeight + rightHeight + 2;

        // Update maximum diameter
        diameter = Math.max(diameter, currentDiameter);

        // Return height
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String []args){
        Node root= new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);

        root.left.left=new Node(40);
        root.left.right=new Node(50);

        System.out.println("Diameter: " + diameterOfBinaryTree(root));
    }
}