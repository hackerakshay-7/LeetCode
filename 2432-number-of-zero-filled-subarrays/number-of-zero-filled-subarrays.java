class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int n = nums.length;
        long ans = 0l;
       HashMap<Integer,Integer> map = new HashMap<>();
       int j =0;
       for(int i =0;i<n;i++){
        int a = nums[i];
        map.put(a,map.getOrDefault(a,0)+1);
        while(map.size()>1){
            map.put(nums[j],map.get(nums[j])-1);
            if(map.get(nums[j])<=0) map.remove(nums[j]);
            j++;
        }
        if(map.containsKey(0) && map.size()==1) ans+=(i-j+1);
       } 
    return ans;}
}