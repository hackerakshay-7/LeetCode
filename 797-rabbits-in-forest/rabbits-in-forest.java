class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans =0;
        for(int a : answers){
            //  if(!map.containsKey(a)) ans+=a+1;
           map.put(a,map.getOrDefault(a,0)+1);
           if(a==0 || map.get(a)%(a+1)==1) ans+=a+1;
          
        }
    return ans;}
}