class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int track=0; 
       for(int i =0;i<points.length-1;i++){
       int a = points[i][0];
       int b = points [i][1];
       int c = points [i+1][0];
       int d = points[i+1][1];
       int su = Math.max((Math.abs(d-b)),(Math.abs(c-a)));
       track+=su;
       }
   return track; }
}