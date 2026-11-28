class Node {
    int data
    Node left,right;
    Node (int data){
        this.data=data;
    }
}

public class DeleteNode{
    public static Node findMin(Node root){
        if (root==null){
            return null;
        }
        while (root.left != null){
            root = root.left;
        }
        return root;
    }
    public static Node delete(Node root, int key){
        if (root == null){
            return null;
        }

        if (key <root.data){
            root.left = delete(root.left,key);;
        }
        else if (key>root.data){
            root.right = delete(root.right,key);
        }
        else {
            if(root.left==null){
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }

            node sussessor =findMin(root.right);

            root.data = sussessor.data;

            root.right = delete(root.right, sussessor.data);
        }
        return root; 
    }
}
