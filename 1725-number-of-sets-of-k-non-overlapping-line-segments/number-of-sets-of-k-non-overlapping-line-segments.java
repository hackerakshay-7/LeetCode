class Solution {
     Integer dp [][];
    private static final int Mod = 1000_000_007;
    // private int memo(int n ,int k , int i){
    //     if(i>=n) return 0;
    //     if(k==0) return 1;
    //     if(dp[i][k]!=null) return dp[i][k];
    //     int notpick = memo(n,k,i+1)%Mod;
    //     int pick=0;
    //     for(int j =i+1;j<n;j++){
    //         pick+=(memo(n,k-1,j)%Mod);
    //     }
    //     return dp[i][k]=(pick+notpick)%Mod;
    // }
    public int numberOfSets(int n, int k) {
        // this tabulation is all gods grace
        dp = new Integer[k+1][n+1];
        for(int i =0;i<n;i++){
            dp[0][i]=1;
        }
       //return memo(n,k,0);
       for(int fuck=1;fuck<=k;fuck++){
        int prefix[] = new int[n+1];
        for(int z =n-1;z>=0;z--){
            prefix[z]=(prefix[z+1]+dp[fuck-1][z])%Mod;
        }
        dp[fuck][n]=0;
        for(int i =n-1;i>=0;i--){
            int take = prefix[i+1];
            int skip = dp[fuck][i+1]%Mod;
            dp[fuck][i]= (take+skip)%Mod;
        }
       }

    return dp[k][0];}
}