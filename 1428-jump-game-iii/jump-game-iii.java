class Solution {
    boolean dfs(int[]arr,int st,boolean[]isv){
        if(st<0 || st>arr.length-1) return false;
        if(isv[st]) return false;
       if(arr[st]==0) return true;
       isv[st] = true;
       return  dfs(arr,st+arr[st],isv) || dfs(arr,st-arr[st],isv);

    }
    public boolean canReach(int[] arr, int start) {
        boolean isv [] = new boolean[arr.length];
      return dfs(arr,start,isv);
    }
}