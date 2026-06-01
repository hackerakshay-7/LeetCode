class Solution {
    public String addSpaces(String s, int[] spaces) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(spaces.length+ n);
        int k = spaces.length;
        int j =0;
        for(int i =0;i<n;i++){
            if(j<k && spaces[j]==i) {sb.append(' ');j++;}
            sb.append(s.charAt(i));
        }
   return sb.toString(); }
}