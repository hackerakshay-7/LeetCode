class Solution {
   private static final int MOD = 1000_000_007;
    // private int dfs(boolean isv[], String s, StringBuilder temp, int i) {
    //     if (i == s.length()) {
    //         return 1;
    //     }
    //     if (temp.length() == 0 && isv[s.charAt(i) - 'a'])
    //         return dfs(isv, s, temp, i + 1);
    //     if (temp.length() == 0)
    //         isv[s.charAt(i) - 'a'] = true;
    //     //pick
    //     temp.append(s.charAt(i));
    //     int a = dfs(isv, s, temp, i + 1);
    //     temp.deleteCharAt(temp.length() - 1);
    //     // not pick
    //     int b = dfs(isv, s, temp, i + 1);
    //     return a + b;
    // }

    // MY RECURSION DOES -> (OLD SUB-S) + (OLD SUB-S + CURR CHAR)
    // THERFORE NEW = 2*OLD
    // IF THE CHARACTER IS NEW SUBTRACT NONE(0)
    // SUBTRACT THE CHARACTER THAT NUM OF TIMES AS MANY TIMES IT HAS APPEARD
    // AS OF THE DRAWN TREE AND THE INSIGHT
    // NOT GONNA USE THIS ILL CONNTINUE MINE

    public int distinctSubseqII(String s) {
        int dp[] = new int[s.length()];
        Arrays.fill(dp,-2);
       return hughie(dp,s,0);

    }
    private int hughie(int dp[],String s , int i){
        if(i==s.length()) return 0;
        if(dp[i]!=-2) return dp[i];
        boolean isv [] = new boolean[26];
        long ans =0;
        for(int j =i;j<s.length();j++){
            int a = s.charAt(j)-'a';
            if(isv[a]) continue;
            isv[a]=true;
            ans+=(1l+hughie(dp,s,j+1));
            ans%=MOD;
        }
        return dp[i]=(int)ans%MOD;
    }

}