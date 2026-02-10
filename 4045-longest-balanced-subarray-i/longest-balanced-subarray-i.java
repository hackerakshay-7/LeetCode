class Solution {
    public int longestBalanced(int[] nums) {
        int ans=0,oddc=0,evenc=0;
        for(int i=0;i<nums.length;i++){
            HashSet<Integer> set = new HashSet<>();
            set.add(nums[i]); if(nums[i]%2==0) evenc++; else{ oddc++;}
            for(int j=i;j<nums.length;j++){
                if(!set.contains(nums[j]) && nums[j]%2==0){ evenc++;set.add(nums[j]);}
                else if(!set.contains(nums[j]) && nums[j]%2==1){ oddc++; set.add(nums[j]);}
                if(evenc==oddc) ans=Math.max(ans,j-i+1);
            }
            set.clear();evenc=0;oddc=0;
        }
   return ans; }
}