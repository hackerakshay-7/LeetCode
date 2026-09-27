class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for (char a : s.toCharArray()) {
            if (a == ')') {
                StringBuilder temp = new StringBuilder();
                while (st.peek() != '(') {
                    temp.append(st.pop());
                }
                st.pop();
                for (int i = 0; i<temp.length(); i++) {
                    st.push(temp.charAt(i));
                }
            } else {
                st.push(a);
            }
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
    return sb.reverse().toString();}
}