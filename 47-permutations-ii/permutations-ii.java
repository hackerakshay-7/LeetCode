class Solution {
    void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    void fkr(List<List<Integer>> ans , int [] nums,int i){
        if(i==nums.length){
            ArrayList<Integer> curr = new ArrayList<>();
            for(int a : nums) curr.add(a);
            ans.add(curr);
             return;}
              HashSet<Integer> set = new HashSet<>();
       for(int j=i;j<nums.length;j++){
        if(set.contains(nums[j])) continue; 
        set.add(nums[j]);
            swap(nums,i,j);
            fkr(ans,nums,i+1);
            swap(nums,i,j);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        fkr(ans,nums,0);

   return ans; }
    
   }
