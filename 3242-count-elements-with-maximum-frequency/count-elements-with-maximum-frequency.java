class Solution {
    public int maxFrequencyElements(int[] nums) {
    HashMap<Integer,Integer> map = new HashMap<>();
    ArrayList<Integer> list = new ArrayList<>();
    int ans=0;
    int max = Integer.MIN_VALUE;
     for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);}
         for (int i = nums.length-1; i>=0 ; i--){
          max= Math.max(max, map.get(nums[i]));}
          for(int i =0;i<nums.length;i++){
            if(!list.contains(nums[i])&&map.get(nums[i])==max) ans+=max;
            list.add(nums[i]);
          }

   return ans; }
}