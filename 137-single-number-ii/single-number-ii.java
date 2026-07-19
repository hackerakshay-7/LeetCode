class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int count = 0;
            // checking num of set bits in every nums[i]
            // if every num appears three times then the set bit count will be a multiple of 3
            // if ! a multiple of 3 then there is an imposter
            for (int j = 0; j < nums.length; j++) {
                if ((nums[j] & (1 << i)) != 0)
                    count++;
            }
            if (count % 3 == 1)
                ans = ans | (1 << i);
        }
        return ans;
    }
}