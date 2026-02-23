class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE;
        for(int a : nums){
            set.add(a);
            max = Math.max(max,a);
        }
        for(int i = max;i>-1;i--){
            if(!set.contains(i)) return i;
        }
        
   return max+1; }
}