class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 1; i < heights.length; i++) {
           int diff = heights[i]-heights[i-1];
           if(diff<=0) continue;
            pq.offer(diff);
            if(pq.size()>ladders){
                int min = pq.poll();
                if(bricks<min) return i-1;
                else{
                    bricks-=min;
                }
            }

        }
        return heights.length - 1;
    }
}