class Solution {
    public int totalFruit(int[] fruits) {
        int ans=Integer.MIN_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();
        int i =0,j=0;
        while(j<fruits.length){
             map.put(fruits[j],map.getOrDefault(fruits[j],0)+1);
            if(map.size()>2){
                if(map.get(fruits[i])==1) {map.remove(fruits[i]);}
              else{  map.put(fruits[i],map.getOrDefault(fruits[i],0)-1);}
               i++;
            }
            int length=j-i+1;
            ans=Math.max(ans,length);
            j++;
        }
  return ans;  }
}