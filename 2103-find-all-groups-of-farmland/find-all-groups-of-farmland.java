class Solution {
    private void dfs(int r , int c , int [][] arr ,int temp[],boolean[][]isv){
     if(r<0 || c==-1||r==arr.length || c==arr[0].length || arr[r][c]==0 ||isv[r][c] ) return;
        isv[r][c]=true;
      
        if(arr[r][c]==1){
           if(temp[0]==-1){temp[0]=r;temp[1]=c;}
           temp[2]=Math.max(temp[2],r);
           temp[3]=Math.max(temp[3],c);
        dfs(r+1,c,arr,temp,isv);
        dfs(r,c+1,arr,temp,isv);
       }
    }

    public int[][] findFarmland(int[][] land) {
        List<int []> list = new ArrayList<>();
        boolean isv[][] = new boolean[land.length][land[0].length];
         for(int i =0;i<land.length;i++){
            for(int j = 0;j<land[0].length;j++){
                int temp[] = {-1,-1,-1,-1};
              if(!isv[i][j] && land[i][j]==1) {dfs(i,j,land,temp,isv);
               if(temp[0]!=-1 && temp[2]!=-1)
           list.add(new int [] {temp[0],temp[1],temp[2],temp[3]});}
              
            }
         }
         int ans [][] = new int [list.size()][4];
         for(int i =0;i<list.size();i++){
            ans[i]=list.get(i);
         }
  return ans;  }
}