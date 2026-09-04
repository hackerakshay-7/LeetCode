class Solution {
    //  SACHIN TICHKULE
    class Pair{
        int sum;
        int count;
        Pair(int sum , int count){
            this.sum = sum;
            this.count=count;
        }
    }
    Pair dp [][];
    int MOD = 1000_000_007;
    // without isv hoskta hai i guess as the path is uniformly upar and left
    private Pair hbdkrishna(List<String> grid , int i , int j){
        if(i<0 || j<0 || grid.get(i).charAt(j)=='X') return new Pair(-1,0);
        if(grid.get(i).charAt(j)=='E') return new Pair(0,1);
         // net sum will be zero and there is one way to reach there
        if(dp[i][j]!=null) return dp[i][j];

        
        Pair left = hbdkrishna(grid,i,j-1);
        Pair dia = hbdkrishna(grid,i-1,j-1);
        Pair up = hbdkrishna(grid,i-1,j);

        int bestsum=-1;
        int count =0;
        if(left!=null){
            if(left.sum>bestsum){
                bestsum=left.sum;
                count=left.count;
            }
            else if(left.sum==bestsum) count= (count+left.count)%MOD;
        }
        if(dia!=null){
            if(dia.sum>bestsum){
                bestsum = dia.sum;
                count = dia.count;
            }
            else if(dia.sum==bestsum) count=(count+dia.count)%MOD;
        }
        if(up!=null){
            if(up.sum>bestsum){
                bestsum=up.sum;
                count = up.count;
            }
            else if(up.sum==bestsum) count=(count+up.count)%MOD;
        }
        int val = grid.get(i).charAt(j) =='S'?0:grid.get(i).charAt(j)-'0';
        if(bestsum==-1) return dp[i][j] =new Pair(-1,0);
        return dp[i][j] = new Pair(bestsum+val,count);
    }
    // max sum 
    // num of paths having maxsum
    public int[] pathsWithMaxScore(List<String> board) {
        int m = board.size();
        int n = board.get(0).length();
        dp = new Pair[m][n];
       Pair ans = hbdkrishna(board,m-1,n-1);
        if(ans ==null || ans.sum==-1) return new int []{0,0};
        return new int[]{ans.sum,ans.count};
    }
}