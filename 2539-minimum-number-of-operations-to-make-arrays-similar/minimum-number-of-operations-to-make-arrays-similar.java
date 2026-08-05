class Solution {
    public long makeSimilar(int[] nums, int[] target) {
        Arrays.sort(nums);
        Arrays.sort(target);
        ArrayList<Integer> eventar = new ArrayList<>();
        ArrayList<Integer> oddtar = new ArrayList<>();
        ArrayList<Integer> evenarr = new ArrayList<>();
        ArrayList<Integer> oddarr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0)
                evenarr.add(nums[i]);
            else if (nums[i] % 2 == 1)
                oddarr.add(nums[i]);
            if (target[i] % 2 == 0)
                eventar.add(target[i]);
            else if (target[i] % 2 == 1)
                oddtar.add(target[i]);
        }
        long steps = 0;
        for (int i = 0; i < eventar.size(); i++) {
            if (evenarr.get(i) > eventar.get(i)) {
                steps += ((evenarr.get(i) - eventar.get(i)) / 2);
            }
        }
        for (int i = 0; i < oddtar.size(); i++) {
            if (oddarr.get(i) > oddtar.get(i)) {
                steps += ((oddarr.get(i) - oddtar.get(i)) / 2);
            }
        }

        return steps;
    }
}