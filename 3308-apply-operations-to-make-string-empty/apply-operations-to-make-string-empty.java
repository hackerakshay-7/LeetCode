class Solution {
    public String lastNonEmptyString(String s) {
        int max =0;
        int freq[]=new int[26];
        for(char a : s.toCharArray()) {freq[a-'a']++;
        max =Math.max(freq[a-'a'],max);}
        if(max==1) return s;
        StringBuilder sb = new StringBuilder();
        max-=1;
        for(int i =0;i<26;i++){ freq[i]-=max;}
        for(int i =s.length()-1;i>=0;i--){
            char c = s.charAt(i);
            if(freq[c-'a']>0){ sb.append(c); freq[c-'a']--;}
        }
        return sb.reverse().toString();
    }
}