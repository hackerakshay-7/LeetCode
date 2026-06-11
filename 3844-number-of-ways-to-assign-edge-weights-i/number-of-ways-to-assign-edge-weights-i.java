class Solution {
    private int dfs(List<List<Integer>> adj , int parent, int node){
        int depth=0;
        for(int neighbour : adj.get(node)){
            if(neighbour!=parent){
                depth=Math.max(depth,dfs(adj,node,neighbour)+1);
            }
        }
        return depth;
    }
    public int assignEdgeWeights(int[][] edges) {
        int MOD = 1000000007;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i =0;i<=edges.length+1;i++){
            adj.add(new ArrayList<>());
        }
        for(int []a : edges){
            adj.get(a[0]).add(a[1]);
            adj.get(a[1]).add(a[0]);
        }
        int max =dfs(adj,0,1);
        if(max==0) return 1;
    return fun(max-1,MOD);}
    private int fun(int max,int mod){
        // without overflow 2^max-1
        long result = 1;
        long base =2;
        while(max>0){
            if(max%2!=0){
                result = (result*base)%mod;
            }
           base = (base*base)%mod;
           max=max/2;
        }
   return (int)result; }
}