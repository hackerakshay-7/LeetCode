class Solution {
    public int passwordStrength(String password) {
        int ans =0;
        HashSet<Character> set = new HashSet<>();
        for(char a : password.toCharArray()){
            if(set.contains(a)) continue;
            set.add(a);
            if(a>='a' && a <='z') ans++;
            else if(a>='A' && a<='Z') ans+=2;
            else if ( a>='0' && a<='9') ans+=3;
            else{ans+=5;}
        }
   return ans; }
}