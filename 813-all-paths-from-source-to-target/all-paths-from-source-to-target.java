class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        boolean [] isv = new boolean[graph.length];
        dfs(0,graph.length-1,ans,temp,isv,graph);
   return ans; }
   void dfs(int src , int des , List<List<Integer>> ans , List<Integer> temp , boolean[] isv,int[][] graph){
    isv[src]=true;
    temp.add(src);
    if(src==des) ans.add(new ArrayList<>(temp));
    for(int a : graph[src]){
        if(!isv[a]) dfs(a,des,ans,temp,isv,graph);
    }
     temp.remove(temp.size()-1);
     isv[src]=false;
   }
}