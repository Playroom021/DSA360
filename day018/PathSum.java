class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

class PathSum {

    public static boolean hasPathSum(Node root, int targetSum) {

        if (root == null) {
            return false;
        }

        targetSum = targetSum - root.data;

        if (root.left == null && root.right == null) {
            return targetSum == 0;
        }

        return hasPathSum(root.left, targetSum) ||
               hasPathSum(root.right, targetSum);
    }
}