class Node {
    int data ;
    Node left,right;
    Node(int data){
        this.data=data;
    }
}

class InvertBinaryTree{
    public static Node mirrored (Node root){
        if(root==null){
            return null;
        }

        Node temp = root.left;
        root.left =root.right;
        root.right =temp;

        mirrored(root.left);
        mirrored(root.right);

        return root;
    }
}