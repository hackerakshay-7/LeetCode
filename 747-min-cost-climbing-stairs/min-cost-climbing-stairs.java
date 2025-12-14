class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if(cost.length==1) return cost[0];
        
        int n = cost.length;
        
        int prev1 = 0;
        int prev2 = 0;
        
        
        for(int i =2; i<=n; i++){
            int cur = Math.min(prev2+cost[i-2], prev1+cost[i-1]);
            prev2 = prev1;
            prev1 = cur;
        }
        
        return prev1;
        
    }
}
/*  if(cost.length==1) return cost[0];
        else if(cost.length==2) return Math.min(cost[0],cost[1]);
        int sum=0;
        int index = cost[0]>cost[1] ? 1:0; */