class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n =nums.length;
      boolean [] arr = new boolean[101];
      for(int a : nums) arr[a] = true;
      for(int i =1;i<=n;i++){
        if(i*k>100) return i*k;
        if(!arr[i*k]) return i*k;
        
      }
      return (n+1)*k;
}}
/**
  HashSet<Integer> set  = new HashSet<>();
        int max =0;
        for(int a : nums) {set.add(a); max = Math.max(a,max);}
        int i =1;
        while(i*k<max){
            if(!set.contains(i*k))return i*k;
            i++;
        }
       return (i+1)*k; */