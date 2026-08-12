class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
       int ans =0;
       HashMap <Integer,Integer> map = new HashMap<>();
       int j =0;
       for(int i =0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>k){
                while(map.get(nums[i])>k){
                    map.put(nums[j],map.getOrDefault(nums[j],0)-1);
                    j++;
                }
            }
        ans=Math.max(ans,i-j+1);
       } 
    return ans;}
}