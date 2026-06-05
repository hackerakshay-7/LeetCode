class Solution {
    Integer memo[][][];
        private int dp(String s , int pos,int prev,int tight){
        if(pos==s.length()) return 1;
        if(memo[pos][prev][tight]!=null) return memo[pos][prev][tight];
         int limit;
        if(tight ==1) limit = s.charAt(pos)-'0';
        else{ limit = 1;}
        int ans =0;
        for(int i =0;i<=limit;i++){
            if(i==1 && prev==1) continue;
            int newtight ;
            if(tight ==1 && i==limit) newtight= 1;
            else newtight = 0;
            ans+=dp(s,pos+1,i,newtight);
        }
        memo[pos][prev][tight]=ans;
        return ans;
    }
    public int findIntegers(int n) {
        String s = Integer.toBinaryString(n);
        memo = new Integer[s.length()][2][2];
       return dp(s,0,0,1);
    }
}