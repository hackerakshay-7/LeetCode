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
    // TreeNode solve(TreeNode root,int tar){
    //     if(root.val==tar) return root;
    //     if(root.val>tar){slove(root.left,tar);}
    //     solve()
    // }
    public TreeNode searchBST(TreeNode root, int val) {
       TreeNode temp = root;
       while(temp!=null){
        if(temp.val==val) return temp;
        else if(temp.val<=val){temp=temp.right;}
        else{temp=temp.left;}
       }
    return null;}
}