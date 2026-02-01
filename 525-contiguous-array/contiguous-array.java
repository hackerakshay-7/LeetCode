class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> nikhilLohia = new HashMap<>();
        int cursum = 0, ans = 0;
        nikhilLohia.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                cursum -= 1;
            else {
                cursum += 1;
            }
            if (nikhilLohia.containsKey(cursum)) {
                ans = Math.max(ans, i - nikhilLohia.get(cursum));
            }
           else{ nikhilLohia.put(cursum, i);}
        }

        return ans;
    }
}

/* 
  int arr[] = new int[2];
        for (int a : nums) {
            if (a == 0)
                arr[0]++;
            else {
                arr[1]++;
            }
        }
        if (arr[0] == arr[1])
            return arr[0] + arr[1];
        for (int a : nums) {
            if (a == 0)
                arr[0]--;
            else {
                arr[1]--;
            }
            if (arr[0] == arr[1])
                return arr[0] + arr[1];
        }
        return 0; */