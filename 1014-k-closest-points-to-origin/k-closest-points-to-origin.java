class Solution {
    class Pair implements Comparable<Pair>{
        int x;
        int y;
        Pair(int x , int y){ this.x=x;this.y=y;}
        public int getDistance(){
            return x*x + y*y;}
       public int compareTo(Pair that){
            return that.getDistance()-this.getDistance();
        }

    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int[] num:points){
            pq.offer(new Pair(num[0],num[1]));
        }
        while(pq.size()!=k){ pq.poll();}
        int ans[][] = new int [k][2];
       for(int i=0;i<k;i++){
        Pair p= pq.poll();
        ans[i][0]=p.x;
        ans[i][1]=p.y;
       }
    return ans;}
}