class Node {
    int data;
    Node left ,right;
    Node(int data){
        this.data=data;
    }
}
public class Find{
    public static Node FindMin(Node root){
        if (root==null){
            return null;
        }
        while (root.left != null){
            root = root.left;
        }
        return root;
    }

    public static Node FindMax(Node root){
        if (root==null){
            return null;
        }
        while (root.right != null){
            root = root.right;
        }
        return root;
    }

    
}