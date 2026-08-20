class Solution {
    public int[] resultArray(int[] nums) {
        int result[] = new int[nums.length];
        int temp[] = new int[nums.length];
        int j = 1;
        int k = 1;
        result[0] = nums[0];
        temp[0] = nums[1];
        for (int i = 2; i < nums.length; i++) {
            if (temp[j-1] >= result[k-1]) {
                temp[j] = nums[i];
                j++;
            } else {
                result[k] = nums[i];
                k++;
            }
        }
        int i = 0;
        while (k < nums.length) {
            result[k++] = temp[i++];
        }

        return result;
    }
}