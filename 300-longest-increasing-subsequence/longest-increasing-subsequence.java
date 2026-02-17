class Solution {
    public int lengthOfLIS(int[] nums) { 
        ArrayList<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for(int i =1;i<nums.length;i++){
            if(list.get(list.size()-1)<nums[i]){list.add(nums[i]);}
            else if(nums[i]<list.get(list.size()-1)){
                int s=0,e=list.size()-1;
                while(s<=e){
                    int mid = s+((e-s)/2);
                    if(list.get(mid)>=nums[i]){e=mid-1;}
                    else{s=mid+1;}
                } list.set(s,nums[i]);
            }
        }
     return list.size(); }
}