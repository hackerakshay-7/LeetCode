class Solution {
void back(List<List<Integer>> ans , int [] cand , int i , ArrayList<Integer> temp,int tar ){
        if(tar==0){ans.add(new ArrayList<>(temp)); return;}
        for(int j =i;j<cand.length;j++){
            if(tar<cand[j]) break;
            if(j>i && cand[j]==cand[j-1]) continue;
            temp.add(cand[j]);
            back(ans,cand,j+1,temp,tar-cand[j]);
            temp.remove(temp.size()-1);
        }
        
        }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        back(ans,candidates,0,new ArrayList<>(),target);
  return ans;}
}