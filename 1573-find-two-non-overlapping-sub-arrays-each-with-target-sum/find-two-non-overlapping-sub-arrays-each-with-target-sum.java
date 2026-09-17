class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int min[] = new int[n];
        Arrays.fill(min, -1);

        int sum = 0, j = 0;
        int ans = n + 1;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            while (j <= i && sum > target) {
                sum -= arr[j];
                j++;
            }
            if (sum == target) {
                int size = i - j + 1;
                if (j > 0 && min[j - 1] != -1) {
                    ans = Math.min(ans, size + min[j - 1]);
                }
                if (i > 0) {
                    if (min[i - 1] == -1)
                        min[i] = size;
                    else {
                        min[i] = Math.min(min[i - 1], size);
                    }
                } else {
                    min[i] = size;
                }
            } else {
                // carrrryyy FORWARD!!!!!!
                if (i > 0)
                    min[i] = min[i - 1];
            }

        }
        return ans == n + 1 ? -1 : ans;

    }
}