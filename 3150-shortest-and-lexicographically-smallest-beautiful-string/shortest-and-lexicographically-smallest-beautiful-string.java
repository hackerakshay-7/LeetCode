class Solution {
    private StringBuilder compare(StringBuilder a , StringBuilder b){
        if(b.length()<a.length()) return new StringBuilder(b);
        int result = a.compareTo(b);
        if(result>0) return new StringBuilder(b);
        return new StringBuilder(a); 
    }
    public String shortestBeautifulSubstring(String s, int k) {
       StringBuilder sb = new StringBuilder();
       StringBuilder ans = new StringBuilder();
       int kcount=0;
       int j=0; boolean first=true;
      for(int i=0;i<s.length();i++){
        // expand
        sb.append(s.charAt(i));
        if(s.charAt(i)=='1') kcount++;
        // shrink
        if(kcount==k && first){ans=new StringBuilder(sb); first=false;}
        while(j<s.length() && kcount==k){
          if(ans.length()>=sb.length())  ans = compare(ans,sb);
            if(s.charAt(j)=='1') kcount--;
            sb.deleteCharAt(0);
            j++;
        }
      }

   return ans.toString(); }
}