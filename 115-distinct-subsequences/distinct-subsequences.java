class Solution {
    //  MEMOIZED ONE
    // private int rec(String s , String t , Integer [][] dp , int i , int j){
    //     if(j==t.length()) {return 1;}
    //     if(i==s.length()) return 0;
    //     if(dp[i][j]!=null) return dp[i][j];
    //     // optimization
    //     // if(s.charAt(i)==t.charAt(j)) {a+=rec(s,t,dp,i+1,j+1,temp.append(s.charAt(i)));
    //    // temp.deleteCharAt(temp.length()-1);}
    //    int a=rec(s,t,dp,i+1,j);
    //    if(s.charAt(i)==t.charAt(j)){ a+=rec(s,t,dp,i+1,j+1);}
    //     return dp[i][j]=a;

    // }
    public int numDistinct(String s, String t) {
        // tabulated one
        int m = s.length();
        int n = t.length();
        int dp[] = new int[n + 1];
        // if it reaches end of t then there is one way
        dp[n] = 1;
        for (int i = m - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if (s.charAt(i) == t.charAt(j))
                    dp[j] += dp[j + 1];
            }
        }

        return dp[0];
    }
}