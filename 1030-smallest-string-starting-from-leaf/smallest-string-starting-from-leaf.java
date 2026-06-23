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
    String ans=null;
    private void dfs( TreeNode root, StringBuilder s) {
        if (root == null)
            return;
        s.append((char) (root.val + 'a'));
        if (root.left == null && root.right == null) {
            String gu = (new StringBuilder(s).reverse()).toString();
            if (ans == null || gu.compareTo(ans) < 0){
                ans=gu;}
                 s.deleteCharAt(s.length() - 1);
            return;
        } else {
            dfs(root.left, s);
            dfs(root.right, s);
        }
        s.deleteCharAt(s.length() - 1);
    }

    public String smallestFromLeaf(TreeNode root) {
        dfs(root,new StringBuilder());
        return ans;
    }
}