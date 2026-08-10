class Solution {
    public int numIdenticalPairs(int[] nums) {
        int arr []=new int[101];
        for(int a : nums) arr[a]++;
        int ans =0;
        for(int a: arr)ans+=a*(a-1)/2;
        return ans;
    }
}
// HashMap<Integer,Integer> map = new HashMap<>();
      //  for(int a : nums) map.put(a,map.getOrDefault(a,0)+1);