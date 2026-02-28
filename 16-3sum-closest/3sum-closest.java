class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans =nums[0]+nums[1]+nums[2];
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (right > left) {
                int x = nums[i] + nums[left] + nums[right];
                if (x - target == 0)
                    return target;
                if (Math.abs(x - target) < Math.abs(ans-target)) {
                    ans=x;
                }
                if (x <= target)
                    left++;
                else {
                    right--;
                }
            }
        }
        return ans;
    }
}


// class Solution {
//     public int threeSumClosest(int[] nums, int target) {
//         Arrays.sort(nums);
//         int ans=-3001;
//         for(int i=0;i<nums.length;i++){
//             // this line was gifted by gpt bhai god bless him  :-_-:
//             if(i>0 && nums[i]==nums[i-1]) continue;
//             int left =i+1;
//             int right = nums.length-1;
//             while(left<right){
//                 int x= nums[left]+nums[i]+nums[right];
//                 if(x==target) return target;
//                 else if( x-target < ans-target){
//                     ans = x;
//                     while(left<right && nums[left]==nums[left+1]){ left++;}
//                     while(left<right && nums[right]==nums[right-1]){ right--;}
//                     left++;
//                     right--;  
//                 }
                
//             }
//         }

//    return ans; }
// }