class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

class InsertBST{
    public static Node insert(Node root,int value){
        // case1 ; at root 
        if (root==null){
            return new Node(value);
        }
        // Go left
        if (value < root.data) {
            root.left = insert(root.left, value);
        }

        // Go right
        else if (value > root.data) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    public static void printInorder(Node root){
        if(root == null){
            return ;
        }

        printInorder(root.left);
        System.out.print (root.data + " ");
        printInorder(root.right);

    }
    public static void main(String [] args){
        Node root = null;

        int[] values = {45, 25, 65, 15, 35, 55, 75};
        Node root2= null;
        for(int value :values){
            root2= insert(root2,value);
        }
        root2 = insert(root2,30);
        
        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 70);
        root = insert(root, 20);
        root = insert(root, 40);
        root = insert(root, 60);
        root = insert(root, 80);

        root = insert(root, 35);

        // printInorder(root);
        printInorder(root2);
    }
}