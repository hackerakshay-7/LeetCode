class Solution {
   void fun(TreeNode n,List<List<Integer>> win){
        if(n==null) return;
         Queue<TreeNode> q=new LinkedList<>();
          q.offer(n);
        while(!q.isEmpty()){
            int p=q.size();
            ArrayList<Integer> l = new ArrayList<>();
            for(int i=0;i<p;i++){
                TreeNode t = q.poll();
                l.add(t.val);
               if(t.left!=null) q.offer(t.left);
               if(t.right!=null) q.offer(t.right);
            } win.add(l);
           //  win.add(new ArrayList<>(l)); //l.clear();
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        fun(root, ans);
    return ans;}
}