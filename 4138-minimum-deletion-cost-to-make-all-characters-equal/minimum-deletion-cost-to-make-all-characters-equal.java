class Solution {
    public long minCost(String s, int[] cost) {
       long arr[] = new long[26];
       for(int i =0;i<s.length();i++){
        char a = s.charAt(i);
        arr[a-'a']+=cost[i];
       }
       // find total cost then 
       // subtract from table and get max total after sub = ans
       long sum =0;
       for(int a : cost) sum+=a;
       long ans = Long.MAX_VALUE;
       for(int i =0;i<26;i++){
        long a = sum-arr[i];
        ans= Math.min(ans,a);
       }
   return ans; }
}