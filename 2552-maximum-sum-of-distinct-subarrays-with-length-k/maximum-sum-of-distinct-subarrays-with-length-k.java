class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        long sum = 0l, temp = 0l;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                while (nums[j] != nums[i]) {
                    set.remove(nums[j]);
                    temp -= nums[j];
                    j++;
                }
                set.remove(nums[j]);
                temp -= nums[j];
                j++;
            }
            set.add(nums[i]);
            temp += nums[i];
            while (j < nums.length && i - j + 1 > k) {
                // shrink shit
                set.remove(nums[j]);
                temp -= nums[j];
                j++;
            }
            if (i - j + 1 == k)
                sum = Math.max(sum, temp);
        }
        return sum;
    }
}

/**
 int i=0,j=0; long sum=0,comp=0;
        while(j<nums.length){
            if(map.containsKey(nums[j])){comp=comp-nums[i]+nums[j];j++;i++;continue;}
            if(map.size()>=k){
             map.remove(nums[i]);  comp=comp+nums[j]-nums[i]; sum=Math.max(sum,comp); i++;j++;}
            
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
           comp+=nums[j]; j++;
        } */