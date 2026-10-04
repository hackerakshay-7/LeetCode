class Solution {
     Boolean dp[][];
    private boolean rec(String s , int count , int i){
        if(count<0) return false;
        if(i==s.length()) return count==0;
        if(dp[count][i]!=null) return dp[count][i];
        boolean ans;
        if(s.charAt(i)=='('){
           ans= rec(s,count+1,i+1);
        }
        else if(s.charAt(i)==')'){ 
           ans= rec(s,count-1,i+1);
        }
        else{
           ans= rec(s,count,i+1)|| rec(s,count+1,i+1) || rec(s,count-1,i+1);
        }
        return dp[count][i] =ans;
    }
    public boolean checkValidString(String s) {
        dp = new Boolean[s.length()+1][s.length()];
        return rec(s,0,0);
      }
}

/**
 Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (!st.isEmpty()) {
                if (ch == ')' && (st.peek() == '*' || st.peek() == '(')) {
                    {
                        st.pop();
                    }
                } else if (st.peek() == '(' && ch == '*') {
                    st.pop();
                }
                else{ st.push(ch);}
            }
           else{ st.push(ch);}
        }
        while (!st.isEmpty() && st.peek() == '*') {
            st.pop();
        }
        return st.isEmpty();s */

        /**
         int count=0,
            neutral=0;
            for(char a : s.toCharArray()){
                if(a=='(') count++;
                else if(a==')') count--;
                else if(a=='*') neutral++;
                if(count<0 && neutral<=0) return false;
                if(count<0 && neutral>0) {neutral--; count++;}
            }
    return count==0; */