class Solution {
    public static void sum(List<List<Integer>>ans,List<Integer> curr, int nums[],int i){
        if(i==nums.length) {
            ans.add( new ArrayList<>(curr)); return;}
            //select
            curr.add(nums[i]);
            sum(ans,curr,nums,i+1);
            curr.remove(curr.size()-1);
            // deselect
            sum(ans,curr,nums,i+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> abhika = new ArrayList<>();
    int i=0;
    sum(list,abhika,nums,i);
   return list; }
}