class Solution {
    class Pair{
        int row;
        int col;
        int mask;
        Pair(int row , int col , int mask){
            this.row = row;
            this.col = col;
            this.mask = mask;

        }
    }
    public int shortestPathAllKeys(String[] grid) {
        // came here after daily 
        // trying bfs + state space bitmask
        int m = grid.length;
        int n = grid[0].length();
        int si=-1;
        int sj=-1;
        int keycount =0;
        for(int i =0;i<m;i++){
            for(int j = 0;j<n;j++){
                char c = grid[i].charAt(j);
                if(c=='@'){
                    si=i;
                    sj=j;
                }
                else if( c>='a' && c<='f') keycount++;
            }
        }
        if(keycount==0) return 0;
        int steps =0;
        int req = (1<<keycount)-1; // mask
        // bfs ( row , column ,mask)
        Queue<Pair> q = new ArrayDeque<>();
        q.offer(new Pair(si,sj,0));
        boolean isv[][][] = new boolean[m][n][req+1];
        isv[si][sj][0] = true;
        int [] dr = {-1,1,0,0};
        int dc[] = {0,0,-1,1};
        while(!q.isEmpty()){
            int size = q.size();
            for(int i =0;i<size;i++){
                Pair temp = q.poll();
                int row = temp.row;
                int col = temp.col;
                int mask = temp.mask;
                if(mask==req) return steps;
                for(int k =0;k<4;k++){
                    int newrow = row+dr[k];
                    int newcol = col+dc[k];
                    int newmask = mask;
                    if(newrow >=m || newrow<0 ||
                        newcol>=n || newcol<0) continue;
                    char ch = grid[newrow].charAt(newcol);
                    if(ch>='A' && ch<='F'){
                        int key = ch-'A';
                        if((mask & (1<<key))==0) continue;
                    }
                    if(ch =='#') continue;
                    if(ch>='a' && ch<='f'){
                        // mask it 
                        newmask |= (1<<ch-'a');
                    }
                    if(isv[newrow][newcol][newmask]) continue;
                   isv[newrow][newcol][newmask]=true;
                   q.offer(
                    new Pair(newrow,newcol,newmask)
                   );
                }
            }
            steps++;
        }

   return -1; }
}