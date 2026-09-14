class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            map.computeIfAbsent(nums[i],k->new ArrayList<>()).add(i);
        }
        int count =0;
        for(Map.Entry<Integer,List<Integer>> entry : map.entrySet()){
            List<Integer> temp = entry.getValue();
            if(temp.size()<3) continue;
            boolean ok = true;
            for(int i=1;i<temp.size()-1;i++){
                if((temp.get(i)-temp.get(i-1))!=(temp.get(i+1)-temp.get(i)))
                ok=false;
            }
            if(ok) count++;
        }
   return count; }
}