class InsertBST{
    public static Node Insert(Node root,int value){
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