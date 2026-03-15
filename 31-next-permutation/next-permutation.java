class Solution {
    void swap(int nums[], int x , int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
    void rev(int nums [] , int s , int e){
        while(s<e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;e--;
        }
    }
    int find(int nums[],int a){
        int re = -1;
        for(int i = nums.length-1;i>a;i--){
            if(nums[i] > nums[a] ){ 
                if( re ==-1 || nums[i]<nums[re])re = i;}
        }
        return re;
    }
    public void nextPermutation(int[] nums) {
        for(int i = nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
             int  x=  find(nums,i-1);
             swap(nums,x,i-1);
             rev( nums,i,nums.length-1);
             return;
            }
        }
        rev(nums,0,nums.length-1);
    }
}