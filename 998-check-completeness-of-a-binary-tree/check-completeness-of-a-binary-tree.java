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
    // ill fkn bfs it
    public boolean isCompleteTree(TreeNode root) {
        // array deque doesnt allow null
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean isnull=false;
        while (!q.isEmpty()) {
            TreeNode temp =q.poll();
            if(temp==null) { isnull=true; continue;}
            if(isnull) return false;
            q.offer(temp.left);
            q.offer(temp.right);
        }
        return true;
    }
}
/**
 for (int i = 0; i < n; i++) {
                TreeNode temp = q.poll();
                if (temp.left == null && temp.right == null)
                    continue;
                if ((temp.left == null && temp.right != null))
                    return false;
                if (temp.right == null && temp.left.left != null || temp.left.right != null)
                    return false;
                if (temp.left != null)
                    q.offer(temp.left);
                if (temp.right != null)
                    q.offer(temp.right);
            } */