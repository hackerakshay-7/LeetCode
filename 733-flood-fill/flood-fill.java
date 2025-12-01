class Solution {
    void dfs(int arr[][],int u,int v,int color,int p){
        if(u>=arr.length || u<0 || v<0 || v>=arr[0].length) return;
    if(arr[u][v]!=p) return;
        arr[u][v]=color;
       dfs(arr,u-1,v,color,p);
      dfs(arr,u+1,v,color,p);
      dfs(arr,u,v-1,color,p);
      dfs(arr,u,v+1,color,p);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
      if(image[sr][sc]==color) return image;
      dfs(image,sr,sc,color,image[sr][sc]);

   return image; }
}