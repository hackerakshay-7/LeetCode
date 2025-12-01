class Solution {
    int dp(Integer [] dps,int n){
        if(n==2 || n==1 || n==3) return n;
        if(dps[n]!=null) return dps[n];
        return dps[n]= dp(dps,n-1) + dp(dps,n-2);
    }
    public int climbStairs(int n) {
         if(n==2 || n==1 || n==3) return n;
        Integer arr[] = new Integer[n+1];
        dp(arr,n);
     return arr[n];}
}