class Solution {
    public int triangularSum(int[] nums) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int n:nums){
            list1.add(n);}
        while(list1.size()!=1){
           for(int i=0;i<list1.size()-1;i++){
           list2.add((list1.get(i) + list1.get(i+1))%10);}
            list1.clear();
           for(int n: list2){list1.add(n);}
           list2.clear();
           }
   return list1.get(0); }
}