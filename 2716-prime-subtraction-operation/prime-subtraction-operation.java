class Solution {
    public boolean primeSubOperation(int[] nums) {
        int n = nums.length - 1;
        boolean notprime[] = new boolean[1001];
        // seive should we
        notprime[0] = true;
        notprime[1] = true;
        for (int i = 2; i * i <= 1000; i++) {
            if (!notprime[i]) {
                for (int j = i * i; j <= 1000; j += i) {
                    notprime[j] = true;
                }
            }
        }
        // next prime 
        int next = -1;
        int[] nextprime = new int[1001];
        for (int i = 1000; i >= 0; i--) {
            if (!notprime[i]) {
                next = i;
            }
            nextprime[i] = next;
        }

        for (int i = n; i > 0; i--) {
            if (nums[i - 1] < nums[i])
                continue;

            // find a num > nums[i]-nums[i-1] and also prime
            int s = nums[i - 1] - nums[i] + 1;

            if (nextprime[s] == -1 || nextprime[s] >= nums[i - 1])
                return false;
            
                nums[i - 1] = nums[i - 1] - nextprime[s];
            

        }
        return true;
    }
}
 // while (s < 1001) {
            //     if (s >= nums[i - 1])
            //         return false;
            //     if (!notprime[s]) {
            //         nums[i - 1] = nums[i - 1] - s;
            //         break;
            //     }
            //     s++;
            // }