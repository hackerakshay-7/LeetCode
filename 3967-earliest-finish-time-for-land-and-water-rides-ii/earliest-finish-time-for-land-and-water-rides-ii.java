class Solution {
    int minl(int[] lands, int landd[], int[] waters, int[] waterd) {
        int maxone=Integer.MAX_VALUE,maxtwo=Integer.MAX_VALUE;
        for (int i = 0; i < lands.length; i++) {
            maxone=Math.min(maxone,lands[i]+landd[i]);
        }
        for (int i = 0; i < waters.length; i++) {
           maxtwo=Math.min(maxtwo,waters[i]+waterd[i]);
        }
         int ans = Integer.MAX_VALUE;
        for (int i = 0; i < landd.length; i++) {
            ans = Math.min(ans, Math.max(maxtwo, lands[i]) + landd[i]);
        }
        for (int i = 0; i < waterd.length; i++) {
            ans = Math.min(ans, Math.max(maxone, waters[i]) + waterd[i]);
        }
        return ans;
        
      
    }

    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        return minl(landStartTime,landDuration,waterStartTime,waterDuration);
    }
}