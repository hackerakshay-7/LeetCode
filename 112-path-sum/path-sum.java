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
     boolean fun(TreeNode root, int target){
        if(root==null) return false;
        if((root.left==null && root.right==null) && target-root.val==0) return true;
        boolean left =fun(root.left,target-root.val);
        boolean right=fun(root.right,target-root.val);
        return left||right;
     }
    public boolean hasPathSum(TreeNode root, int targetSum) {
     return fun(root,targetSum);   
    }
}