class Solution {
    public String maximumXor(String s, String t) {
        StringBuilder ans= new StringBuilder();
        int one =0;
        for( char a : t.toCharArray()){
            if(a=='1') one++;}
            int zero=t.length()-one;
        for(char a : s.toCharArray()){
            if(a=='0' && one>0){
                ans.append("1");
                one--;
            }
            else if(a=='1' && zero>0){ans.append("1");zero--;}
            else{ans.append("0");}
        }
   return ans.toString(); }
}