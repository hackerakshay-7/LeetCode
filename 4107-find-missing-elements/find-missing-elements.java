class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        for(int i =0;i<nums.length-1;i++){
            if(nums[i]+1==nums[i+1]) continue;
            int k =nums[i];
            while(k+1 !=nums[i+1]){
                ans.add(k+1);
                k++;
            }
        }
   return ans; }
}