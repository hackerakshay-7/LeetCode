class Solution {
    private int calc(int[] freq, int k) {
        long ans = 0l;
        for (int i = 0; i < k; i++) {
            long num1 = 0;
            for (int bit=0; bit<31; bit++) {
                if (freq[bit] > 0) {
                    num1 |= (1L<<bit);
                    freq[bit]--;
                }
            }
           ans= (ans + ((num1 * num1) % MOD))%MOD;
        }
        return (int) ans % MOD;

    }

    private static final int MOD = 1000_000_007;

    public int maxSum(List<Integer> nums, int k) {
       
        int freq[] = new int[32];
        for (int i = 0; i < nums.size(); i++) {
            int a = nums.get(i);
            // String s = Integer.toBinaryString(a);
            // int z = 31;
            // for (int j = s.length() - 1; j >= 0; j--) {
            //     if (s.charAt(j) == '1')
            //         freq[z]++;
            //     z--;
            // }
            for(int bit =0;bit<31;bit++){
                if((a& 1<<bit)!=0) freq[bit]++;
            }
        }

        return calc(freq, k);
    }
}


 // shall i choose the maximum k number of elements 
        // try to make all bits set by oring and fuck the smaller number 
        // greedily
/**
 Collections.sort(nums);
       int i=nums.size()-k-1,j=nums.length-1;
       while(i>=0){
            nums[j]|=nums[i];
            i--;
            if()
            
       }
    return calc(k,nums); */