class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int count = 0;
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0])
                return Integer.compare(b[1], a[1]);
            return Integer.compare(a[0], b[0]);
        });
        for (int i = 0; i < intervals.length; i++) {
            for (int j = i + 1; j < intervals.length; j++) {
                if (intervals[j][0] != -1 && intervals[j][1] <= intervals[i][1]) {
                    intervals[j][0] = -1;
                    count++;
                }
            }
        }
        return intervals.length - count;
    }
}