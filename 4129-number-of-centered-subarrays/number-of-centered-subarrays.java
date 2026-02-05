class Solution {
    public int centeredSubarrays(int[] nums) {
        int count = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            int sum=nums[i];
            set.add(nums[i]);
            for(int j =i+1;j<nums.length;j++){
                sum+=nums[j];
                set.add(nums[j]);
                if(set.contains(sum)) count++;
                
            } set.clear();
        }
    return count;}
}