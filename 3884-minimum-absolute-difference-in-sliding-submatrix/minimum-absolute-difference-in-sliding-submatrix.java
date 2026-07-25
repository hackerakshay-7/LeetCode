class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int ans [][] = new int[m-k+1][n-k+1];

        for(int i = 0;i<=m-k;i++){
            for(int j =0;j<=n-k;j++){
                // traverse along the sub mat
                TreeSet<Integer> set = new TreeSet<>();
                for(int a = i;a<i+k;a++){
                    for(int b = j;b<j+k;b++){
                       set.add(grid[a][b]);
                    }
                }
                if(set.size()==1) ans[i][j]=0;
                else{
                    int mindiff=Integer.MAX_VALUE;
                    Integer prev = null;
                    for(int x : set){
                        if(prev!=null){
                            mindiff=Math.min(mindiff,x-prev);
                        }
                        prev=x;
                    }
                    ans[i][j]=mindiff;
                }

            }
        }
    return ans;}
}