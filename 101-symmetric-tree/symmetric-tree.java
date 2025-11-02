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
    boolean isfk(TreeNode m,TreeNode n){
        if(m==null && n==null) return true;
         if((m==null&&n!=null)||(m!=null && n==null)) return false;
         if(m.val!=n.val){ return false;}
         boolean l=isfk(m.left,n.right);
         boolean r=isfk(m.right,n.left);
       
         return l&&r;
    }
    public boolean isSymmetric(TreeNode root) {
        return isfk(root.left,root.right);
    }
}