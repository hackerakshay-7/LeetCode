class Solution {
    // private void rev(StringBuilder s){
    //     for(int i=0,j=s.length()-1;i<s.length()/2;i++,j--){
    //       char  temp=s.charAt(i);
    //         s.setCharAt(i,s.charAt(j));
    //         s.setCharAt(j,temp);
    //     }
    // }
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder("");
        for(char a : s.toCharArray()){
            if(a>='a' && a<='z') sb.append(a);
            else if(a=='*' && sb.length()>0) sb.deleteCharAt(sb.length()-1);
            else if(a=='#') sb.append(sb);
            else{sb.reverse();}

        }
    return sb.toString();}
}