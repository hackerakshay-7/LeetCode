class Solution {
    public int minimumCost(int[] cost) {
      int sum =0;
      Arrays.sort(cost);
      for(int i = cost.length-1;i>=2;i-=3){
        sum+=(cost[i]+cost[i-1]);
      }
      if(cost.length%3==2) sum+=(cost[0]+cost[1]);
      if(cost.length%3==1) sum+=(cost[0]);
  return sum;  }
}