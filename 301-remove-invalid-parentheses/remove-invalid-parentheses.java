class Solution {
    Set<String> set;
    private void dfs(String s, int i, int count, int max, StringBuilder temp) {
        if (count < 0)
            return;
        if (i == s.length() && temp.length() == max && count == 0)
            set.add(new String(temp));
       if (i == s.length())
            return;
        if (s.charAt(i) == '('){
             temp.append('(');
            dfs(s, i + 1, count + 1, max,temp);
            temp.deleteCharAt(temp.length()-1);
            dfs(s,i+1,count,max,temp);
            }
        else if (s.charAt(i) == ')'){
             temp.append(')');
            dfs(s, i + 1, count - 1, max,temp);
             temp.deleteCharAt(temp.length()-1);
            dfs(s,i+1,count,max,temp);
            }
        else {
            temp.append(s.charAt(i));
            dfs(s, i + 1, count, max,temp);
             temp.deleteCharAt(temp.length()-1);
        }
    }

    public List<String> removeInvalidParentheses(String s) {
        set = new HashSet<>();
        int balance = 0;
        int remove = 0;

        for (char a : s.toCharArray()) {
            if (a == '(') {
                balance++;
            }
            else if (a == ')') {
                if (balance > 0)
                    balance--;
                else
                    remove++;
            }
        }

        remove += balance;

        int targetLength = s.length() - remove;
        dfs(s, 0, 0,targetLength, new StringBuilder());
        ArrayList<String> ans = new ArrayList<>();
        for(String a : set){
            ans.add(a);
        }
        //if(ans.size()==0) ans.add("");

   return ans; }
}