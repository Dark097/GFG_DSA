/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> wraplist = new LinkedList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        if (root == null)
            return wraplist;
        q.offer(root);
        int count=0;
        while (!q.isEmpty()) {
            List<Integer> sublist = new LinkedList<Integer>();
            int levelnum = q.size();
            
            for (int i = 0; i < levelnum; i++) {
                if (q.peek().left != null)
                    q.offer(q.peek().left);
                if (q.peek().right != null)
                    q.offer(q.peek().right);
                sublist.add(q.poll().val);
            }

            if(count%2!=0){
            Collections.reverse(sublist);
            }
            wraplist.add(sublist);
            count =count+1;
        }
        return wraplist;
    }
}