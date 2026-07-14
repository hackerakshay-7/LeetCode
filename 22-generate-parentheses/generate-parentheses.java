class Solution {// i think subsets se ho jYEGa with valid paranthesis 

    private boolean isv(StringBuilder sb) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < sb.length(); i++) {
            if (st.isEmpty() && sb.charAt(i) == ')')
                return false;
            if (sb.charAt(i) == '(')
                st.push('(');
            if (sb.charAt(i) == ')' && st.peek() == '(')
                st.pop();

        }

        return st.isEmpty();
    }

    private void df(List<String> ans, int size, StringBuilder sb) {

        if (sb.length() == size) {
            if (isv(sb))
                ans.add(new StringBuilder(sb).toString());
            return;
        }
        sb.append('(');
        df(ans, size,sb);
        sb.deleteCharAt(sb.length() - 1);
        sb.append(')');
        df(ans, size,sb);
        sb.deleteCharAt(sb.length() - 1);

    }

    public List<String> generateParenthesis(int n) {
        ArrayList<String> list = new ArrayList<>();
        df(list, 2*n, new StringBuilder());
        return list;
    }
}

/*
boolean valid(StringBuilder s){
        Stack <Character> st = new Stack<>();
        for(int i =0;i< s.length();i++){
            if(s.charAt(i)=='(') st.push(s.charAt(i));
            else if( !st.isEmpty() && st.peek()=='(' && s.charAt(i)==')') st.pop();
        }
        return st.isEmpty();
    }
    void swap(StringBuilder sb , int i , int j){
        char temp = sb.charAt(i);
        sb.setCharAt(i,sb.charAt(j));
        sb.setCharAt(j,temp);
    }
    void df( List<String> ans , StringBuilder s , int i){
        if(i==s.length()){
           if(valid(s)) ans.add(s.toString());
            return;}
        for(int j =i;j<s.length();j++){
            swap(s,i,j);
            df(ans,s,i+1);
            swap(s,i,j);
        }} */