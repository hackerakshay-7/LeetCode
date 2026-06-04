class Solution {
    private int cunt(int n) {
        String s = n + "";
        int count =0;
        for (int i = 1; i < s.length()-1; i++) {
            if (s.charAt(i) > s.charAt(i - 1) && s.charAt(i) > s.charAt(i + 1))
                count++;
            else if (s.charAt(i) < s.charAt(i - 1) && s.charAt(i) < s.charAt(i + 1))
                count++;
        }
        return count;
    }

    public int totalWaviness(int num1, int num2) {
        int count = 0;
        int start = Math.max(num1,100);
        for (int i = start; i <= num2; i++) {
            count+=cunt(i);
        }
   return count; }
}