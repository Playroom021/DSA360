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

class depthCalculation{
    public static int depth(Node root){
        if (root == null){
            return -1;
        }
        int leftdepth = depth(root.left);
        int rightdepth=depth(root.right);
        return 1+ Math.max(leftdepth,rightdepth);
        
    }
    public static void main(String []args){
        Node root= new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);

        root.left.left=new Node(40);
        root.left.right=new Node(50);

        System.out.println("depth: " + depth(root));
    }
}