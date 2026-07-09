class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        boolean ans [] = new boolean[queries.length];
        int [] comp = new int [nums.length];
        int co = 0;
        comp[0]=0;
       for(int i =1;i<nums.length;i++){
            if(Math.abs(nums[i]-nums[i-1])>maxDiff) co++;
            comp[i]=co;
       }
       int k =0;
       for(int a []: queries){
        ans[k++]= comp[a[0]]==comp[a[1]];
       }
   return ans; }
}