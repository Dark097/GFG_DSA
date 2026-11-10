/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}*/

class Solution {
    public int height(Node root) {
        if (root == null){
            return -1;
        }

        int l =height(root.left);
        int r = height(root.right);

        return 1+Math.max(l,r);

    }
}