class Solution {
    public int maximizeGreatness(int[] nums) {
      int count = 0;
      int n = nums.length;
      Arrays.sort(nums);
     int i=0;
     int j=0;
     while(j<n){
        if(nums[i]<nums[j]) {
            i++;
            count++;}
            j++;
     }

   return count; }
}