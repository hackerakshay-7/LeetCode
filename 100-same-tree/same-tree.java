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
     boolean fuc(TreeNode p,TreeNode q){
        if(p==null && q==null) return true;
        else if((p==null && q!=null) || (p!=null && q==null)) return false;
        if(p.val==q.val){
            boolean left = fuc(p.left,q.left);
            boolean right = fuc(p.right,q.right);
            return left&&right;}
            return false;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
       return fuc(p,q);
    }
}
 