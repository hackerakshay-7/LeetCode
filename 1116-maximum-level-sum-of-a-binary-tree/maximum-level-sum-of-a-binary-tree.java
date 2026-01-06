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
    public int maxLevelSum(TreeNode root) {
        long sum =Integer.MIN_VALUE,rum=0;int count=0,ans=1;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int n = q.size();
            count++;
            for(int i =0;i<n;i++){
            TreeNode temp = q.poll();
            if(temp.left!=null) q.offer(temp.left);
            if(temp.right!=null) q.offer(temp.right);
            rum+=temp.val;}
                if(sum<rum){ sum=rum;ans = count;} rum=0;

        }
   return ans;     
    }
}