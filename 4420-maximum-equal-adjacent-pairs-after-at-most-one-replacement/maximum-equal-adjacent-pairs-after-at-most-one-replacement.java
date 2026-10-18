class Solution {

    // IMAGINE IF I NEVER MET THE BROSKI !! gods plan X2
    // class Pair{
    //     int a;
    //     int b;
    //     Pair(int a , int b){
    //         this.a=a;
    //         this.b=b;
    //     }
    // }
    private record Pair(int a, int b) {
    }

    public int maxEqualAdjacentPairs(int[] nums) {
            HashMap<Pair,Integer> map = new HashMap<>();
            int count=0,ans=0;
            for(int i =0;i<nums.length-1;i++){
                    if(nums[i]==nums[i+1]) count++;
                    else{   int max =Math.max(nums[i],nums[i+1]);
                            int min = Math.min(nums[i],nums[i+1]);
                            Pair key = new Pair(min,max);
                            map.put(key,map.getOrDefault(key,0)+1);
                    }
            } 
        
        for(Map.Entry<Pair,Integer> et : map.entrySet()){
       if(et.getValue() > ans) ans=et.getValue();
    }
    return ans+count;
}}

/**
  // all x to y
        // one operation only
        // most num of consecutive numbers
        // hints of sliding window and a map
        // while set size <=2 expand
        // max track (i-j+1)
        // ans = max-1
        int ans = 0;
        HashMap<Integer,Integer> map= new HashMap<>();
        int j =0;
        for(int i =0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while(map.size()>2){ 
                // shrink shit
                map.put(nums[j],map.get(nums[j])-1);
                if(map.get(nums[j])==0) map.remove(nums[j]);
                j++;
            }
            ans = Math.max(ans,i-j+1);
        }
   return ans-1; */

/**
// 2,3 == 3,2
     // let us count frequency of pairs
     // return the max freq wont work
     // 
     int ans=0;
     HashMap<String,Integer> map = new HashMap<>();
     for(int i =0;i<nums.length-1;i++){
        String temp;
         if(nums[i]>nums[i+1]){
             temp = (nums[i] + "" +nums[i+1]);
         }
         else{
             temp = (nums[i+1]+""+nums[i]);
         }
        int freq = map.getOrDefault(temp,0)+1;
        map.put(temp,freq);
        ans = Math.max(ans,freq); */