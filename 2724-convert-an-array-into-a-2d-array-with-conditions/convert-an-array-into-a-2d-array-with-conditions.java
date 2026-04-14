class Solution {
    void dnd(List<List<Integer>> ans , ArrayList<Integer> t){
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int a : t){
            if(set.isEmpty()||!set.contains(a)) set.add(a);
            else{list.add(a);}
        }
         if(t.size()==0) return;
          ans.add(new ArrayList<>(set));
        dnd(ans,list);
    }
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> t = new ArrayList<>();
        for(int a : nums) t.add(a);
       dnd(ans,t);
       return ans;
    }
}