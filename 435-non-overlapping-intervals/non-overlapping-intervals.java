class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
         int ans = 0;
        if (intervals.length == 0)
            return ans;
            Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int mintime = intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<mintime) ans++;
            else{ mintime = intervals[i][1];}
        }
   return ans; }
}