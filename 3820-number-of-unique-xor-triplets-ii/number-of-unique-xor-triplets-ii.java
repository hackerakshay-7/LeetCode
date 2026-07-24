class Solution {
    public int uniqueXorTriplets(int[] nums) {
      // cant brute 
      // jo bhi hoga 2 ki power hoga 
      // 1500 se zyada ni jayega nums[i] ki value  
      boolean arr[] = new boolean [2048]; // 2^11 (2048)se kum hi hai 1500 
        for(int a : nums){
            for(int b : nums){
                arr[a^b] = true;
        }}
        boolean ans [] = new boolean [2048];
        for(int a : nums){
            for(int i=0;i<2048;i++){
                if(arr[i]) ans[i^a] = true;
            }
        }
        int count = 0;
        for(int i =0;i<2048;i++){ if(ans[i]) count++;}
    return count;}
}