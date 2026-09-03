class Solution {
    public int[] arrayChange(int[] nums, int[][] ops) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i =0;i<ops.length;i++){
            int idx = map.get(ops[i][0]);
            map.remove(ops[i][0]);
            map.put(ops[i][1],idx);
            nums[idx] = ops[i][1];
        }
        // for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        //     nums[entry.getValue()] = entry.getKey();
        // }

   return nums; }
}