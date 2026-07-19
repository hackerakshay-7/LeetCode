class Solution {
    public String smallestSubsequence(String s) {
        boolean isv[] = new boolean[26];
        int last[] = new int[26];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (isv[a - 'a'])
                continue;
            while (sb.length() > 0 && last[(sb.charAt(sb.length() - 1)) - 'a'] > i && sb.charAt(sb.length() - 1) > a) {
                isv[sb.charAt(sb.length() - 1) - 'a'] = false;
                sb.deleteCharAt(sb.length() - 1);
            }
            sb.append(a);
            isv[a-'a'] = true;

        }
        return sb.toString();
    }
}