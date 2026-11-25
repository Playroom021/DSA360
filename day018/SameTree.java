class Node {
    int data;
    Node left , right;
    Node (int data){
        this.data=data;
    }
}

class SameTree{
    public static boolean comparing(Node root1,Node root2){
        if (root1==null && root2==null){
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.data != root2.data) {
            return false;
        }
        return comparing(root1.left,root2.left) &&
            comparing(root1.right,root2.right);
    }
}