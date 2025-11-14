class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        for(int o : stones){ pq.add(o);}
        while(pq.size()>1){
            pq.add(Math.abs(pq.poll()-pq.poll()));
        }
   return pq.poll(); }
}