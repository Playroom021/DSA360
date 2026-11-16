class Node {
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class binaryTreeTraversal{
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        preorder(root.left);
        System.out.print(root.data + " ");
        preorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        preorder(root.left);
        preorder(root.right);
        System.out.print(root.data + " ");
    }
    
    public static void main(String[] args){
        Node root= new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);

        root.left.left=new Node(40);
        root.left.right=new Node(50);

        root.right.left=new Node(60);
        root.right.right=new Node(70);

        // System.out.println(root.data);
        // System.out.println(root.left.data);
        // System.out.println(root.right.data);
        // System.out.println(root.left.left.data);
        // System.out.println(root.left.right.data);
        System.out.print("Inorder: ");
        inorder(root);

        System.out.print("\nPreorder: ");
        preorder(root);

        System.out.print("\nPostorder: ");
        postorder(root);
    }
}