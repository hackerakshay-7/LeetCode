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
    class Pair{
        int sum;
        int count;
        Pair(int sum , int count){
            this.sum = sum;
            this.count = count;
        }
    }
    int counter =0;
    private Pair fun(TreeNode root){
        if(root==null) return new Pair(0,0);
        Pair left=fun(root.left);
        Pair right = fun(root.right);
        int sum = left.sum+right.sum+root.val;
        int num = left.count+right.count+1;
        if((sum/num)==root.val) counter++;
        return new Pair(sum,num);
    }
    public int averageOfSubtree(TreeNode root) {
        fun(root);
        return counter;
    }
}