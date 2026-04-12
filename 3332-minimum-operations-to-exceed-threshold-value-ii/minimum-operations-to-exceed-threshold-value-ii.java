class Solution {
    public int minOperations(int[] nums, int k) {
        //after every step two integers will get removed
        int count =0;
       PriorityQueue<Long> pq = new PriorityQueue<>();
       for(int a : nums) pq.offer((long)a);
       while(pq.peek()<k && pq.size()>1){
        long temp = pq.poll();
        long remp = pq.poll();
        pq.offer((temp*2+remp));
        count++;
       }
   return count; }
}