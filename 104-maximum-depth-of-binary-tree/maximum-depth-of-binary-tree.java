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
    int right(TreeNode r){
        if(r==null) return 0;
      int left=  right(r.left);
        int righ=right(r.right);
        return Math.max(left,righ)+1;
    }
    
    public int maxDepth(TreeNode root) {
       // if(root == null) return null;
    //    int x = Math.max(right(root,0),left(root,0));
    return right(root);}
}