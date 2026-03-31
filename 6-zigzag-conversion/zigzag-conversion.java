class Solution {
    public String convert(String s, int numRows) {
        String ans = "";
        if (numRows == 1)
            return s;
        String[] arr = new String[numRows];
        for (int i = 0; i < numRows; i++) {
            arr[i] = "";
        }
        int k = 0;
        while (k != s.length()) {
            for (int i = 0; i < numRows; i++, k++) {
                if (k == s.length())
                    break;
                arr[i] += s.charAt(k);
            }
            for (int i = numRows - 2; i > 0; i--, k++) {
                if (k == s.length())
                    break;
                arr[i] += s.charAt(k);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            ans += arr[i];
        }

        return ans;
    }
}