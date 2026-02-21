class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int i=0;
        for( int a : nums){
            map.put(a,map.getOrDefault(a,0)+1);}
             HashMap<Integer,Integer> map2 = new HashMap<>();
        for(int a : map.values()){
            map2.put(a,map2.getOrDefault(a,0)+1);
        }
        
        for(int a : nums){
           if( map2.get(map.get(a))==1) return a;
        }

  return -1;  }
}