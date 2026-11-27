class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

class BST {

    public static boolean search(Node root, int key) {

        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        if (key < root.data) {
            return search(root.left, key);
        }

        return search(root.right, key);
    }
}