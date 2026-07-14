class Solution {
    private void df(List<String> ans, int open ,StringBuilder sb, int close , int n) {
        if (sb.length() == 2*n) {
                ans.add(new StringBuilder(sb).toString());
            return;
        }
        if(open<n){
        sb.append('(');
        df(ans,open+1,sb,close,n);
        sb.deleteCharAt(sb.length() - 1);}
        if(close<open){
        sb.append(')');
        df(ans,open,sb,close+1,n);
        sb.deleteCharAt(sb.length() - 1);}

    }

    public List<String> generateParenthesis(int n) {
        ArrayList<String> list = new ArrayList<>();
        df(list, 0, new StringBuilder(),0,n);
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