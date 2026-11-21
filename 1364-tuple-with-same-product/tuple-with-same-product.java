class Solution {
    // tle @ n^3
    public int tupleSameProduct(int[] nums) {
        int n = nums.length;
        if(n<4) return 0;
      HashMap<Integer,Integer> map = new HashMap<>(n*(n-1)/2);
      int count = 0;
      for(int i =0;i<n;i++){
        for(int j = i+1;j<n;j++){
            int mul = nums[i]*nums[j];
            int prev = map.getOrDefault(mul,0);
            count+=prev;
            map.put(mul,prev+1);

        }
      }


        return count*8;
    }
}