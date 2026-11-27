class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}


class LowestCommonAncestor {

    public static Node findLCA(Node root, Node p, Node q) {

        // Case 1: root is null
        if (root == null) {
            return null;
        }
        // Case 2: root is p or q
        if (root==p||root==q) {
            return root;
        }
        // Case 3: Search left and right
        Node leftResult = findLCA(root.left, p, q);
        Node rightResult = findLCA(root.right, p, q);

        // Case 4: Decide what to return
        if (leftResult != null && rightResult != null){
            return root;
        }
        if (leftResult!=null) {
            return leftResult;
        }
        return rightResult;
    }
}
