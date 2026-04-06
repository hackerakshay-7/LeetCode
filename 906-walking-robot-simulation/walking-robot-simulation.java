class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
           int maxDist = 0;
        int x = 0, y = 0;

        // Store obstacles efficiently
        Set<Long> set = new HashSet<>();
        for (int[] o : obstacles) {
            long key = (((long) o[0]) << 32) | (o[1] & 0xffffffffL);
            set.add(key);
        }

        // Directions: N, E, S, W
        int[] dirx = {0, 1, 0, -1};
        int[] diry = {1, 0, -1, 0};
        int index = 0;

        for (int cmd : commands) {

            if (cmd == -1) {
                index = (index + 1) % 4; // turn right

            } else if (cmd == -2) {
                index = (index + 3) % 4; // turn left

            } else {
                for (int i = 0; i < cmd; i++) {

                    int nx = x + dirx[index];
                    int ny = y + diry[index];

                    long key = (((long) nx) << 32) | (ny & 0xffffffffL);

                    // ✅ check BEFORE moving
                    if (set.contains(key)) break;

                    x = nx;
                    y = ny;

                    maxDist = Math.max(maxDist, x * x + y * y);
                }
            }
        }

        return maxDist;
       }
}


/*  // n -> move above e-> move right s->down w -> ulta x
        int an =0;
       int ans [] = {0,0};
       HashSet<String> set = new HashSet<>();
        for(int a []: obstacles){
            set.add(a[0]+","+a[1]);
        }
        int dirx[] = {0,1,0,-1};
        int diry[] = {1,0,-1,0};
        int index = 0;
       for(int a : commands){
            if(a==-1){
                // direction to rigth
                index = (index+1)%4;
            }
            else if( a==-2){
                // direction to left3
                index = (index +3 )%4;
            }
            else{
                for(int i =0 ; i< a ;i++){
                    int nx = ans[0] + dirx[index];
                    int ny = ans[1] + diry[index];

                    if(set.contains(ans[0]+","+ans[1])) break;
                    ans[0]=nx;
                    ans[1]=ny;
                    an = Math.max(an,(ans[0]*ans[0])+(ans[1]*ans[1]));
                }
            }

       }

   return an */