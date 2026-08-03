class Solution {
    public int maxSumDivThree(int[] nums) {
        int sum = 0;

        int one1 = Integer.MAX_VALUE, one2 = Integer.MAX_VALUE;
        int two1 = Integer.MAX_VALUE, two2 = Integer.MAX_VALUE;

        for (int a : nums) {
            sum += a;

            if (a % 3 == 1) {
                if (a < one1) {
                    one2 = one1;
                    one1 = a;
                } else if (a < one2) {
                    one2 = a;
                }
            } else if (a % 3 == 2) {
                if (a < two1) {
                    two2 = two1;
                    two1 = a;
                } else if (a < two2) {
                    two2 = a;
                }
            }
        }

        int rem = sum % 3;
        if (rem == 0) return sum;

        if (rem == 1) {
            int remove = Integer.MAX_VALUE;

            if (one1 != Integer.MAX_VALUE)
                remove = one1;

            if (two2 != Integer.MAX_VALUE)
                remove = Math.min(remove, two1 + two2);

            return sum - remove;
        } else {
            int remove = Integer.MAX_VALUE;

            if (two1 != Integer.MAX_VALUE)
                remove = two1;

            if (one2 != Integer.MAX_VALUE)
                remove = Math.min(remove, one1 + one2);

            return sum - remove;
        }
    }
}