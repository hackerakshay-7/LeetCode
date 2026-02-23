class Solution {
    // cycle sooort!!!!
    void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            if (nums[nums[i] - 1] == nums[i])
                i++;
            else if(nums[i]-1!=i) {
                swap(i, nums[i]-1, nums);
            }
            else{i++;}
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1) list.add(j+1);
        }
        return list;
    }
}