class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int ans =0;
        for(int n : prices){
            if ( n<min) min = n;
            ans = Math.max(n-min,ans);
        } return ans;
    }
}