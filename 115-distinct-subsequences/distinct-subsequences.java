class Solution {
    private int rec(String s , String t , Integer [][] dp , int i , int j){
        if(j==t.length()) {return 1;}
        if(i==s.length()) return 0;
        if(dp[i][j]!=null) return dp[i][j];
        // optimization
        // if(s.charAt(i)==t.charAt(j)) {a+=rec(s,t,dp,i+1,j+1,temp.append(s.charAt(i)));
       // temp.deleteCharAt(temp.length()-1);}
       int a=rec(s,t,dp,i+1,j);
       if(s.charAt(i)==t.charAt(j)){ a+=rec(s,t,dp,i+1,j+1);}
        return dp[i][j]=a;

    }
    public int numDistinct(String s, String t) {
        int n = s.length();
        Integer dp [][]= new Integer[s.length()][t.length()];
        return rec(s,t,dp,0,0);
       
    }
}