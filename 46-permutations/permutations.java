class Solution {
    public void work(List<List<Integer>> ans,int i,List<Integer>curr){
        if(i==curr.size()){
        ans.add(new ArrayList<>(curr)); 
        return;}
        for(int j =i;j<curr.size();j++){
            Collections.swap(curr,j,i);
            work(ans,i+1,curr);
            Collections.swap(curr,j,i);
        } }
      //  void swap(Integer nums[],int i , int j){ int temp=nums[i]; nums[i]=nums[j]; nums[j]=temp;}

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        for(Integer oh : nums){ curr.add(oh);}
        work(ans,0,curr);
        return ans;}
}