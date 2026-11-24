import java.util.*;

class Node {
    int data;
    Node left,right;
    Node (int data){
        this.data= data;
    }
}

class BalancedBinaryTree02{
    public static boolean isBalanced (Node root){
        
    }

    public static int checkHeight(Node root){
        if (root==null){
            return -1;
        }

        int leftHeight=checkHeight(root.left);

        if(leftHeight == -2){
            return -2;
        }
        
        int rightHeight=checkHeight(root.right);

        if(rightHeight == -2){
            return -2;
        }

        if(Math.abs(leftHeight-rightHeight)>1){
            return -2;
        }

        return 1 +Math.max(leftHeight)
    }

    
    public static void main(String [] args ){
        
    }
}