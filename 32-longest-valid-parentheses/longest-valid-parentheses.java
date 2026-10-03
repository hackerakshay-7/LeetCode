class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length();
        int in = 0,
                out = 0,
                max = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                in++;
            }
            if (s.charAt(i) == ')')
                out++;
            if (in == out) {
                max = Math.max(max, in * 2);
            }
            if (out > in) {
                in = 0;
                out = 0;
            }
        }

        in = 0;
        out = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                in++;
            }
            if (s.charAt(i) == ')')
                out++;
            if (in == out) {
                max = Math.max(max, in * 2);
            }
            if (out < in) {
                in = 0;
                out = 0;
            }
        }
        return max;
    }

}

/**
for(int i=0;i<s.length();i++){
            int count=0;
            for(int j =i;j<s.length();j++){
                if(s.charAt(j)=='(') count++;
                else if(s.charAt(j)==')') count--;
                if(count<0) break;
                if(count ==0){
                    max=Math.max(max,j-i+1);
                }
            }
        } */