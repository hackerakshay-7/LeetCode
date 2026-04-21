class Solution {
    void back(List<List<Integer>> ans ,int s, int target , int [] cand,int sum,List<Integer> temp){   
        if(sum==target){ ans.add(new ArrayList<>(temp)); return;}
        if(sum>target){  return;}
        for(int i =s;i<cand.length;i++){
            temp.add(cand[i]);
            back(ans,i,target,cand,sum+cand[i],temp);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        back(ans,0,target,candidates,0,new ArrayList<>());
   return ans; }
}