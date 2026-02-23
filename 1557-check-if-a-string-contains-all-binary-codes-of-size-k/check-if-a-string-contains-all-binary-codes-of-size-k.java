class Solution {
    public boolean hasAllCodes(String s, int k) {
     //  if(s.length()<Math.pow(2,k)) return false;
     HashSet<String> set = new HashSet<>();
     String sb ="";
     for( int i=0;i<s.length();i++){
        sb+=s.charAt(i);
        if(sb.length()==k) break;
        }
        int i=k;
        set.add(sb);
   while(i<s.length()){
        sb+=s.charAt(i);
        sb=sb.substring(1);
        set.add(sb);
        i++;
   }

    return set.size()>=Math.pow(2,k)?true:false;}
}