// 1. What is a Balanced Binary Tree?

// A binary tree is height-balanced if, for every node, the height difference between its left and right subtrees is at most 1.

import java.util.*;

class Node {
    int data ;
    Node left,right;
    Node (int data ){
        this.data=data;
    }
}

class BalancedBinaryTree01{
    public static int height(Node root){
        if (root==null){
            return -1;
        }
        
        int leftHeight = height(root.left);
        int rightHeight=height(root.right);
        return 1+ Math.max(leftHeight,rightHeight);
        
    }

    public static boolean isBalanced(Node root){
        if (root==null){
            return -1;
        }
        
        int leftHeight = height(root.left);
        int rightHeight=height(root.right);
        // return 1+ Math.max(leftHeight,rightHeight);

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }
        return isBalanced(root.left)
            && isBalanced(root.right);

    }
    
    public static void main (String [] args){
        
    }
    
}