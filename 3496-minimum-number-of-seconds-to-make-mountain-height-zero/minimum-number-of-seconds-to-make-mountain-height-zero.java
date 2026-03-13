import java.util.*;

class Solution {

    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {

        long left = 1;
        long right = (long)1e18;
        long ans = right;

        while (left <= right) {

            long mid = left + (right - left) / 2;

            if (canFinish(mid, mountainHeight, workerTimes)) {
                ans = mid;
                right = mid - 1;
            } 
            else {
                left = mid + 1;
            }
        }

        return ans;
    }

    private boolean canFinish(long time, int mountainHeight, int[] workerTimes) {

        long totalHeight = 0;

        for (int w : workerTimes) {

            long k = (long)((Math.sqrt(1 + (8.0 * time) / w) - 1) / 2);

            totalHeight += k;

            if (totalHeight >= mountainHeight)
                return true;
        }

        return totalHeight >= mountainHeight;
    }
}