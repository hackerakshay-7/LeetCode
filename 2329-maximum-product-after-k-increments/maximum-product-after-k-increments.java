class Solution {
    public int maximumProduct(int[] nums, int k) {
        int mod = 1000_000_007;
        long ans =1;
       PriorityQueue <Integer> pq = new PriorityQueue<>();
       for(int a : nums) pq.offer(a);
       while(k-->0){
        int q = pq.poll();
        pq.offer(q+1);
       }
       while(!pq.isEmpty()){
            ans= (ans*pq.poll())%mod;

       }
    return (int)ans;}
}