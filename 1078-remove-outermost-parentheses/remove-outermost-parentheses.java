class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        // consecutive open se consecutive close tak ka suffer
        int n = s.length();
        int open=0;
        for(char a : s.toCharArray()){
            if(a=='('){
                open++;
                if(open>1) ans.append('(');
            }
            else{
                if(open>1) ans.append(')');
                open--;
            }
        }
   return ans.toString(); }
}