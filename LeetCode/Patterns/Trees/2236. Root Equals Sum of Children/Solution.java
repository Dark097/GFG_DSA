class Solution {
    public boolean checkTree(TreeNode root) {

        if (root == null) return true;

        if (root.left == null && root.right == null) {
            return true;
        }

        int child = 0;

        if (root.left != null) {
            child = child + root.left.val;
        }

        if (root.right != null) {
            child = child + root.right.val;
        }

        if (child != root.val) {
            return false;
        }

        if (!checkTree(root.left)) return false;
        if (!checkTree(root.right)) return false;

        return true;
    }
}