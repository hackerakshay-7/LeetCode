class Solution {
    public String smallestPalindrome(String s) {
        TreeMap<Character,Integer> map = new TreeMap<>();
        for(char a : s.toCharArray()){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        char mid= '1';
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character,Integer> pair:map.entrySet()){
            if(pair.getValue()%2==1) mid = pair.getKey();
            for(int i =0;i<pair.getValue()/2;i++){
                sb.append(pair.getKey());
            }
        }
        StringBuilder sc = new StringBuilder(sb);
        // String g = sb.reverse().toString();
        if(mid!='1') sc.append(mid);
       sc.append(sb.reverse());
        return sc.toString();
    }
}