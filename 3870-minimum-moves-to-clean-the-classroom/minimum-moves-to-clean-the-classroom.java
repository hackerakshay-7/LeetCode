class Solution {
    // OH WHAT A TROUBLE
    public int minMoves(String[] grid, int energy) {
        // bfs + state space tree it is ->
        int m = grid.length;
        int n = grid[0].length();
        int sr =-1;
        int sc=-1;
        int littercount=0;
        // which pos of  bit belongs to the litter L is litterrank[r][c]
        int litterrank [][] = new int[m][n];
        for(int []a : litterrank){
            Arrays.fill(a,-1);
        }
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                char c = grid[i].charAt(j);
                if(c =='S'){
                    sr=i;
                    sc=j;
                }
                else if( c=='L'){
                    litterrank[i][j]=littercount++;
                }
            }
        }
        if(littercount==0) return 0;
        int req = (1<<littercount)-1;
        int steps =0;
        Queue<int []> q = new ArrayDeque<>();
        // have we seen the exact state previously
        // arr[r][c][energy][mask]
        boolean isv [][][][] = new boolean [m][n][energy+1][req+1];
        q.offer(
            new int[]{
                sr,sc,energy,0
            });
        // startpos , current energy , litters acquired
        isv[sr][sc][energy][0]=true;
        // bfs coz gpt said
        int dr[] = { -1,1,0,0};
        int dc[] = { 0,0,-1,1};
        while(!q.isEmpty()){
            int size = q.size();
            while(size-->0){
                int [] temp = q.poll();
                int r = temp[0];
                int c = temp[1];
                int e = temp[2];
                int mask = temp[3];

                if(mask==req) return steps;
                if(e==0) continue;
                // trying all four directions
                for(int i =0;i<4;i++){
                    int row = r+dr[i];
                    int col = c+dc[i];
                    // boundary check
                    if(row>=m || col>=n || row<0 || col<0) continue;
                    if(grid[row].charAt(col)=='X') continue;
                    int newenergy = e-1;
                    if(grid[row].charAt(col)=='R'){ newenergy = energy;}
                    int nmask = mask;
                    if(grid[row].charAt(col)=='L'){
                        // **********
                        nmask= nmask| (1<<litterrank[row][col]);
                    }
                    if(isv[row][col][newenergy][nmask]) continue;
                    isv[row][col][newenergy][nmask] = true;
                    q.offer(
                        new int[]{
                            row,col,newenergy,nmask
                        }
                    );
                }
            }
            steps++;
        }
        return -1;
    }
}
/**


lass Solution {
    private int dfs(String [] grid , boolean [][] isv , int e ,int i , int j , int mx){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length() || e<=0 || isv[i][j] || grid[i].charAt(j)=='X')
            return 0;
            isv[i][j] = true;
        if(grid[i].charAt(j)=='R') e = mx;
        int left = dfs(grid,isv,e-1,i,j-1,mx);
         int right = dfs(grid,isv,e-1,i,j+1,mx);
          int up = dfs(grid,isv,e-1,i-1,j,mx);
           int down = dfs(grid,isv,e-1,i+1,j,mx);
        return Math.min(left,Math.min(right,Math.min(up,down)))+1;

    }
    public int minMoves(String[] classroom, int energy) {
        int m = classroom.length;
        int n = classroom[0].length();
        boolean isv [][] = new boolean[m][n];
        int ans =-1;
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                if(classroom[i].charAt(j)=='S') 
              ans = dfs(classroom , isv , energy , i , j , energy);
            }
        }
         for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                if(classroom[i].charAt(j)=='L' && !isv[i][j]) return -1; 
            }
        }


    return ans;}
} */