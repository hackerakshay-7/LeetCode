class Solution {
    public int findDuplicate(int[] nums) {
       // hare and tortoise
       // slow and fast pointer
       // floyds cycle algorithm
       // a linked list with duplicate will grow loop inevitably;
       int slow=nums[0]; // 1 step to the index value;
       int fast =nums[nums[0]]; // one step ahead i.e 2 steps always
       while(fast != slow){
            fast=nums[nums[fast]];
            slow=nums[slow];
       } 
       slow=0;
       while(slow!=fast){
        slow=nums[slow];
        fast = nums[fast];
       }
    return slow;}
}