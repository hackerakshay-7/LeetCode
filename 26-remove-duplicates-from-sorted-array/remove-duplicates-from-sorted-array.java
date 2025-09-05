class Solution{
public int removeDuplicates(int[] nums) {  int j=0;
for(int i=1;i<nums.length;){
if(nums[i]!=nums[j]){nums[++j]=nums[i];}
i++;}
return j+1;}}