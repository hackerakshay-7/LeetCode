class Solution {
    public String reverseWords(String s) {
       StringBuilder ans = new StringBuilder(s.length());
       StringBuilder temp = new StringBuilder();
       for(int i =s.length()-1;i>=0;i--){
            if(s.charAt(i)==' ' && temp.length()>0) {ans.append(temp.reverse()); temp.setLength(0);
            ans.append(' ');}
           if(s.charAt(i)!=' ') temp.append(s.charAt(i));
       }
       ans.append(temp.reverse());
       int k =ans.length()-1;
       while(ans.charAt(k)==' ' && k>=0) ans.deleteCharAt(k--);
  return ans.toString();  }
}