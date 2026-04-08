class Solution {
void dfs(int i,ArrayList<ArrayList<Integer>> adj , ArrayList<Integer> temp , int V ,List<List<Integer>> ans)
{
    if(temp.get(temp.size()-1)==V){
        ans.add(new ArrayList<>(temp));
        return;
    }
    for(int a : adj.get(i)){
        temp.add(a);
        dfs(a,adj,temp,V,ans);
        temp.remove(temp.size()-1);
    }

    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i =0;i<graph.length;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<graph.length;i++){
            for(int a : graph[i]){
                adj.get(i).add(a);
            }
        }
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(0);
        dfs(0,adj,temp,graph.length-1,ans);
   return ans; }
}