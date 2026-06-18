class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int sum = 0, n = customers.length;
        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 1)
                continue;
            sum += customers[i];
        }
        int i = 0, j = 0, max = 0, sum2 = 0, window = 0;
        while (i < n ) {
            if (window < minutes) {
                // expand
                if (i < n && grumpy[i] == 1)
                    sum2 += customers[i];
                max = Math.max(max, sum2);
                window++;
                i++;
            } else {
                // shrink
                
                    if (grumpy[j] == 1) {
                        sum2 -= customers[j];
                    }
                    window--;
                    j++;
                
               // max = Math.max(max, sum2);
            }
        }
        return max + sum;
    }
}